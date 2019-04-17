package ru.talieva.lesson04.task03;

/** Вывод таблицы умножения */
public class MultyTub {

    public static void main (String [] args) {
        System.out.println("********* Таблицв умножения *********");
        System.out.print("    "); /* вывод пустоты в начале шапки таблицы */
        for (int i=1; i<10; i++) { /* вывод шапки таблицы */
            System.out.print((i) + "   ");
        }
        System.out.println(); /* перенос на новую строку */
        for (int i=1; i<10; i++) {
            System.out.print((i) + "   ");
            for (int j=1; j<10; j++){
                System.out.print((j*i)); /* вывод результатов произведений */
                if (i*j>9) System.out.print( "  "); /* вывод меньших промежутков для 2значных чисел, чтобы таблица не плыла */
                else System.out.print( "   "); /* иначе вывод больших промежутков, чтобы таблица не плыла */
            }
            System.out.println(); /* перенос на новую строку */
        }
    }
}
