public class Dita2 {
    public static void main(String[] args) {
        
        //Operatoret artimetik
        int a =12;
        int b=10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        
        //modulo
        int c=10;
        int s=3;
        System.out.println(c%s); 
        
        //Operatoret Percaktues
        
        int r=4;
        int d=7;
        System.out.println(r);  //4
        r+=3; // c=c+3 //4 7
        System.out.println(r);
         r-=4; //4-4 =0
        System.out.println(r);
             r*=4; 
        System.out.println(r);
           r/=4;
        System.out.println(r);
           r%=4;
        System.out.println(r); 
        
        
    //operatoret krahasues
    
        int e=12;
        int f=15;
        System.out.println(e==f); //false
        System.out.println(e!=f); //true
        System.out.println(e>f); //false
        System.out.println(e<f); //true
        System.out.println(e<=f);//true
        System.out.println(e>=f); //false
        
        
        //operatoret logjik
        //AND 
        int g=11;
        int h=14;
        System.out.println(g > 20 && h<10 && h>10); //false && false && true  = false 
        
        System.out.println(g > 20 || h<10 || h>10); //false || false||true= true
            
        System.out.println(!(g > 20 || h<10 || h>10)); //false || false||true= false
        
        
        
    //Metoda Math
    
        System.out.println(Math.max(5,7));
        System.out.println(Math.min(5,7));
        System.out.println (Math.sqrt(81));
        System.out.println(Math.abs(-7));
        System.out.println (Math.pow(3,2));
        System.out.println(Math.random());
            
        
        System.out.println (Math.pow(7,5));  
        System.out.println (Math.random()*100);  
        
        String teksti="Cacttus   edu";
        System.out.println("gjatesia e stringut eshte"+teksti.length()); //14
  
    } 

}
