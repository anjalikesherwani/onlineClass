// import java.util.Scanner;

public class day4Scanner{
    public static void main(String[] args) {
        
        java.util.Scanner a = new java.util.Scanner(System.in);
        
//all datatypes of userinput
        // System.out.println("Enter your number: ");
        // short number = a.nextShort();
        // System.out.println("Your number is : "+ number);

        // System.out.println("Enter your height: ");
        // float height = a.nextFloat();
        // System.out.println("Your height is : "+ height);

        // System.out.println("Enter your height: ");
        // double height = a.nextDouble();
        // System.out.println("Your height is : "+ height);


        // System.out.println("Enter your phone no. : " );
        // long phone = a.nextLong();
        // System.out.println("Your phone no. is : "+ phone);
         

        // System.out.println("Enter your age: ");
        // byte age = a.nextByte();
        // System.out.println("Your age is : "+age);   

        // System.out.println("Do you have a laptap");
        // boolean laptop = a.nextBoolean();

        // if (laptop){
        //     System.out.println("You have a laptop");
        // }
        // else{
        //     System.out.println("You don't have a laptop");
        // }




        // System.out.println("Enter your name: ");
        // String name = a.nextLine();
        // System.out.println("your name is: "+name);        
        // System.out.println("Enter password: ");
        // String pass = a.nextLine();
        // System.out.println("your name is: "+pass); 

// //nested if 
//         if(name.equals("Anjali") || name.equals("")){
//             if(pass.equals("admin")){
//                 System.out.println("Welcome Admin");
//             }
//         }
//             else{
//             System.out.println("Not an authorised user or Logging out....");
//         }
        

//if loop
            // if(name.equals("Anjali") && pass.equals("admin")){
            //     System.out.println("Welcome Admin");
            // }
            // else{
            //     System.out.println("Not an authorised user or Logging out....");
            // }
        

        // if(name.equals("Anjali") || name.equals(null)){
        //     System.out.println("Authorised user");
        // }
        // else{
        //     System.out.println("Not an authorised user or Logging out....");
        // }



        // System.out.println("Enter your age: ");
        // int age = a.nextInt();

        // if (age>=18){
        //     System.out.println("You are an adult");
        // }
        // else{
        //     System.out.println("You are not an adult");
        // }

//for loop

        System.out.println("Enter number :");
        int num = a.nextInt();
        System.out.println("Table of :" + num);
        for (int i=1; i<=10; i++){
            System.out.println(num+"*"+i+"="+i*num);
        }

    }
}