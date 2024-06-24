enum ald{
    anjali,vaishu,prachi,jyoti;

    private ald(){
        System.out.println("private constructor called");
    }
    public void show(){
        System.out.println("show method called");
    }
}

public class enum1 {
    public static void main(String[] args) {
        ald obj = ald.anjali;
        obj.show();


        // for(ald a: ald values())
        // System.out.println(obj[1].ordinal()+" "+a.name());


        // ald obj = ald.anjali;
        // System.out.println(obj);
        // System.out.println(ald.anjali.toString());

        // ald obj= ald.values()[1];
        // System.out.println(obj);

        // ald[] obj= ald.values();

        // for(int i = 0; i <= obj.length-1; i++ )
        // System.out.println(obj);


        // for(ald a: ald.values()){
        //     System.out.println(a);
        // }

    }
}
