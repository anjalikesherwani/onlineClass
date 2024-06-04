class Student{
    static String name;
    String a;

    public static void show(Student Student){
        System.out.println(Student.name);
    }
}

public class methH {
    public static void main(String[] args) {
      

       Student adit = new Student();
       adit.name = "Anjali";
       
       Student cits = new Student();
       cits.name = "jaanvi";

       Student cts = new Student();
       cts.name = "vaishu";

       adit.show(adit);
       cits.show(cits);
       cts.show(cts);
    }
}
