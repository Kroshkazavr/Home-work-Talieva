package ru.talieva.lesson03.task01;

import java.util.Scanner;

/** Класс, который переводит секунды в часы + ввод данных с клавиатуры */
public class Clock {
    private final static int SECONDS_PER_HOUR = 60*60; /* секунд в одном часу*/
    private static double seconds; /*секунды*/

    private static double convertSecToHours (){ /* ковертор секунды - часы*/
        return seconds/SECONDS_PER_HOUR; /* результат перевода секунд в часы*/
    }
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in); /*инициализация сканера*/
        System.out.println("Введите секунды для конвертации в часы.");
        seconds =in.nextDouble();/*ввод данных с клавиатуры*/
        System.out.println("Результат перевода секунд в часы: " + convertSecToHours());
    }
}
