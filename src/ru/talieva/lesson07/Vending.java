package ru.talieva.lesson07;

import java.util.Scanner;

/**
 * Эмулятор вендинга
 **/
public class Vending {
    public static final int NUMBER_OF_ITEMS = 5; //количество ячеек в вендинге
    ///положить деньги на внутренний счет
    ///выдать напиток по запросу после проверки баланса
    private static Drink[] drinks; // Массив напитков

    Vending() //конструктор, который создает массив напитков для вендинга в момент создания объекта вендинг
    {
        Drink[] drinks = new Drink[NUMBER_OF_ITEMS];
    }

    public static Drink[] getSetDrinks() { //Показать меню загруженных напитков с ценами TODO
        return drinks;
    }

    public static void setDrinks(Drink[] drinks, int item, int i) {  //Заполняем вендинг напитками
        switch (item) {
            case 1: {
                drinks[i - 1] = Drink.COLD_TEA;
                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.COLD_TEA.getTitle() + "'");
                break;
            }
            case 2: {
                drinks[i - 1] = Drink.STILL_WATER;
                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.STILL_WATER.getTitle() + "'");
                break;
            }
            case 3: {
                drinks[i - 1] = Drink.SPARKLING_WATER;
                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.SPARKLING_WATER.getTitle() + "'");
                break;
            }
            case 4: {
                drinks[i - 1] = Drink.JUCE;
                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.JUCE.getTitle() + "'");
                break;
            }
            case 5: {
                drinks[i - 1] = Drink.PEPSI;
                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.PEPSI.getTitle() + "'");
                break;
            }
            case 6: {
                drinks[i - 1] = Drink.MIRINDA;
                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.MIRINDA.getTitle() + "'");
                break;
            }
            case 7: {
                drinks[i - 1] = Drink.SEVBN_UP;
                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.SEVBN_UP.getTitle() + "'");
                break;
            }
            case 8: {
                drinks[i - 1] = Drink.RED_BULL;
                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.RED_BULL.getTitle() + "'");
                break;
            }
            default:
                System.out.println("ОЙ!");
        }

    }
}


