class Students{
    static String name;
    String roll = "1" ;
    int [] marks = {98,97,87,67,78};
    String email = "anjali@gmail.com";
    char a = '@';
    boolean laptop = true;

   

   

    public void display(){
        System.out.println("Name : "+name + " "+"roll : "+roll + " "+ "marks : "+marks + " "+ "email : "+email + " "+"char : "+a + " "+"laptop : "+laptop );
    }
}



public class Classes_day3{
    public static void main(String[] args) {
        Students a1 = new Students();
        Students a2 = new Students();
        Students a3 = new Students();
        Students a4 = new Students();
        Students a5 = new Students();
        

        a1.name = "Anjali";
        a1.roll = "1";
        a1.email = "anjali@gmail.com";
        
        a1.name = "vaishu";
        a1.roll = "1";
        a1.email = "vaishu@gmail.com";

        a1.name = "jyoti";
        a1.roll = "1";
        a1.email = "jyoti@gmail.com";

        a1.name = "sakshi";
        a1.roll = "1";
        a1.email = "sakshi@gmail.com";

        a1.name = "anu";
        a1.roll = "1";
        a1.email = "anu@gmail.com";


        a1.display();
        a2.display();
        a3.display();
        a4.display();
        a5.display();







        // a1.name = "Anjali";
        // a1.roll = "1";
        // a1.marks = new int[]{98,97,87,67,78};
        // a1.email = "anjali@gmail.com";
        // a1.a = '@';
        // a1.laptop = true;

        
        // a1.display();


    }
}