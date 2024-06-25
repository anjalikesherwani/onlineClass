interface A{
    int mathy(int a,int b,int c);
}


public class alld {
    public static void main(String[] args) {
        A obj = (a,b,c) -> a+b+c;
        int res = obj.mathy(3, 7, 9);
        System.out.println(res);
        // System.out.println(obj.mathy(10,20,30));
    }
}
