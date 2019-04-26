package ru.talieva.Lesson08.Task03;

public class Converter {

    public static ServiceTicket convert (Agreement firstAgr) {

        ServiceTicket firstServiceTicket = new ServiceTicket(firstAgr.getNumber(), firstAgr.getStartDate(), firstAgr.getEndDate(), firstAgr.getList());
        return firstServiceTicket;
    }

    public static void main (String[] args) {
        Agreement firstAgriment = new Agreement(123, "12/05/13", "12/05/14");
        String list[] = {"1", "2", "3", "4", "5"};
        firstAgriment.setList(list);
        System.out.println("Создан договор №" + firstAgriment.getNumber());
        System.out.println("Дата начала договора: " + firstAgriment.getStartDate() + ", дата окончания: " + firstAgriment.getEndDate());
        System.out.println("Список услуг по договру: ");
        for (int p=0; p<list.length; p++) {
            System.out.println(firstAgriment.getList(list, p));
        }
        ServiceTicket firstServiceTicket = Converter.convert(firstAgriment);
        System.out.println("К договору №" + firstServiceTicket.getNumber() + " от" + firstServiceTicket.getStartDate() +" создан закрываюший акт.");
        System.out.println("Дата подписания акта: " + firstServiceTicket.getEndDate());
        System.out.println("Список оказанных по договру услуг: ");
        for (int p=0; p<list.length; p++) {
            System.out.println(firstServiceTicket.getList(list, p));
        }
    }

//    public static Lesson7 convert(Lesson8 l8){
//        Lesson7 aux = new Lesson7(l8.getTitle(), 1);
//        return aux;
//    }
}
