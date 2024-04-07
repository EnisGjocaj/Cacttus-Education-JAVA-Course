public class Dita1 {
    public static void main(String[] args) {
        System.out.println("Jemi duke mesuar JAVA"); //string
        System.out.println("Cacttus Edu");//number
        System.out.println(123);

        String emri = "Fatjona";//string
        System.out.println(emri);

        int post = 0;
        System.out.println(post); //nume ri plote

        float Myfloat = 5.5f;
        System.out.println(Myfloat);

        char shkronja = 'D';
        System.out.println(shkronja);

        boolean sakte = true;
        System.out.println(sakte);

        String name = "Fatjona";
        String surname = "Hoxhaj";
        int mosha = 27;

        System.out.println("emri im eshte " + name + " mbiemri eshte " + surname + "mosha ime eshte " + mosha + "vjec");
        int a = 5;
        int b = 7;
        System.out.println("shume e numrave eshte= " + (a + b));

        int mt = 70;
        float gjt = 1.80f;
        float bmi1 = mt / (gjt * gjt);
        System.out.println(bmi1);

        int mt1 = 80;
        float gjt1 = 1.77f;
        float bmi2 = mt1 / (gjt1 * gjt1);
        System.out.println(bmi2);

        boolean krahaso =(bmi1 > bmi2);
        System.out.println(krahaso);
        System.out.println("A eshte bm1 e nxenesit te pare me e madhe s enexenesit te dyte"+ krahaso);

    }
}
