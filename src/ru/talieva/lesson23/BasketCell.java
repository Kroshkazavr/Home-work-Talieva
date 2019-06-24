package ru.talieva.lesson23;

/**
 * Класс ячейки (карточки товара) корзины интернет магазина.
 */
public class BasketCell {
    private int quantity; // количество товара
    private String product; // наименование товара

    BasketCell(String product, int quantity) {
        this.quantity = quantity;
        this.product = product;
    }

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    String getProduct() {
        return product;
    }

    void setTitle(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return product + " - " + quantity + "шт.";
    }
}
