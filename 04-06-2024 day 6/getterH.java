class ald{
 

    private String name;
    private int age;
    private String city;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}

public class getterH {
    public static void main(String[] args) {
        
        ald a1 = new ald();
        System.out.println(a1.getName());
        

    }
}
