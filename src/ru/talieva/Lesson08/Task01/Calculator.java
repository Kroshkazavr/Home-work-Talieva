package ru.talieva.Lesson08.Task01;

import java.util.Scanner;

/** класс Calculator, который содержит статические методы для операций вычитания:
 * сложения, умножения, деления и взятия процента от числа.
 * Класс работает как с целыми числами, так и с дробями**/
public class Calculator {
    private static int intResult; // результат на int
    private static double doubleResult; // результат на double

    private static int getResult(int leftOperand, String operation, int rightOperand) {
        switch (operation) { //ветвление на операции для int
            case "+": {
                intResult = leftOperand + rightOperand;
                break;
            }
            case "-": {
                intResult = leftOperand - rightOperand;
                break;
            }
            case "*": {
                intResult = leftOperand * rightOperand;
                break;
            }
            case "/": {
                intResult = leftOperand / rightOperand;
                break;
            }
            case "%": {
                intResult = (leftOperand * rightOperand) / 100;
                break;
            }
            default:
                System.out.println("Ошибка операции.");
        }
        return intResult;
    }
    private static double getResult(double leftOperand, String operation, double rightOperand) {
        switch (operation) { //ветвление на операции для double

            case "-": {
                doubleResult = leftOperand - rightOperand;
                break;
            }
            case "+": {
                doubleResult = leftOperand + rightOperand;
                break;
            }
            case "*": {
                doubleResult = leftOperand * rightOperand;
                break;
            }
            case "/": {
                doubleResult = leftOperand / rightOperand;
                break;
            }
            case "%": {
                doubleResult = (leftOperand * rightOperand) / 100;
                break;
            }
            default:
                System.out.println("Ошибка операции.");
        }
        return doubleResult;
    }

    public static void main (String [] args) {
        System.out.println("Добро пожаловать в калькулятор! Мы поддерживаем операции: +,-,*,/,%.");
        Scanner in = new Scanner (System.in); /*инициализация сканера*/
        System.out.println("Введите первый операнд.");
        String first = in.nextLine();
        System.out.println("Введите символ операции.");
        String operation = in.nextLine();
        System.out.println("Введите второй операнд.");
        String second = in.nextLine();

        int flag = 0; //если есть (.) в операндах, то flag будет > 0 => работаем с double
        if (first.contains(".")) //проверка операндов на наличие(.)
            flag ++;
        if (second.contains(".")) //проверка операндов на наличие(.)
            flag ++;
        if (flag==0) {
            int leftOperand = Integer.valueOf(first); //перевод операндов в int
            int rightOperand = Integer.valueOf(second); //перевод операндов в int
            System.out.println(leftOperand + operation + rightOperand + "=" + getResult(leftOperand, operation, rightOperand));
        }
        else {
            double leftOperand = Double.parseDouble(first); //перевод операндов в double
            double rightOperand = Double.parseDouble(second); //перевод операндов в double
        System.out.println(leftOperand + operation + rightOperand + "=" + getResult(leftOperand, operation, rightOperand));
        }
    }
}