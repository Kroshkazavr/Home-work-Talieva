package ru.talieva.lesson25.task01;

/**
 * Задание№25: Реализовать на базе MAP класс корзины интернет магазина по интерфейсу Basket.
 */

public class AppForBasketOnMap {
    public static void main(String[] args) {

        BasketOnMap shopBasket = new BasketOnMap();

        // Наполняем корзину (тест addProduct)
        shopBasket.addProduct("Носки", 2);
        shopBasket.addProduct("Свитер", 1);
        shopBasket.addProduct("Галстук", 10);
        shopBasket.addProduct("Джинсы", 1);
        shopBasket.addProduct("Носки", 1); // повтор наименования товара
        shopBasket.addProduct("Платье", 3);

        // удаляем элементы (тест removeProduct)
        shopBasket.removeProduct("Свитер"); // имеюшийся в корзине
        shopBasket.removeProduct("Кофта"); // отсутствующий в корзине

        // меняем количество товара (тест updateProductQuantity)
        shopBasket.updateProductQuantity("Джинсы", 2); // имеюшийся в корзине
        shopBasket.updateProductQuantity("Шляпа", 2); // отсутствующий в корзине

        //узнаем количество товара в корзине по наименованию (тест getProductQuantity через метод answerQuantity)
        shopBasket.printQuantity("Носки"); // имеюшийся в корзине
        shopBasket.printQuantity("Брюки"); // отсутствующий в корзине

        //чистим корзину (тест clear)
        shopBasket.clear();
    }
}
