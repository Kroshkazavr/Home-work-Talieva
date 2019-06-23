package ru.talieva.lesson22;

/**
 * Класс Person содержит два поля int age и String name
 **/

public class Person implements Comparable<Person> {

    private String name; //имя человека
    private int age; // возраст человека

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Person p) { // Сравнение по умолчанию (по имени)

        return name.compareTo(p.getName());
    }

    @Override
    public String toString() {
        return "Person{" + "Имя: " + name + "; " + "Возраст: " + age + "}";
    }
}
