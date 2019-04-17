package ru.talieva.lesson04.task01;

import java.util.Scanner;

/** Класс, который находит Минимальное из 2-х чисел*/
public class FindMinMax {
    private static int first; /*первое число */
    private static int second; /*второе число */

    private static int getMin (){ /* метод для поиска Минимального числа*/
        if (first<second) return first;
        else return second;
    }
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in); /*инициализация сканера*/
        System.out.println("Добро пожаловать в программу по поиску минильного из 2-х натуральных чисел!");
        System.out.println("Введите первое число.");
        first = in.nextInt(); /*ввод первого числа с клавиатуры */
        System.out.println("Введите второе число.");
        second = in.nextInt(); /*ввод второго числа с клавиатуры */
        if (first != second) {
            System.out.println("Минимальное число: " + getMin() + ".");
        }
        else System.out.println("Числа равны.");
    }
}
