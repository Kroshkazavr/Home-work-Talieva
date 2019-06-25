package ru.talieva.lesson24;

import java.util.HashSet;
import java.util.Set;

/**
 * Задание №24: Написать метод, который возвращает множество, в котором удалены все элементы четной длины
 * из исходного множества.
 * <p>
 * public Set<String> removeEvenLength(Set<String> set);
 * <p>
 * Пример: ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"] метод вернет ["foo", "bar", "spoon", "!"]
 */

public class RemoveEvenLength {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("foo");
        stringSet.add("buzz");
        stringSet.add("bar");
        stringSet.add("fork");
        stringSet.add("bort");
        stringSet.add("spoon");
        stringSet.add("!");
        stringSet.add("dude");

        System.out.println("Исходная коллекция:");
        for (String s : stringSet) {
            System.out.print(s + " ");
        }
        System.out.println(" ");

        System.out.println("Коллекция после удаления элементов четной длины:");
        for (String s : removeEvenLength(stringSet)) {
            System.out.print(s + " ");
        }
        System.out.println(" ");
    }

    /**
     * метод возвращает множество, в котором отсутствуют все элементы четной длины
     * из исходного множества.
     *
     * @param set обрабатываемый сет
     * @return обработанный сэт
     */
    private static Set<String> removeEvenLength(Set<String> set) {
        Set<String> donorSet = new HashSet<>();
        for (String str : set) {                        //перебираем элементы
            if (str.length() % 2 == 0) {                //если длина четная,
                donorSet.add(str);                      //складываем элемент в новый сэт
            }
        }
        set.removeAll(donorSet);                        //удаляем из входящего сэта коллекцию нечетных элементов
        return set;
    }
}
