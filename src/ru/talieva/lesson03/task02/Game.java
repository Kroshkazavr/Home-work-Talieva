package ru.talieva.lesson03.task02;

import java.util.Random;
import java.util.Scanner;

/** Игра "Горячо - Холодно" с выходом по стоп-слову 911 или отгаданому числу*/
public class Game {
    public static int enigma; /* загаданное число от 1 до 100*/
    public static int guess = 101; /* догадка пользователя, для входа в цикл первое значение больше диапазона рандома*/
    public static int diff_Min; /* минимальная разница между загаданным числом и предположением*/
    public static int diff; /* разница между загаданным числом и предположением*/

    ///private static int getAnswer () { /* метод для вычисления разницы и вывода "Горячо" или "Холодно"*/
    ///    diff = Math.abs(enigma - guess); /* Разница по модулю*/
    ///    if (diff_Min >= diff) {
    ///       diff_Min = diff;
    ///       System.out.println("Горячо! Поробуй еще раз.");
    ///   }
    ///    else System.out.println("Холодно!:( Поробуй еще раз.");
    ///   return diff_Min;
    ///}

    public static void main (String [] args) {
        Random rand = new Random(); /*инициализация рандома*/
        enigma = rand.nextInt(100);
        diff_Min = enigma;
        Scanner in = new Scanner(System.in); /*инициализация сканера*/
        System.out.println("Добро пожаловать в игру Горячо - Холодно! Для выхода набери 911.");
        System.out.println("Компьютер загадал чило от 1 до 100. Угадай, какое?");
        while (true){
            guess = in.nextInt();/*ввод предположения пользователя в цикле*/
            diff = Math.abs(enigma - guess); /* Разница по модулю*/
            if (guess == 911 ) { /* Проверка на выход по стоп-слову*/
                System.out.println("Игра окончена! Компьютер загадал "+enigma);
                break;
                }
            else {
                if (diff == 0) {
                    System.out.println("Ты угадал! Компьютер загадал число " + enigma);
                    break;
                    }
                ///System.out.println(diff);
                ///getAnswer(); /* Вывод слов Горячо-Холодно*/
                ///System.out.println(diff_Min);
                else
                    if (diff_Min >= diff) {
                        diff_Min = diff;
                        System.out.println("Горячо! Поробуй еще раз.");
                        }
                    else System.out.println("Холодно!:( Поробуй еще раз.");
            }
        }

    }
}
