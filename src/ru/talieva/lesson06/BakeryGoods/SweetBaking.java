package ru.talieva.lesson06.BakeryGoods;

/** Класс наследник от выпечки: сладкая выпечка (+1 поле, +1 метод)**/
public class SweetBaking extends BakeryGoods{
    private boolean filling; //есть ли начинка

    public SweetBaking(int freshness, int dueDay, double weight, boolean filling) {
        super(freshness, dueDay, weight);
        this.filling = filling;
    }

    public boolean isFilling() {
        return filling;
    }

    public void setFilling(boolean filling) {
        this.filling = filling;
    }

    public void sayFillingIn (boolean filling) { //метод выврдит на экрвн фразу про наличие начинки
        if (filling){
            System.out.println("Я с начинкой.");
        }
        else System.out.println("Я без начинки.");
    }

    public static void main (String [] args){
        SweetBaking bun = new SweetBaking(1, 7, 0.3,  true );
        bun.setFreshness(4);
        bun.getDryUp(bun.getFreshness(), bun.getDueDay());
        bun.sayFillingIn( bun.filling);
        System.out.println("Во мне " + bun.getWeight() + " кг.");
    }
}
