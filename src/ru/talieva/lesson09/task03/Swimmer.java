package ru.talieva.lesson09.task03;

/**
 * Плавец - наследник класса Человек с конкретной реализацией абстрактных методов
 **/
public class Swimmer extends Human {
    private double record; // личный рекорд бегуна в нырянии

    private Swimmer(int age, String name) {
        super(age, name);
    }

    public static void main (String[] args) {
        Swimmer kex = new Swimmer(19, "Кекс");
        kex.setRecord(1.8);
        System.out.println("Я " + kex.getName() + ". Мне " + kex.getAge() + ".");
        kex.run();
        kex.swim();
        kex.dive();
        System.out.println("Я ныряю на глубину " + kex.getRecord() + "м.");
    }

    private double getRecord() {
        return record;
    }

    private void setRecord(double record) {
        this.record = record;
    }

    @Override
    public void run() {
        System.out.println("Я бегаю на тренировках.");
    }

    @Override
    public void swim() {
        System.out.println("Я чемпион по плаванию.");
    }

    @Override
    public void dive() {
        System.out.println("Я профессионально ныряю.");
    }
}
