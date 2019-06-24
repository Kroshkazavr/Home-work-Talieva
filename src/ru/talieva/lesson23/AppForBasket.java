package ru.talieva.lesson23;

/**
 * Задание#23: Реализовать класс корзины интернет магазина по интерфейсу Basket.
 */

public class AppForBasket {

    public static void main(String[] args) {

        ShopBasket shopBasket = new ShopBasket();

        // Наполняем корзину (тест addProduct)
        shopBasket.addProduct("Носки", 2);
        shopBasket.addProduct("Свитер", 1);
        shopBasket.addProduct("Галстук", 10);
        shopBasket.addProduct("Джинсы", 1);
        shopBasket.addProduct("Носки", 1); // повтор наименования товара
        shopBasket.addProduct("Платье", 3);
        shopBasket.printBasket();

        // удаляем элементы (тест removeProduct)
        shopBasket.removeProduct("Свитер"); // имеюшийся в корзине
        shopBasket.removeProduct("Кофта"); // отсутствующий в корзине

        // меняем количество товара (тест updateProductQuantity)
        shopBasket.updateProductQuantity("Джинсы", 2); // имеюшийся в корзине
        shopBasket.updateProductQuantity("Шляпа", 2); // отсутствующий в корзине

        //узнаем количество товара в корзине по наименованию (тест getProductQuantity через метод answerQuantity)
        shopBasket.answerQuantity("Носки"); // имеюшийся в корзине
        shopBasket.answerQuantity("Брюки"); // отсутствующий в корзине

        //чистим корзину (тест clear)
        shopBasket.clear();
    }


}
