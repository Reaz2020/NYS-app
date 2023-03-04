import java.util.ArrayList;
import java.util.Scanner;

public class booking {
    Scanner sc=new Scanner(System.in);
    ArrayList bookingList = new ArrayList();

    String name ;
    String address;
    String nationality;
    String residence;
    int phoneNumber;
    String email;

    public void menu(){
        System.out.println("PLEASE CHOSE AN OPTION MENU\n" +
                "for tourism press ---> t \n " +
                "stay press       --- > s \n "+
                "umrah press      --- > u \n "+
                "flight press     --- > f \n ");
        String userChoice =sc.next();
        userChoice.toLowerCase();
        if (userChoice=="t");

        {
            book();
        }


    }

    public void book()
    {

        System.out.println(" ************************************ NEW BOOKING ************************************************************* ");


        tourism t1 =new tourism();
        System.out.println(" Please enter your name ");
        name=sc.nextLine();
        name=sc.nextLine();

        System.out.println(" Please enter your address ");
        address=sc.nextLine();
        System.out.println();
        System.out.println(" Please enter your nationality ");
        System.out.println();
        nationality=sc.nextLine();
        System.out.println();
        System.out.println(" Please enter your residence country ");
        residence=sc.nextLine();
        System.out.println();

        try{

        System.out.println(" Please enter your phone number ");
        phoneNumber=sc.nextInt();

        t1.phoneNumber=phoneNumber;}
        catch (Exception e){
            System.out.println(" Not valid phone number  Digits only ");
        }

        System.out.println();
        System.out.println(" Please enter your email ");
        email=sc.next();


        t1.name=name ;
        t1.address=address;
        t1.nationality=nationality;
        t1.residence=residence;

        t1.email=email;

        System.out.println("Hi "+ name + " Check Your details " + address + " "+ nationality+ " " + residence+ " " + phoneNumber+ " " + email +
                " and press c to confirm  or d to reenter ");
        bookingList.add(t1);

        System.out.println( t1.name + " your booking confirmed ");


        System.out.println("ALL THE BOOKING REQUESTS :- - - - - - - - - - - - ");

        for (int i=0; i<bookingList.size(); i++) {
            Object current = bookingList.get(i);
            System.out.println(current);
            };
    }

}
