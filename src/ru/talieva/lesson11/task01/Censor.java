package ru.talieva.lesson11.task01;

import java.util.Scanner;

/**
 * Программа получает на вход некую строку , после она вызывает метод,
 * заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой» и выводит результат в консоль
 * Учтена возможность замены символов в «бяка» при написании на латинские + учет регистра
 */
public class Censor {

    private static String getCensored(String str) {
        return str.replaceAll("(?:б|Б|b|B|)(?:я|Я|ay|y)(?:k|K|К|к)(?:A|a|А|а)",
                "*вырезано_цензурой*");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Добро пожаловать! Выведу любую последовательность символов.");
        String str = in.nextLine();
        System.out.println("Ваша строка преобразована: " + Censor.getCensored(str));
    }
}
