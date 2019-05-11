package ru.talieva.lesson09.task03;

/**
 * Бегун - наследник класса Человек с конкретной реализацией абстрактных методов
 **/
public class Runner extends Human {
    private int record; // личный рекорд бегуна на 100-метровке

    private Runner(int age, String name) {
        super(age, name);
    }

    public static void main (String[] args) {
        Runner dima = new Runner(35, "Dima");
        dima.setRecord(24);
        System.out.println("Я " + dima.getName() + ". Мне " + dima.getAge() + ".");
        dima.run();
        System.out.println("Мой личный рекорд на 100-метровке: " + dima.getRecord() + "сек.");
        dima.swim();
        dima.dive();
    }

    private int getRecord() {
        return record;
    }

    private void setRecord(int record) {
        this.record = record;
    }

    @Override
    public void run() {
        System.out.println("Я чемпион по бегу.");
    }

    @Override
    public void swim() {
        System.out.println("Я плаваю для удовольствия.");
    }

    @Override
    public void dive() {
        System.out.println("Я ныряю с аквалангом в отпуске.");
    }
}
