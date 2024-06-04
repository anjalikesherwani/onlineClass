class Student{
    int age = 31;
    String name = "Anjali";
    public void show(){
    System.out.println(name+":"+age);
    }
}

class Students{
    static String name;
    public void show(){
    System.out.println(name);
    }
}

public class dirH{
    public static void main(String[] args){
        int age = 21;
        String name = "AnjaliKesherwani";
        System.out.println(name+":"+age);

        Students s1 = new Students();
        s1.name = "jaanvi";
        s1.name = "jyoti";
        Students s2 = new Students();
        Students s3 = new Students();
        Students s4 = new Students();
        s2.name = "anaya";
        s3.name = "anjali";
        s4.name = "vaishnavi";

        s1.show();
        s2.show();
        s3.show();
        s4.show();



    }
}