package ru.talieva.lesson21.task02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Задача: Имеется массив, нужно переставить элементы массива в обратном порядке.
 * Вывести массив в консоль до и после вызова метода по реверсу массива
 **/

public class ArrayRevers {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в ArrayRevers. ");
        System.out.println("Ваш массив будет заполнен с помощью рандома, а затем развернут в обратном порядке.");
        System.out.println("Введите количество элементов в массиве.");
        Scanner in = new Scanner(System.in);
        try {
            int number = in.nextInt(); // Количество элементов в массиве
            int[] arrRandom = new int[number];
            System.out.println("Заполняем массив.");
            System.out.println("..............................................................................");
            makeRandomArray(arrRandom);
            System.out.println("Исходный массив: ");
            printMyArray(arrRandom);
            makeRevers(arrRandom);
            System.out.println("Перевернутый массив: ");
            printMyArray(arrRandom);
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: Введено отрицательное количество элементов.");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено нецелое количество элементов.");
        }
    }

    /**
     * метод выводит элементы массива в консоль в одну строку через пробел
     *
     * @param arr массив для вывода в консоль
     */
    public static void printMyArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    /**
     * метод ля переставления символов в обратном порядке
     *
     * @param arr массив для переставления символов в обратном порядке
     */
    private static void makeRevers(int[] arr) {
        for (int i = 0; i < ((arr.length) / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    /**
     * метод заполнения массива рандомными элементами (0-100)
     *
     * @param arr массив для рандомного заполнения
     */
    public static int[] makeRandomArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
}
