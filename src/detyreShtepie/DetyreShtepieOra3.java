package detyreShtepie;

import java.util.Scanner;

public class DetyreShtepieOra3 {
    public static void main(String[] args){

        //Detyra 1
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Vendoseni nje tekst.");

        text=scanner.nextLine();
        scanner.close();

        if(text.length() > 8){
            System.out.println("Keni qasje!");
        }else if(text.length() < 8){
            System.out.println("Nuk keni qasje");
        }else {
            System.out.println("Nuk eshte tekst");

        }

        //Detyra2

        String fjala = "Cacttus Education";
        int gjatesia_e_stringut = fjala.length();
        System.out.println(gjatesia_e_stringut);
    }
}
