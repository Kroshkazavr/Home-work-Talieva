package ru.talieva.lesson21.task01;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ru.talieva.lesson21.task02.ArrayRevers.makeRandomArray;
import static ru.talieva.lesson21.task02.ArrayRevers.printMyArray;

/**
 * Дан двумерный массив. Задача – написать метод
 * public void toLeft() {}
 * 1.Пройти с 1-ой до последней строки
 * 2.Пройти с 1-го до предпоследнего элемента
 * 3.В текущую ячейку поместить значение следующей
 * 4.Последнему элементу присвоить 0.
 **/

public class ArrayLeft {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в Двумерные массивы. Массив будет заполнен с помощью рандома.");
        System.out.println("Введите количество столбцов в массиве.");
        Scanner in = new Scanner(System.in);
        try {
            int numberColumns = in.nextInt(); // Количество столбцов в массиве
            System.out.println("Введите количество строк в массиве.");
            int numberCells = in.nextInt(); // Количество строк в массиве
            int[][] arrRandom = new int[numberCells][numberColumns];
            make2DRandomArray(arrRandom);
            System.out.println("Исходный массив: ");
            print2DArray(arrRandom);
            toLeft(arrRandom);
            System.out.println("Все элементы массива сдвинуты влево, с добавлением 0 в последней ячейке: ");
            print2DArray(arrRandom);
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: Введено отрицательное количество элементов.");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено нецелое количество элементов.");
        }

    }

    /**
     * метод заполнения 2мерного массива рандомными элементами (0-100)
     *
     * @param arr массив для рандомного заполнения
     */
    private static void make2DRandomArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = makeRandomArray(arr[i]);
        }
    }

    /**
     * метод выводит элементы массива в консоль через пробел как таблицу
     *
     * @param arr массив для вывода в консоль
     */
    private static void print2DArray(int[][] arr) {
        System.out.println("..............................................................................");
        for (int[] ints : arr) {
            printMyArray(ints);
        }
        System.out.println("..............................................................................");
    }

    /**
     * метод для преобразования массива: Все элементы массива сдвинуты влево, с добавлением 0 в последней ячейке.
     *
     * @param arr преобразуемый массив
     */
    private static void toLeft(int[][] arr) {
        System.out.println("Преобразуем массив.");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j != arr[i].length - 1) {
                    arr[i][j] = arr[i][j + 1];
                } else {
                    arr[i][j] = 0;
                }
            }
        }
    }
}
