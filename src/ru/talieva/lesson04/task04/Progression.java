package ru.talieva.lesson04.task04;
import java.util.Scanner;

/** Вывод арифметической или геометрической прогрессии по заданным параметрам*/
public class Progression {
    private static double first; /*первый член прогрессии */
    private static double diff; /*коэффициент/разность прогрессии*/
    private static int N; /*количество членов прогрессии для вывода*/

    private static void getArithmetic (){ /* метод для вывода арифметической прогрессии по заданным параметрам*/
        for (int i = 0; i<N; i++) System.out.println((first+i*diff)+" ");
    }
    private static void getGeometric (){ /* метод для вывода геометрической прогрессии по заданным параметрам*/
        System.out.println(first);
        for (int i = 1; i<N; i++) System.out.println((first*Math.pow(diff, i)));
    }
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in); /*инициализация сканера*/
        System.out.println("Добро пожаловать! Выведу прогрессию на любой вкус. :)");
        System.out.println("Введите первый член прогрессии.");
        first = in.nextDouble();
        System.out.println("Введите количество членов прогрессии для вывода.");
        N = in.nextInt();
        System.out.println("Геометрическая или арифметическая прогрессия? Введите А или Г.");
        String type = in.nextLine();  /* для выбора типа прогрессии*/
        type = type.toLowerCase();
        switch (type) { /*ветвление на геометрическую и арифметическую*/
            case "а": {
                System.out.println("Введите разность прогрессии.");
                diff = in.nextDouble();
                System.out.println("Ваша прогрессия:");
                getArithmetic();
                break;
            }
            case "г": {
                System.out.println("Введите коэффициент прогрессии.");
                diff = in.nextDouble();
                System.out.println("Ваша прогрессия:");
                getGeometric();
                break;
            }

            default: System.out.println("Нет такого типа. Конец.");
        }
    }
}