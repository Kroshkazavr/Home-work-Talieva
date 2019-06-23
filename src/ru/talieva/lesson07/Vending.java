package ru.talieva.lesson07;

import org.apache.log4j.Logger;
import java.util.Scanner;

/**
 * Эмулятор вендинга
 **/
public class Vending {

    private Drink[] drinks; // Массив напитков
    private int cellsCount; // Количество ячеек в вендинге
    private static final Logger logger = Logger.getLogger(ClientApp.class);

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
     * метод для проверки введенных пользователем данных на "не цифры" + проверка на положительность
     *
     * @return int, если были введены только цифры
     */
    static int readINT() {
        logger.info("Запущен метод readINT");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        while (!str.matches("[0-9]+")) { // проверяем, что введены только цифры, если нет, то запрашиваем снова
            logger.warn("Пользователь вводит нецифровое или отрицательное значение.");
            System.out.println("Вы ввели нецифровое или отрицательное значение. Повторите ввод:");
            str = in.nextLine();
        }
        return Integer.parseInt(str);
    }

    /**
     * Метод имитирующий работу вендинга:
     * 1. показать витрину,
     * 2. принять деньги,
     * 3. запросить желаемый напиток
     * 4. проверить, хватает ли денег на покупку, если нет, то просить дополнительные до необходимой суммы
     * 5. выдать напиток
     * 6. выдать сдачу, если денег дали больше, чем нужно.
     * 7. проверить, что пользователь вводит только цифры
     */
    void run() {
        logger.info("Вендинг запущен.");
        System.out.println("Витрина вендинга:");
        printDrinks();
        System.out.println("*********************************************");
        int money = inputCash(); // Внесенные деньги
        int item = selectDrink(); // Выбранный напиток
        while (money < drinks[item - 1].getPrice()) { // цикл на проверку достаточности средств и довнесения
            logger.warn("У пользователя недостаточно внесенных средств на покупку.");
            System.out.println("Недостаточно средств.");
            money = money + inputCash();
            System.out.println(">>>Вы внесли на счет: " + money);
        }
        logger.info("У пользователя достаточно средств на покупку.");
        System.out.println("Получите Ваш напиток: " + drinks[item - 1].getTitle());
        logger.info("Пользователь получил напиток.");
        if (money > drinks[item - 1].getPrice()) // подсчет сдачи
            System.out.println("Ваша сдача " + (money - drinks[item - 1].getPrice()) + "руб.");
        logger.info("Вендинг закончил цикл работы.");
    }

    /**
     * метод для выбора пользователем напитка (с проверкой на корректность запроса)
     *
     * @return номер напитка на ветрине
     */
    private int selectDrink() {
        logger.info("Запущен метод selectDrink.");
        System.out.println("Введите номер ячейки с напитком:");
        int item = readINT();
        while ((item < 1) || (item > drinks.length)) {
            logger.warn("Ошибка выбора номера напитка пользователем (номер не существует).");
            System.out.println("Неверный номер напитка. Введите номер ячейки с напитком:");
            item = readINT();
        }
        System.out.println(">>>Вы выбрали: " + drinks[item - 1].getTitle());
        logger.info("Закончен метод selectDrink.");
        return item;
    }

    /**
     * метод для внесения пользователем денег
     *
     * @return внесённые средства
     */
    private int inputCash() {
        logger.info("Запущен метод inputCash");
        System.out.println("Внесите деньги:");
        return readINT();
    }

    /**
     * метод для вывода витрины загруженного вендинга
     */
    private void printDrinks() {
        logger.info("Запущен метод printDrinks");
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
        logger.info("Запущен метод makeDrinks");
        Drink drink = Drink.values()[item - 1];
        drinks[i] = drink;
        System.out.println("Для ячейки №" + (i + 1) + " выбран напиток " + drink.getTitle());
    }
}

