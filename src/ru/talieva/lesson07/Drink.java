package ru.talieva.lesson07;

import org.apache.log4j.Logger;

/**
 * Класс с вариантами напитков для вендинга
 **/
public enum Drink {
    COLD_TEA("Холодный чай", 80),
    STILL_WATER("Вода без газа", 60),
    SPARKLING_WATER("Минеральная вода", 70),
    JUICE("Сок", 100),
    PEPSI("Пепси", 120),
    MIRINDA("Миринда", 120),
    SEVEN_UP("7UP", 120),
    RED_BULL("RED BULL", 150);

    private String title;
    private int price;
    private static final Logger logger = Logger.getLogger(ClientApp.class);

    /**
     * Конструктор для Drink
     *
     * @param title - название напитка на русском
     * @param price - цена напитка
     */
    Drink(String title, int price) {
        this.title = title;
        this.price = price;
    }

    /**
     * Метод для вывода на экран списка существующих напитков
     */
    public static void getAssortment() {
        logger.info("Запущен метод getAssortment.");
        int count = 1;
        for (Drink i : Drink.values()) {
            System.out.println(count + ". " + i);
            count++;
        }
        System.out.println("*********************************************");
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}
