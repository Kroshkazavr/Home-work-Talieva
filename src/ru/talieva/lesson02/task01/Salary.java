package ru.talieva.lesson02.task01;

/** Класс, который считает зарплату на руки */
public class Salary {
    public static int salaryGross = 70000; /* зарплата сотрудника*/
    final static double TAX = 0.13; /* размер налога*/
    public static double salaryNet; /* зарплата сотрудника на руки (с учетом налогов)*/

    private static double getSalary (){ /* метод для расчета зарплаты на руки (с учетом налогов)*/
        salaryNet = salaryGross*(1-TAX);
        return salaryNet;
    }
    public static void main (String [] args) {
        System.out.println("Зарплата на руки (с учетом налогов) составит: " + getSalary());
    }
}