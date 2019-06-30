package ru.talieva.lesson25.task02;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Написать метод (public boolean isUnique(Map<String, String> map);), который возвращает true, если в мапе нет двух и
 * более одинаковых value, и false в противном случае.
 * Для пустой мапы метод возвращает true.
 * Например, для метода {Вася=Иванов, Петр=Петров, Виктор=Сидоров, Сергей=Савельев, Вадим=Викторов} метод вернет true,
 * а для {Вася=Иванов, Петр=Петров, Виктор=Иванов, Сергей=Савельев, Вадим=Петров} метод вернет false.
 */

public class IsUnique {

    public static void main(String[] args) {
        Map<String, String> hashMap0 = new HashMap<>();

        System.out.println(isUnique(hashMap0));

        Map<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("Вася", "Иванов");
        hashMap1.put("Петр", "Петров");
        hashMap1.put("Виктор", "Сидоров");
        hashMap1.put("Сергей", "Савельев");
        hashMap1.put("Вадим", "Викторов");

        System.out.println(isUnique(hashMap1));

        Map<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("Вася", "Иванов");
        hashMap2.put("Петр", "Петров");
        hashMap2.put("Виктор", "Иванов");
        hashMap2.put("Сергей", "Савельев");
        hashMap2.put("Вадим", "Петров");

        System.out.println(isUnique(hashMap2));
    }

    /**
     * Метод, который анализирует map на наличие 2-х и более одинаковых значений
     *
     * @param map исходная коллекция для проверки
     * @return true, если в мапе нет двух и более одинаковых value, и false в противном случае.
     **/

    private static boolean isUnique(Map<String, String> map) {
        if (!map.isEmpty()) {                                  // Если мапа не пустая
            Set<String> setValues = new HashSet<>();           // создаем новый сэт
            for (String k : map.keySet()) {                     // перебираем все ключи в мапе
                if (!setValues.add(map.get(k))) {              // если значение по ключу не добавляется в новый сэт
                    return false;                              // значит есть повтор в значениях исходной мапы
                }
            }
        }
        return true;                                           // в остальных случаях все ок
    }
}
