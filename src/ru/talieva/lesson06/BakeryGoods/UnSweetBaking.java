package ru.talieva.lesson06.BakeryGoods;

/** Класс наследник от выпечки: сладкая выпечка (+1 поле, +1 метод, +1 константа)**/
public class UnSweetBaking extends BakeryGoods{
    private String typeOfFlour; //вид муки
    private final static double WIGHT_OF_RUSK = 0.01; //вес сухря для супа

    public UnSweetBaking(int freshness, int dueDay, double weight, String typeOfFlour) {
        super(freshness, dueDay, weight);
        this.typeOfFlour = typeOfFlour;
    }

    String getTypeOfFlour() {
        return typeOfFlour;
    }

    void setTypeOfFlour(String typeOfFlour) {
        this.typeOfFlour = typeOfFlour;
    }

    public int makeRuskToSoup (double wight) { //метод считает, сколько можно сделать сухарей для супа
        return (int) (wight / WIGHT_OF_RUSK);
    }

    public static void main (String [] args){
        UnSweetBaking bread = new UnSweetBaking(1, 7, 0.5,  "wheat");
        bread.setFreshness(9);
        bread.setDueDay(5);
        bread.getDryUp(bread.getFreshness(), bread.getDueDay());
        System.out.println("Во мне " + bread.getWeight() + " кг.");
        System.out.println("Из меня можно сделать " + bread.makeRuskToSoup(bread.getWeight()) + " сухарей для супа.");
    }
}


