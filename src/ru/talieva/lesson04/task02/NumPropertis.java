package ru.talieva.lesson04.task02;
import java.util.Scanner;

/** Описывает число: положительное или отрицательно, четное или нечетное*/
public class NumPropertis {
    private static int num; /*Число пользователя */

    public static void main (String [] args) {
        Scanner in = new Scanner (System.in); /*инициализация сканера*/
        System.out.println("Введите целое число.");
        num = in.nextInt(); /*ввод числа с клавиатуры */
        if (num != 0) {
            if (num %2 == 0) System.out.println("Ваше число четное."); /*проверка на четность */
            else System.out.println("Ваше число нечетное.");
            if (num > 0) System.out.println("Ваше число положительное."); /*проверка на положительность */
            else System.out.println("Ваше число отрицательное.");
            }
        else System.out.println("Вы ввели 0. Конец."); /* Если введен 0. */
    }
}
