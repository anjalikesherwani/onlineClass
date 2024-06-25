//abstract
// abstract class A{
//     abstract void display();
// }

//concrete
// class B extends A{
//     public void display(){
//         System.out.println("Hello World");
//         }
//         }

interface A{
    void display();
}



public class class1 {

    public static void main(String[] args) {
        // B obj = new B();
        // obj.display();

        A obj = () -> System.out.println("lambda Function");
        obj.display();

        
    }
}