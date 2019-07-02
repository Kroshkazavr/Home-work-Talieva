package ru.talieva.lesson23;

import java.util.List;

/**
 * Задание#23: Реализовать класс корзины интернет магазина по следующему интерфейсу:
 */
public interface Basket {

    List<String> getProducts();

    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    int getProductQuantity(String product);

}
