package Kata2;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        if(esViernes13(10,2023)){
            System.out.println("Es viernes 13");
        }
    }
    public static boolean esViernes13(int month, int year){
        boolean viernes13 = false;
        GregorianCalendar calendari = new GregorianCalendar(year, month-1, 13);
        System.out.println(calendari.getTime());
        if(calendari.getTime().toString().startsWith("F")){
            viernes13=true;
        }
        return viernes13;
    }

}
