package ru.talieva.lesson07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Эмулятор вендинга
 **/
public class Vending {

    private Drink[] drinks; // Массив напитков
    private int cellsCount; // Количество ячеек в вендинге

    Vending(int cellsCount)  //конструктор, который создает массив напитков для вендинга в момент создани
    // объекта вендинг
    {
        this.drinks = new Drink[cellsCount];
        this.cellsCount = cellsCount;
    }

    Drink[] getDrinks() {
        return drinks;
    }

    int getCellsCount() {
        return cellsCount;
    }

    public void setCellsCount(int cellsCount) {
        this.cellsCount = cellsCount;
    }

    void run() {

        System.out.println("Витрина вендинга:");
        printDrinks();
        System.out.println("*********************************************");
        int money = inputCash(); // Внесенные деньги
        int item = selectDrink(); // Выбранный напиток
        Scanner in = new Scanner(System.in);
        while (money < drinks[item - 1].getPrice()) { // цикл на проверку достаточности средств и довнесения
            System.out.println("Недостаточно средств. Внесите дополнительные деньги:");
            money = money + in.nextInt();
            System.out.println(">>>Вы внесли на счет: " + money);
        }
        System.out.println("Получите Ваш напиток: " + drinks[item - 1].getTitle());
        if (money > drinks[item - 1].getPrice()) // подсчет сдачи
            System.out.println("Ваша сдача " + (money - drinks[item - 1].getPrice()) + "руб.");
    }

    private int selectDrink() { // метод для выбора напитка с проверками
        System.out.println("Введите номер ячейки с напитком:");
        Scanner in = new Scanner(System.in);
        int item = in.nextInt(); // номер ячейки с напитком
        while ((item < 1) || (item > drinks.length)) {
            System.out.println("Неверный номер напитка. Введите номер ячейки с напитком:");
            item = in.nextInt();
        }
        System.out.println(">>>Вы выбрали: " + drinks[item - 1].getTitle());
        return item;
    }

    private int inputCash() { // метод для внесения денег
        System.out.println("Внесите деньги:");
        Scanner in = new Scanner(System.in);
        return in.nextInt(); // внесённые средства
    }

    void printDrinks() { // метод вывода витрины загруженного вендинга
        for (int i = 0; i < drinks.length; i++) {
            System.out.println((i + 1) + ". " + drinks[i].getTitle() + ". Цена: " + drinks[i].getPrice());
        }
    }

    void makeDrinks(int item, int i) {  //Заполняем вендинг напитками
        Drink drink = Drink.values()[item - 1];
        drinks[i] = drink;
        System.out.println("Для ячейки №" + (i + 1) + " выбран напиток " + drink.getTitle());
    }
}

