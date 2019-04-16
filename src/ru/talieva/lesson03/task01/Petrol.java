package ru.talieva.lesson03.task01;

import java.util.Scanner;

/** Класс, который считает стоимость покупки бензина + ввод данных с клавиатуры*/
public class Petrol {
    private static double price; /* стоимость одного литра бензина*/
    private static double quantity; /* количство литров бензина в покупке*/

    private static double getCost (){ /* метод для расчета стоимости покупки*/
        return price*quantity; /* стоимость покупки*/
    }
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in); /*инициализация сканера*/
        System.out.println("Введите стоимость одного литра бензина.");
        price =in.nextDouble(); /*ввод цены с клавиатуры */
        System.out.println("Введите желаемое количество литров бензина.");
        quantity =in.nextDouble(); /*ввод литража с клавиатуры */
        System.out.println("Сумма покупки составит: " + getCost());
    }
}