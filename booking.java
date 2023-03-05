import java.util.ArrayList;
import java.util.Scanner;

public class booking {
    Scanner sc = new Scanner(System.in);
    ArrayList tourismBookingList = new ArrayList();

    String name;
    String address;
    String nationality;
    String residence;
    int phoneNumber;
    String email;

    public void menu() {
        System.out.println("PLEASE CHOSE AN OPTION MENU\n" +
                "for tourism press ---> t \n " +
                "stay press       --- > s \n " +
                "umrah press      --- > u \n " +
                "flight press     --- > f \n ");
        userChoiceHandling();



    }

    public void book() {

        System.out.println(" ************************************ NEW BOOKING ************************************************************* ");


        //tourism t1 = new tourism();
        System.out.println(" Please enter your name ");
        name = sc.nextLine();
        name = sc.nextLine();
        System.out.println(" Please enter your address ");
        address = sc.nextLine();
        System.out.println();
        System.out.println(" Please enter your nationality ");
        System.out.println();
        nationality = sc.nextLine();
        System.out.println();
        System.out.println(" Please enter your residence country ");
        residence = sc.nextLine();
        System.out.println();

        try {

            System.out.println(" Please enter your phone number ");
            phoneNumber = sc.nextInt();

        } catch (Exception e) {
            System.out.println(" Not valid phone number  Digits only ");
        }

        System.out.println();
        System.out.println(" Please enter your email ");
        email = sc.next();

        System.out.println("Hi " + name + " Check Your details " + address + " " + nationality + " " + residence + " " + phoneNumber + " " + email +
                " and press c to confirm  or d to reenter ");


        System.out.println(name + " your booking confirmed ");
        printingTourismBookingList();


    }
    public  void userChoiceHandling(){
        String userChoice = sc.next();
        userChoice.toLowerCase();

        // if it is a tourism booking
        if (userChoice.equals("t")) {
            System.out.println("TOURISM PACKAGE BOOKING PORTAL");
            tourism t1=new tourism();
            tourismBookingList.add(t1);
            // block of code to be executed if the condition is true
             t1.book();
        }
        if (userChoice.equals("f")) {
            System.out.println("FLIGHT BOOKING PORTAL");
            flight f1=new flight();
            // block of code to be executed if the condition is true
            f1.book();



        }
        if (userChoice.equals("s")) {
            System.out.println("HOTEL/STAY BOOKING PORTAL");
            stay s1=new stay();
            // block of code to be executed if the condition is true
            s1.book();
        }
        if (userChoice.equals("u")) {
            System.out.println("UMRAH BOOKING PORTAL");
            Umrah U1=new Umrah();
            // block of code to be executed if the condition is true
            U1.book();
        }



    }
    public void printingTourismBookingList(){
        System.out.println("ALL THE BOOKING REQUESTS :- - - - - - - - - - - - ");

        for (int i = 0; i < tourismBookingList.size(); i++) {
            Object current = tourismBookingList.get(i);
            System.out.println(current);
        }
    }

}
