package ru.talieva.lesson23;

/**
 * Класс ячейки (карточки товара) корзины интернет магазина.
 */
public class Product {
    private int quantity; // количество товара
    private String name; // наименование товара

    Product(String product, int quantity) {
        this.quantity = quantity;
        this.name = product;
    }

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    String getName() {
        return name;
    }

    void setTitle(String product) {
        this.name = product;
    }

    @Override
    public String toString() {
        return name + " - " + quantity + "шт.";
    }
}
