package ru.talieva.lesson06.Store;
import ru.talieva.lesson06.BakeryGoods.SweetBaking;

/** Класс булка в пакете Магазин (+2 поля, +1 метод, +1 константа)**/
class Bun extends SweetBaking {
    private double price; // цена
    private final static int ORDER_QUANTITY = 5; //минимпльное количество для заказа у поставшика
    private int inStore; //на остатке в магазине

    private Bun(int freshness, int dueDay, double weight, boolean filling, double price) {
        super(freshness, dueDay, weight, filling);
        this.price = price;
    }

    private double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private int getInStore() {
        return inStore;
    }

    private void setInStore(int inStore) {
        this.inStore = inStore;
    }

    private void timeToOrder (int inStore) { //метод проверяет, войдет ли на полку
        if (inStore > ORDER_QUANTITY){
            System.out.println("В наличии еще много.");
        }
        else System.out.println("Пора заказывать.");
    }

    public static void main (String [] args){
        Bun bun = new Bun(2, 7, 0.12, true, 32.5 );
        bun.setInStore(4);
        bun.setTitle("Булка");
        System.out.println("Привет! Я " + bun.getTitle() + " по цене " + bun.getPrice() + " руб.");
        bun.getDryUp(bun.getFreshness(), bun.getDueDay());
        bun.sayFillingIn(bun.isFilling());
        System.out.println("Во мне " + bun.getWeight() + " кг.");
        bun.timeToOrder(bun.inStore);
    }
}
