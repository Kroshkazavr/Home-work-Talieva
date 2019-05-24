package ru.talieva.lesson13.task01;

import java.util.Scanner;

/**
 * Программа "воспитанный ребенок".
 * Программа имитирует поведение воспитанного ребенка, которого мама кормит вкусной или невкусной едой.
 * Главный класс и метод main - это «Мама». «Мама» дает ребенку «еду» и обрабатывает исключения ребенка.
 **/

public class Main {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать на кухню, МАМА!");
        System.out.println("*********************************************");
        System.out.println("Твой малыш любит есть:");
        Food.printFood();
        System.out.println("*********************************************");
        Child baby = new Child();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(">>>Напиши, чем ты хочешь покормить малыша? Для выхода из кухни, набери EXIT.");
            String food = in.nextLine();
            if (food.equalsIgnoreCase("EXIT")) {
                break;
            } else {
                try {
                    baby.eat(food.toUpperCase());
                } catch (IllegalArgumentException ex) {
                    System.out.println(">>>Малыш все выплюнул. Попробуем снова.");
                }
            }
        }
        System.out.println("Пока.");
    }
}

