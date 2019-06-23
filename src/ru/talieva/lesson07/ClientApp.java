package ru.talieva.lesson07;

import org.apache.log4j.Logger;
import java.util.Arrays;
import java.util.Scanner;

import static ru.talieva.lesson07.Vending.readINT;

/**
 * !!! UPD внедрено логирование Log4j(Lesson 14)!!!
 * Эмулятор взаимодействия с вендингом
 * 1. процедура заполнения вендинга пользователем (с проверкой корректности номера напитка)
 * 2. запуск вендинга в бесконечном цикле с возможностью выйти по жеданию пользователя после выдачи напитка
 **/
public class ClientApp {

    private static final Logger logger = Logger.getLogger(ClientApp.class);
    public static void main(String[] args) {
        logger.info("Запущена программа для эмуляции вендинга.");
        System.out.println("Заполните вендинг. Возможные варианты напитков: ");
        Drink.getAssortment();
        Vending vendMachine = new Vending(5); // Создаем вендинг по конструктору
        System.out.println("В вендинге свободно " + vendMachine.getCellsCount() + " ячеек.");
        if (Arrays.toString(vendMachine.getDrinks()).contains("null")) { // процедура заполнения вендинга. Повторять,
            logger.info("Старт процедуры заполнения вендинга.");         // пока есть нулевые элементы в массиве
            int counter = 0;
            while (counter <= vendMachine.getCellsCount() - 1) {
                System.out.println("Наберите номер напитка для загрузки.");
                int item = readINT(); // Номер напитка для загрузки вендинга
                if (item <= 8 & item >= 1) {
                    vendMachine.makeDrinks(item, counter);
                    counter++;
                } else {
                    System.out.println("Ошибка ввода номера напитка. Повторите ввод:");
                    logger.warn("Ошибка выбора номера напитка пользоваиелем (номер не существует).");
                }
            }
        }
        logger.info("Финиш процедуры заполнения вендинга.");
        System.out.println("*********************************************");
        boolean proceed = true; // запускаем вендинг run, пока proceed не станет false
        while (proceed) {
            Scanner in = new Scanner(System.in);
            vendMachine.run(); // запуск вендинга
            System.out.println("Может быть еще один напиток? Введите нет/no, если не желаете продолжать или любой " +
                    "символ для продолжения. )");
            String answer = in.nextLine().toLowerCase();
            if (answer.equals("нет") || answer.equals("no")) { // проверяем ответ полдьзователя, выходим их программы,
                logger.info("Выход из программы по инициативе пользователя"); // результатам сравнения
                proceed = false; // если пользователь хочет выйти, то меняем значение proceed
            }
        }
        System.out.println("Пока!");
    }
}
