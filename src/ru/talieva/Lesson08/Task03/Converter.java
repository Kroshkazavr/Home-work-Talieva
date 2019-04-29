package ru.talieva.Lesson08.Task03;

import java.util.Scanner;

/**
 * Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).
 **/
public class Converter {

    private static ServiceTicket convert(Agreement firstAgr) {

        return new ServiceTicket(firstAgr.getNumber(), firstAgr.getStartDate(),
                firstAgr.getEndDate(), firstAgr.getList());
    }

    public static void main(String[] args) {
        Agreement firstAgreement = new Agreement(123, "12/05/13", "12/05/14");
        String[] list = {"1. Уброрка снега.", "2. Ремонт крыши.", "3. Покраска двери.", "4. Вывоз мусора.",
                "5. Установка ограждения."};
        firstAgreement.setList(list);
        System.out.println("Создан договор №" + firstAgreement.getNumber());
        System.out.println("Дата начала договора: " + firstAgreement.getStartDate() + ", дата окончания: " +
                firstAgreement.getEndDate());
        System.out.println("Список услуг по договру: ");
        firstAgreement.getListPrint(firstAgreement.list);
        System.out.println("*********************************************************");
        System.out.println("Выпустить акт к договору? (Нажмите: 1-Да, 2-Нет)");
        Scanner in = new Scanner(System.in);
        int flag = in.nextInt();
        if (flag == 1) {
            System.out.println("*********************************************************");
            ServiceTicket firstServiceTicket = Converter.convert(firstAgreement);
            System.out.println("К договору №" + firstServiceTicket.getNumber() + " от " + firstServiceTicket.getStartDate()
                    + " создан закрываюший акт.");
            System.out.println("Дата подписания акта: " + firstServiceTicket.getEndDate());
            System.out.println("Список оказанных по договру услуг: ");
            firstServiceTicket.getListPrint(firstServiceTicket.list);
        } else {
            System.out.println("Спасибо за внимание. Конец.");
        }
    }
}