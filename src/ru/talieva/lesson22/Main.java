package ru.talieva.lesson22;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Заполняем список объектами
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Max", 25));
        people.add(new Person("Denis", 25));
        people.add(new Person("Denis", 32));
        people.add(new Person("Anna", 35));
        people.add(new Person("Ban", 5));
        people.add(new Person("Foxy", 33));
        people.add(new Person("Rita", 25));

        System.out.println("Список до сортировки: ");
        for (Person person : people) {
            System.out.println(person.toString());
        }

        PersonSuperComparator psc = new PersonSuperComparator(); // Создаем новый объект класса PersonSuperComparator
        people.sort(psc); // Сортируем, применяя созданный PersonSuperComparator

        System.out.println("Список после сортировки: ");
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
