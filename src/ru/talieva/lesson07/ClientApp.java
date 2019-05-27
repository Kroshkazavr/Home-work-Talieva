package ru.talieva.lesson07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Эмулятор взаимодействия с вендингом
 * 1. процедура заполнения вендинга пользователем (с проверкой корректности номера напитка)
 * 2. запуск вендинга в бесконечном цикле с возможностью выйти по жеданию пользователя после выдачи напитка
 **/
public class ClientApp {

    public static void main(String[] args) {
        System.out.println("Заполните вендинг. Возможные варианты напитков: ");
        Drink.getAssortment();
        Vending vendMachine = new Vending(5); // Создаем вендинг по конструктору
        System.out.println("В вендинге свободно " + vendMachine.getCellsCount() + " ячеек.");
        if (Arrays.toString(vendMachine.getDrinks()).contains("null")) { // процедура заполнения вендинга
            int counter = 0;
            while (counter <= vendMachine.getCellsCount() - 1) {
                System.out.println("Наберите номер напитка для загрузки.");
                Scanner in = new Scanner(System.in);
                int item = in.nextInt(); // Номер напитка для загрузки вендинга
                if (item <= 8 & item >= 1) {
                    vendMachine.makeDrinks(item, counter);
                    counter++;
                } else {
                    System.out.println("Ошибка ввода номера напитка. Повторите ввод:");
                }
            }
        }
        System.out.println("*********************************************");
        boolean proceed = true;
        while (proceed) {
            Scanner in = new Scanner(System.in);
            vendMachine.run(); // запуск вендинга
            System.out.println("Желаете купить еще один напиток? (да/нет или yes/no)");
            String answer = in.nextLine().toLowerCase();
            if (answer.equals("нет") || answer.equals("no"))
                proceed = false;
        }
        System.out.println("Пока!");
    }
}
