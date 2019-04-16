package ru.talieva.lesson02.task01;

/** Класс, который считает стоимость покупки бензина */
public class Petrol {
    public static int price = 43; /* стоимость одного литра бензина*/
    public static int quantity = 50; /* количство литров бензина в покупке*/
    public static int cost; /* стоимость покупки*/

    private static int getCost (){ /* метод для расчета стоимости покупки*/
        cost = price*quantity;
        return cost;
    }
    public static void main (String [] args) {
        System.out.println("Сумма покупки составит: " + getCost());
    }
}