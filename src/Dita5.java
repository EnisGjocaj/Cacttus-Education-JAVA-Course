public class Dita5 {
    public static void main(String[] args){
        //detyra1

        int x=1;
        while(x <= 10){
            System.out.println("Numri" + x);
            x++; 
        }

           
        int y=1;
        do{
            System.out.println("Numri" + y);
            y++;
        }
        while(y <= 10);


        //detyra 2 

        int here=1;
        while(here <= 5){
            System.out.println("JAVA is fun");
            here++; 
        }

        int numri;

        for(numri = 1; numri < 5; numri++){
            System.out.println("JAVA is fun");
        }


        //detyra 3

        int muaji = 9;
        
        switch (muaji) {
            case 1:
                System.out.println("Janar");
                break;
            case 2:
                System.out.println("Shkurt");
                break;
            case 3:
                System.out.println("Mars");
                break;
            case 4:
                System.out.println("Prill");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Qershor");
                break;
            case 7:
                System.out.println("Korrik");
                break;
            case 8:
                System.out.println("Gusht");
                break;
            case 9:
                System.out.println("Shtator");
                break;
            case 10:
                System.out.println("Tetor");
                break;
            case 11:
                System.out.println("Nentor");
                break;
            case 12:
                System.out.println("Dhjetor");
                break;
            default:
                System.out.println("Jo muaj");
                break;
        }


        //detyra4

        int numri_qe_shumezohet = 5;
        int num = 10; 
        
        System.out.println("Tabela e shumezimit per " + numri_qe_shumezohet + ":");
        
        for (int i = 1; i <= num; i++) {
            int rezultati = numri_qe_shumezohet * i;
            System.out.println(numri_qe_shumezohet + " * " + i + " = " + rezultati);
        }

        //break ne for loop

        int e;
        for(e = 1; e <= 7; e++){

            if(e == 3){ //pasi barazohet iteratori me 3 nderprehet loopa
                break;
            }

            System.out.println("Loopa perfundon:" + e);
        }


        //countinue 

        int numri1;
        for(numri1 = 1; numri1 <= 7; numri1++){

            if(numri1 == 3){ //pasi barazohet iteratori me 3 e kalon loopa
                continue;
            }

            System.out.println("Loopa perfundon:" + e);
        }


    }
}
