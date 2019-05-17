package ru.talieva.lesson07;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Эмулятор взаимодействия с вендингом
 **/
public class ClientApp {
    private static int item; // Номер напитка для загрузки вендинга
    //Пользователь не внес деньги
    //Пользователь выбрал более дорогой напиток, чем внесено денег
    //Пользователь выбрал несуществующий номер напитка
    private static int counter = 1; // счетчик для загрузки

    public static void main(String[] args) {
        System.out.println("Заполните вендинг. Возможные варианты напитков: ");
        Drink.getAssortment();
        Vending vendMachine = new Vending(); // Создаем вендинг
        Drink[] drinks = new Drink[Vending.NUMBER_OF_ITEMS];
        System.out.println("В вендинге свободно " + Vending.NUMBER_OF_ITEMS + " ячеек.");
        if (Arrays.toString(drinks).contains("null")) {
            while (counter <= Vending.NUMBER_OF_ITEMS) {
                System.out.println("Наберите номер напитка для загрузки.");
                Scanner in = new Scanner(System.in);
                item = in.nextInt();
                if (item <= 8 & item >= 1) {
                    Vending.makeDrinks(drinks, item, counter);
                    counter++;
                } else {
                    System.out.println("Ошибка ввода номера напитка. Повторите ввод:");
                }
            }
        }
        vendMachine.setDrinks(drinks);
        Vending.printDrinks(vendMachine.getDrinks());
    }
}
