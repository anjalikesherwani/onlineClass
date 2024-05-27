class math{
    public int addi(int a,int b){
        return a+b;
    }
}




public class day3_classes{
    public static void main(String[] args) {
       math a1 = new math();
       int x = 4;
       int y = 6;
       int z = a1.addi(x,y);
       System.out.println(z);
       
       int x1 = 14;
       int y1 = 26;
       int z1 = a1.addi(x1,y1);
       System.out.println(z1);

       int x2 = 41;
       int y2 = 62;
       int z2 = a1.addi(x2,y2);
       System.out.println(z2);

    }
}