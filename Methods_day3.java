public class Methods_day3{


    //we cannot use return function in void , 
    // in this we can define all variable like(int,String,array)
    static void hello(){
        System.out.println("Hello World");
         
    } 

    static String hel(){
        return("Welcome to java Methods");
         
    } 
    static int hell(){
        return(10977);
         
    } 

    public static void main(String[] args) {
        hello();
        String a= hel();
        System.out.println(a);
        
        int b= hell();
        System.out.println(b);

        // int a = 10; 
        // int b= 20;
        // int c= a+b;
        // System.out.println(c);




    }
}