package ru.talieva.lesson07;

import java.util.Scanner;

/**
 * Эмулятор вендинга
 **/
public class Vending {

    private Drink[] drinks; // Массив напитков
    private int cellsCount; // Количество ячеек в вендинге

    /**
     * Конструктор, который создает массив напитков для вендинга в момент создания объекта вендинг
     *
     * @param cellsCount - количество ячеек для загрузки напитков в вендинг
     */
    Vending(int cellsCount) {
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

    /**
     * Метод имитирующий работу вендинга:
     * 1. показать витрину,
     * 2. принять деньги,
     * 3. запросить желаемый напиток
     * 4. проверить, хватает ли денег на покупку, если нет, то просить дополнительные до необходимой суммы
     * 5. выдать напиток
     * 6. выдать сдачу, если денег дали больше, чем нужно.
     */
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

    /**
     * метод для выбора пользователем напитка (с проверкой на корректность запроса)
     *
     * @return номер напитка на ветрине
     */
    private int selectDrink() {
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

    /**
     * метод для внесения пользователем денег (с проверкой на положительность)
     *
     * @return внесённые средства
     */
    private int inputCash() {
        System.out.println("Внесите деньги:");
        Scanner in = new Scanner(System.in);
        int money = in.nextInt(); // внесенные средства
        while (money < 0) {
            System.out.println("Нельзя внести отрицательную сумму:");
            money = in.nextInt();
        }
        return money;
    }

    /**
     * метод для выврда витрины загруженного вендинга
     */
    private void printDrinks() {
        for (int i = 0; i < drinks.length; i++) {
            System.out.println((i + 1) + ". " + drinks[i].getTitle() + ". Цена: " + drinks[i].getPrice());
        }
    }

    /**
     * метод для заполнения витрины вендинга напитками
     *
     * @param item номер существующего напитка
     * @param i    индекс в массиве напитков вендинга
     */
    void makeDrinks(int item, int i) {
        Drink drink = Drink.values()[item - 1];
        drinks[i] = drink;
        System.out.println("Для ячейки №" + (i + 1) + " выбран напиток " + drink.getTitle());
    }
}

