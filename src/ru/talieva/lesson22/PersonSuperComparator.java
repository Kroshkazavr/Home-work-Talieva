package ru.talieva.lesson22;

import java.util.Comparator;

/**
 * Класс PersonSuperComparator,
 * который имплементит Comparator, но умеет сравнивать по двум параметрам, возраст и имя.
 **/

public class PersonSuperComparator implements Comparator<Person> {

    /**
     * метод для сравнения объекитов класса Person
     * сначала по имени, потом по возрасту, если имена одинаковые
     *
     * @return результат сравнения
     */
    @Override
    public int compare(Person a, Person b) {
        if (a.getName().compareTo(b.getName()) != 0) { // Если имена не равны,
            return a.getName().compareTo(b.getName()); // то сравниваем по имени
        } else return a.getAge() - b.getAge(); // Иначе сравниваем по возрасту
    }
}

