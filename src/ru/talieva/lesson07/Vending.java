package ru.talieva.lesson07;

import java.util.Scanner;

/**
 * Эмулятор вендинга
 **/
public class Vending {
    static final int NUMBER_OF_ITEMS = 5; //количество ячеек в вендинге
    ///положить деньги на внутренний счет
    ///выдать напиток по запросу после проверки баланса
    private Drink[] drinks; // Массив напитков

//    Vending() //конструктор, который создает массив напитков для вендинга в момент создания объекта вендинг
//    {
//        Drink[] drinks = new Drink[NUMBER_OF_ITEMS];
//    }

    public Drink[] getDrinks() {
        return drinks;
    }

    static void printDrinks(Drink[] drinks) {
        for (int i = 0; i < drinks.length; i++) {
            System.out.println((i+1) + ". " + drinks[i]);
            return;
        }
    }

    public void setDrinks(Drink[] drinks) {
        this.drinks = drinks;
    }

    static void makeDrinks (Drink[] drinks, int item, int i) {  //Заполняем вендинг напитками


    }

    private Drink chooseCase (Drink[] drinks, int item, int i) {
        switch (item) {
            case 1: {
                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.COLD_TEA.getTitle() + "'");
                return Drink.COLD_TEA;
                break;
//            }
//            case 2: {
//                drinks[i - 1] = Drink.STILL_WATER;
//                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.STILL_WATER.getTitle() + "'");
//                break;
//            }
//            case 3: {
//                drinks[i - 1] = Drink.SPARKLING_WATER;
//                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.SPARKLING_WATER.getTitle() + "'");
//                break;
//            }
//            case 4: {
//                drinks[i - 1] = Drink.JUICE;
//                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.JUICE.getTitle() + "'");
//                break;
//            }
//            case 5: {
//                drinks[i - 1] = Drink.PEPSI;
//                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.PEPSI.getTitle() + "'");
//                break;
//            }
//            case 6: {
//                drinks[i - 1] = Drink.MIRINDA;
//                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.MIRINDA.getTitle() + "'");
//                break;
//            }
//            case 7: {
//                drinks[i - 1] = Drink.SEVEN_UP;
//                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.SEVEN_UP.getTitle() + "'");
//                break;
//            }
//            case 8: {
//                drinks[i - 1] = Drink.RED_BULL;
//                System.out.println("Для ячейки №" + i + " выбран напиток '" + Drink.RED_BULL.getTitle() + "'");
//                break;
//            }
//            default:
//                System.out.println("ОЙ!");
//        }
//    }
//}


