package ru.talieva.lesson03.task01;

import java.util.Scanner;

/** Класс, который считает зарплату на руки + ввод данных с клавиатуры*/
public class Salary {
    private static double salaryGross; /* зарплата сотрудника*/
    final static double TAX = 0.13; /* размер налога*/

    private static double getSalary (){ /* метод для расчета зарплаты на руки (с учетом налогов)*/
        return salaryGross*(1-TAX); /* зарплата сотрудника на руки (с учетом налогов)*/
    }
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in); /*инициализация сканера*/
        System.out.println("Введите сумму Вашей запплаты с учетом налогов.");
        salaryGross =in.nextDouble(); /*ввод данных с клавиатуры*/
        System.out.println("Зарплата на руки (за вычетом налогов) составит: " + getSalary());
    }
}