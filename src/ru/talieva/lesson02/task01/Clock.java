package ru.talieva.lesson02.task01;

/** Класс, который переводит секунды в часы */
public class Clock {
    public static int seconds = 3600; /*секунды*/
    final static int SECONDS_PER_HOUR = 60*60; /* секунд в одном часу*/
    public static double hours; /* результат перевода секунд в часы*/

    private static double convertSecToHours (){ /* ковертор секунды - часы*/
        hours = seconds/SECONDS_PER_HOUR;
        return hours;
    }
    public static void main (String [] args) {
        System.out.println("Результат перевода секунд в часы: " + convertSecToHours());
    }
}
