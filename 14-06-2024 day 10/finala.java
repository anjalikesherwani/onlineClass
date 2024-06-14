class adit{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    //setter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    //getter
    public int getage(){
        return age;
    }
    void display(){
        System.out.println(name+" "+age);
    }
}

public class finala {
    public static void main(String[] args) {
        adit student = new adit();
        student.setName("123");
        student.setName("anjali");
        student.setAge(12);
        System.out.println(student.getName());
        System.out.println(student.getage());
        // System.out.println(student.name);
        // student.age = 21;
        // student.display();
        // System.out.println(student.name);
        
    }
}
