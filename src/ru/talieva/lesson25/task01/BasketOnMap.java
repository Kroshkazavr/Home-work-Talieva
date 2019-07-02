package ru.talieva.lesson25.task01;

import ru.talieva.lesson23.Basket;

import java.util.*;


/**
 * Класс корзина интернет магазина на базе MAP с имплементацией и конкретной реализацией интерфейса Basket.
 */

public class BasketOnMap implements Basket {

    private HashMap<String, Integer> basket; // корзина - набор пар key: товар + value: количество товара

    BasketOnMap() { // конструктор с одновременным созданием map для хранения товаров и их количества
        this.basket = new HashMap<>();
    }

    /**
     * метод для добавления товара в корзину, проверяет, есть ли уже такой товар в корзине
     * если есть, то увеличить кол-во,
     * если нет, то создать новую пару: наименование товара + его количество
     * + выводит текущее состояние корзины
     *
     * @param product  наименование товара
     * @param quantity количество товара
     */
    @Override
    public void addProduct(String product, int quantity) {
        if (!basket.isEmpty() && basket.containsKey(product)) {      // если корзина не пуста и такой товар уже есть,
            basket.put(product, basket.get(product) + quantity);     // то увеличиваем количество
            System.out.println(">>>Товар <" + product + "> уже есть в Вашей корзине, количество увеличено.");
        } else {                                                     // иначе
            basket.put(product, quantity);                           //добавляем новую пару
            System.out.println(">>>Добавлено: " + product + " - " + quantity + "шт.");
        }
        System.out.println("В вашей корзине сейчас находится:");
        System.out.println(getProducts());
    }

    /**
     * метод для удаления товара из корзины по наименованию
     *
     * @param product наименовани товара
     */
    @Override
    public void removeProduct(String product) {
        if (!basket.isEmpty() && basket.containsKey(product)) { // если корзина не пуста и в ней есть такой ключ,
            basket.remove(product);                             // то удаляем эту пару
            System.out.println(">>>Товар <" + product + "> из корзины удален.");
        } else {                                                // иначе удалять нечего
            System.out.println(">>>" + product + " - Нет такого товара в корзине.");
        }
        System.out.println("В вашей корзине сейчас находится:");
        System.out.println(getProducts());
    }

    /**
     * метод для изменения количества товара в заказе по наименованию
     *
     * @param product  наименование
     * @param quantity требуемое/новое количество
     */
    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (!basket.isEmpty() && basket.containsKey(product)) {   // если корзина не пустая и такой товар есть,
            basket.put(product, quantity);                        // обновляем количество (устанавливаем новое)
            System.out.println(">>>Количество товара <" + product + "> в корзине обновлено.");
        } else {                                                  // иначе ничего не делаем
            System.out.println(">>>" + product + " - Нет такого товара в корзине.");
        }
        System.out.println("В вашей корзине сейчас находится:");
        System.out.println(getProducts());
    }

    /**
     * метод для очистки корзины (обнудение)
     */
    @Override
    public void clear() {
        if (!basket.isEmpty()) {            //если корзина непустая, то
            basket = new HashMap<>();       //создаем новую корзину (старую удалит garbage collector)
        } else {                            // иначе корзина уже пустая
            System.out.println("Корзина пуста.");
        }
        System.out.println(">>>Содержимое корзины удалено.");
        System.out.println("В вашей корзине сейчас находится:");
        System.out.println(getProducts());
    }

    /**
     * метод для создания списка из map корзины
     *
     * @return список товаров с количеством
     */
    @Override
    public List<String> getProducts() {
        List<String> ls = new ArrayList<>(); // создаем список
        for (String product : basket.keySet()) {
            ls.add(product + "-" + basket.get(product));  // добавляем элементы в список по заданному формату
        }
        return ls;
    }

    /**
     * метод для нахождения количества товара в заказе по наименованию
     *
     * @param product наименование товара
     * @return кол-во товара в заказе/корзине в шт (int)
     */
    @Override
    public int getProductQuantity(String product) {
        if (basket.containsKey(product)) {           // если корзина не пустая и такой товар есть,
            return basket.get(product);              // то возвращаем количество
        }
        return 0;                                    //иначе возвращаем 0, т.к. товара в корзине нет
    }

    /**
     * метод для удобного вывода кол-ва товара в корзине по наименованию
     *
     * @param product наименование
     */
    void printQuantity(String product) {
        System.out.println("*********************************");
        System.out.println("Запрос количества товара в корзине по наименованию");
        if (getProductQuantity(product) > 0) {
            System.out.println(product + " в корзине " + getProductQuantity(product) + "шт.");
        } else {
            System.out.println(product + " - Нет такого товара в корзине.");
        }
        System.out.println("*********************************");
    }
}

