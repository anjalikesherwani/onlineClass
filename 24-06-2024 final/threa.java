class thread1 extends Therad{
    public void run(){
        for(int i=0;i<=100; i++){
        System.out.println("therad1");
}}}

public class threa {
    public static void main(String[] args) {
        thread1 obj = new thread1();
        obj.start();


    }
    
}
