package ru.talieva.lesson23;

import java.util.*;

/**
 * Класс корзина интернет магазина с имплементацией и конкретной реализацией интерфейса Basket.
 */
public class ShopBasket implements Basket {

    private ArrayList<BasketCell> basket; // корзина - массив ячеек

    ShopBasket() { // конструктор с одновременным созданием массива ячеек
        this.basket = new ArrayList<>();
    }

    /**
     * метод для добавления товара в корзину, проверяет, есть ли уже такой товар в корзине
     * если есть, то увеличить кол-во,
     * если нет, то создать новую ячейку (карточку товара)
     * + выводит текущее состояние корзины
     *
     * @param product  наименование товара
     * @param quantity количество товара
     */
    @Override
    public void addProduct(String product, int quantity) {
        BasketCell fbc = findSameProduct(product); // ищем повторение
        if (fbc != null) { // если такой товар уже есть,
            fbc.setQuantity((fbc.getQuantity() + quantity)); // то увеличиваем количество
            System.out.println(">>>Товар <" + product + "> уже есть в Вашей корзине, количество увеличено.");
        } else { // иначе
            BasketCell bc = new BasketCell(product, quantity); // создаем новую карточку
            basket.add(bc); // добавляем в корзину
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
        BasketCell fbc = findSameProduct(product); // ищем повторение
        if (fbc != null) { // если такой товар есть,
            basket.remove(fbc); // удаляем
            System.out.println(">>>Товар <" + product + "> из корзины удален.");
        } else { // иначе удалять нечего
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
        BasketCell fbc = findSameProduct(product); // ищем повторение
        if (fbc != null) { // если такой товар есть,
            fbc.setQuantity(quantity); // обновляем количество (устанавливаем новое)
            System.out.println(">>>Количество товара <" + product + "> в корзине обновлено.");
        } else { // иначе ничего не делаем
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
        if (!basket.isEmpty()) {         //если корзина непустая, то
            basket = new ArrayList<>(); //создаем новую корзину (старую удалит garbage collector)
        } else { // иначе корзина уже пустая
            System.out.println("Корзина пуста.");
        }
        System.out.println(">>>Содержимое корзины удалено.");
        System.out.println("В вашей корзине сейчас находится:");
        System.out.println(getProducts());
    }

    /**
     * создания списка из массива корзины
     * метод
     *
     * @return список товаров с количеством
     */
    @Override
    public List<String> getProducts() {
        List<String> ls = new LinkedList<>(); //создаем список
        for (BasketCell bc : basket) { //перебераем все элементы
            ls.add(bc.toString()); // добавляем в список с обработкой в String
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
        BasketCell fbc = findSameProduct(product); //ищем товар
        if (fbc != null) { //если нашли, то
            return fbc.getQuantity(); //возвращаем количество
        } else { //иначе возвращаем отрицательное кол-во, чтобы было понятно, что товара в корзине нет
            return -1;
        }
    }

    /**
     * метод ищет товар по наименованию в корзине
     *
     * @param product наименование товара
     * @return возвращает ячейку/карточку товара
     */
    private BasketCell findSameProduct(String product) {
        if (!basket.isEmpty()) { // если корзина не пуста
            for (int i = 0; i < basket.size(); i++) { //перебираем все элементы
                BasketCell basketCell = basket.get(i); // достаем их
                if (basketCell.getProduct().equalsIgnoreCase(product)) { // сравниваем их наименование с искомым
                    return basketCell; // возвращаем карточку, если нашли нужно наименование
                }
            }
        }
        return null; // иначе возвращаем null
    }

    /**
     * метод для красивого вывода на экран содержимого корзины
     */
    void printBasket() {
        System.out.println("*********************************");
        System.out.println("В вашей корзине сейчас находится: ");
        if (!basket.isEmpty()) { // если непустая корзина, то выводим по 1 товару в строку
            for (int i = 0; i < basket.size(); i++) {
                System.out.println(basket.get(i).toString());
            }
        } else { // иначе корзина пуста
            System.out.println("Корзина пуста.");
        }
        System.out.println("*********************************");
    }

    /**
     * метод для удобного вывода кол-ва товара в корзине по наименованию
     *
     * @param product наименование
     */
    void answerQuantity(String product) {
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
