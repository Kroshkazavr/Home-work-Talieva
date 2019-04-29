package ru.talieva.Lesson08.Task01;

import java.util.Scanner;

/**
 * класс Calculator, который содержит статические методы для операций вычитания:
 * сложения, умножения, деления и взятия процента от числа.
 * Класс работает как с целыми числами, так и с дробями
 **/
public class Calculator {
    // Блок для int
    private static int getSum(int leftOperand, int rightOperand) {
        return leftOperand + rightOperand;
    }

    private static int getDiff(int leftOperand, int rightOperand) {
        return leftOperand - rightOperand;
    }

    private static int getIncrease(int leftOperand, int rightOperand) {
        return leftOperand * rightOperand;
    }

    private static double getDivision(int leftOperand, int rightOperand) {
        return Double.valueOf(leftOperand) / Double.valueOf(rightOperand);
    }

    private static double getDivision(double leftOperand, double rightOperand) {
        return leftOperand / rightOperand;
    }

    private static double getResult(int leftOperand, int rightOperand) {
        return (Double.valueOf(leftOperand) * Double.valueOf(rightOperand)) / 100;
    }

    private static double getResult(double leftOperand, double rightOperand) {
        return (leftOperand * rightOperand) / 100;
    }

    private static double getSum(double leftOperand, double rightOperand) {
        return leftOperand - rightOperand;
    }

    private static double getDiff(double leftOperand, double rightOperand) {
        return leftOperand + rightOperand;
    }

    private static double getIncrease(double leftOperand, double rightOperand) {
        return leftOperand * rightOperand;
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор! Мы поддерживаем операции: +,-,*,/,%.");
        Scanner in = new Scanner(System.in); /*инициализация сканера*/
        System.out.println("Введите первый операнд.");
        String first = in.nextLine();
        System.out.println("Введите символ операции (+,-,*,/,%).");
        String operation = in.nextLine();
        System.out.println("Введите второй операнд.");
        String second = in.nextLine();

        int flag = 0; //если есть (.) в операндах, то flag будет > 0 => работаем с double
        if (first.contains(".")) //проверка операндов на наличие(.)
            flag++;
        if (second.contains(".")) //проверка операндов на наличие(.)
            flag++;
        if (flag == 0) {
            int leftOperand = Integer.valueOf(first); //перевод операндов в int
            int rightOperand = Integer.valueOf(second); //перевод операндов в int
            switch (operation) { //ветвление на операции для int
                case "+": {
                    System.out.println(leftOperand + operation + rightOperand + "=" + getSum(leftOperand, rightOperand));
                    break;
                }
                case "-": {
                    System.out.println(leftOperand + operation + rightOperand + "=" + getDiff(leftOperand, rightOperand));
                    break;
                }
                case "*": {
                    System.out.println(leftOperand + operation + rightOperand + "=" + getIncrease(leftOperand, rightOperand));
                    break;
                }
                case "/": {
                    System.out.println(leftOperand + operation + rightOperand + "=" + getDivision(leftOperand, rightOperand));
                    break;
                }
                case "%": {
                    System.out.println(leftOperand + operation + rightOperand + "=" + getResult(leftOperand, rightOperand));
                    break;
                }
                default:
                    System.out.println("Ошибка операции.");
            }
        } else {
            double leftOperand = Double.parseDouble(first); //перевод операндов в double
            double rightOperand = Double.parseDouble(second); //перевод операндов в double
            switch (operation) { //ветвление на операции для double
                case "-": {
                    System.out.println(leftOperand + operation + rightOperand + "=" + getDiff(leftOperand, rightOperand));
                    break;
                }
                case "+": {
                    System.out.println(leftOperand + operation + rightOperand + "=" + getSum(leftOperand, rightOperand));
                    break;
                }
                case "*": {
                    System.out.println(leftOperand + operation + rightOperand + "=" + getIncrease(leftOperand, rightOperand));
                    break;
                }
                case "/": {
                    System.out.println(leftOperand + operation + rightOperand + "=" + getDivision(leftOperand, rightOperand));
                    break;
                }
                case "%": {
                    System.out.println(leftOperand + operation + rightOperand + "=" + getResult(leftOperand, rightOperand));
                    break;
                }
                default:
                    System.out.println("Ошибка операции.");
            }
        }
    }
}
