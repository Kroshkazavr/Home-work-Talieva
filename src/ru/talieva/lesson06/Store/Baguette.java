package ru.talieva.lesson06.Store;
import ru.talieva.lesson06.BakeryGoods.UnSweetBaking;

/** Класс багет в пакете Магазин(+2 поля, +1 метод, +1 константа)**/
public class Baguette extends UnSweetBaking {
    private int length; // длина багета в см
    private final static int REGIMENT_LONGITUDE= 45; // длина полки в магазине
    private double price; // цена

    private Baguette(int freshness, int dueDay, double weight, String typeOfFlour, double price) {
        super(freshness, dueDay, weight, typeOfFlour);
        this.price = price;
    }

    private int getLength() {
        return length;
    }

    private void setLength(int length) {
        this.length = length;
    }

    private void lengthMatch (int length) { //метод проверяет, войдет ли на полку
        if (length > REGIMENT_LONGITUDE){
            System.out.println("Я не помещаюсь на полку.");
        }
        else System.out.println("Я отлично помещаюсь на полку.");
    }

    public static void main (String [] args){
        Baguette baguette = new Baguette(2, 7, 0.35,  "rye", 45.3);
        baguette.setFreshness(9);
        baguette.setLength(50);
        baguette.setTitle("Багет");
        System.out.println("Привет! Я " + baguette.getTitle() + " по цене " + baguette.price + " руб.");
        baguette.getDryUp(baguette.getFreshness(), baguette.getDueDay());
        System.out.println("Во мне " + baguette.getWeight() + " кг.");
        System.out.println("Из меня можно сделать " + baguette.makeRuskToSoup(baguette.getWeight()) + " сухарей для супа.");
        baguette.lengthMatch(baguette.getLength());
    }
}
