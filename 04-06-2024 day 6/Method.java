class Ald{
    static int a;
    static int b;
   
    public static void add(){
        int c = a+b;
        System.out.println("a+b : "+ c);
        // System.out.println("a+b : "+ (a+b));
    }
    
}

public class Method {
    public static void main(String[] args) {
        
        // Class A1 = Class.forName("Ald");
        // System.out.println(A1);
   
        Ald a1 = new Ald();
        a1.a = 10;
        a1.b = 20;
        a1.add();

        Ald a2 = new Ald();
        a2.a = 30;
        a2.b = 20;
        a2.add();


    }
    
}
