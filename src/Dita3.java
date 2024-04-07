import java.util.Scanner;

public class Dita3 {
    public static void main(String[] args) {
            
             
        int x=27;
        if(x < 18)
        {
            System.out.println("nuk keni drejte vote"); //veprimi i if
        }
        
        else{
        
            System.out.println("keni drejte vote");
        }

        int y=27;
        if(y<18) 
        {
            System.out.println("nuk keni drejte vote"); //veprimi i if
        }
        
        else if(y>=18){
            System.out.println("keni drejte vote");
          
        }
        
        else{
            System.out.println("Kjo nuk eshte moshe "); 
              
        }
          

        System.out.println("Sheno moshen");
        Scanner d = new Scanner(System.in);
        int age=d.nextInt();

        if(age>18){
            System.out.println("mosha juaj eshte mbi 18");
        }
        else{
             
            System.out.println("mosha juaj eshte nen 18");
        }



        //Detyra nga dita 3
    
        String ngjyra="kuqe";
        if(ngjyra=="kuqe"){
            System.out.println("ndaluni");
        }
        else if(ngjyra=="verdhe"){
            System.out.println("behu gati");
        }
    
        else if(ngjyra=="gjelber"){
            System.out.println("nisu");}
   
        else{
            System.out.println("semafori eshte prishur");
        }





        String emri="Enis";

        if(emri.length()<=5){
        System.out.println("emri eshte me i shkurt se 5 karaktere");

        }
        else if (emri.length()>5 && emri.length()<=10){
        System.out.println("emri eshte me ne mes 5 dhe 10 karaktere");

        }
        else if(emri.length()>10){
        System.out.println("emri eshte me i gjate 10 karaktere");

        }
        else{
            System.out.println("nuk eshte emer");
        }

        boolean isAdmin = true;




        
        if (isAdmin) {
            System.out.println("Miresevini administratore");
        } 

    }
}
