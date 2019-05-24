package ru.talieva.lesson13.task01;

/**
 * Перечисление «Еда» с несколькими вариантами еды.
 **/

public enum Food {
    CANDY, APPLE, BURGER, PASTA, MEATBALLS, PIZZA, CHICKEN, PIE, PANCAKES, MILK, POTATO;

    public static void printFood() { //Вывод на экран списка еды
        for (Food i : Food.values()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
