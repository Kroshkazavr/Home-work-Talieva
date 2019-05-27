package ru.talieva.lesson07;

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

    private String title; // Название напитка на русском
    private int price; // Цена напитка

    Drink(String title, int price) { // Конструктор для Drink
        this.title = title;
        this.price = price;
    }

    public static void getAssortment() { //Вывод на экран списка возможных напитков
        int count = 1;
        for (Drink i : Drink.values()) {
            System.out.println(count + ". " + i);
            count++;
        }
        System.out.println("*********************************************");
    }

    public String getTitle() { // Возвращает название напитка на русском
        return title;
    } // Возвращает название напитка на русском

    public int getPrice() { // Возвращает цену напитка
        return price;
    } // Возвращает цену напитка
}
