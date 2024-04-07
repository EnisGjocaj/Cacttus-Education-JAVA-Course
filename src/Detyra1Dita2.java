public class Detyra1Dita2 {
    public static void main (String [] args){
        
        //Detyra 1
        int gjatesia = 5;
        int gjeresia = 7;
        
        int perimetri = 2*(gjatesia + gjeresia);
        int syprina = gjatesia * gjeresia;
        
        System.out.println("Perimetri" + perimetri);
        System.out.println("Syprina" + syprina);
        
        //Detyra 2
        int num1 = 23;
        int num2 = 45;
        
        boolean vlera = num1 == num2;
        System.out.println(vlera);
        
        //Detyra 3
        int a = 55;
        int b = 70;
        
        boolean kushti1 = a < 50;
        boolean kushti2 = a < b;  
        
        System.out.println(kushti1 && kushti2);

        //Detyra 4
	    int numri_ne_fuqi = (int) Math.pow(7, 5);
	    System.out.println(numri_ne_fuqi);
        
	    //Detyra5
	    int randomNumber = (int) (Math.random() * 100) + 1;
        
        // Printing the random number
        System.out.println( randomNumber);
    }
}
