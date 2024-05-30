class Conditions{
    public static void main(String[] args) {
       

       //conditions & Loops


//DO WHILE
//do while loop is used when we want to execute a block of code at least once.
      int a = 0;
      do{
        System.out.println("number is : " + a);
        a++;
        }while(a<=5);
        


//WHILE LOOP
//while(condition){statement,operators}

        // int a= 0;
        // while (a<= 100){
        //     System.out.println(a);
        //     a +=5;
        // } 

        // float a= 0;
        // while (a<= 50){
        //     System.out.println(a);
        //     a +=5;
        // } 

        // int a= 0;
        // while (a<= 100){
        //     System.out.println("hello");
        //     a += 5;
        // } 


//FOR LOOP
    //    for (int a = 1; a<= 10; a += 1) {
    //         System.out.println(a);
    //    }

    //     for (int a = 1; a<= 100; a += 6) {
    //         System.out.println(a);
    //    }

    //  for (int a = 1; a<= 10; a *= 2) {
    //         System.out.println(a);
    //    }

//NESTED FOR LOOP

//    for (int a = 1; a<= 5; a++) {
//         System.out.println(a);
   
//    for (int b= 100; b<=105; b++){
//         System.out.println(b);
//    }   
//    }

    

//SWITCH CASE
    //    String marks = "A";
        
    //     switch(marks){
    //         case "A":
    //             System.out.println("Fail");
    //             break;
    //         case "B":
    //             System.out.println("Pass");
    //             break;
    //         case "C":
    //             System.out.println("Distinction");
    //             break;
    //         case "D":
    //             System.out.println("Out of range");
    //             break;
    //         default:
    //             System.out.println("Invalid Marks");
    //     }

        // int marks = 14;
        
        // switch(marks){
        //     case 10:
        //         System.out.println("Fail");
        //         break;
        //     case 20:
        //         System.out.println("Pass");
        //         break;
        //     case 30:
        //         System.out.println("Distinction");
        //         break;
        //     case 40:
        //         System.out.println("Out of range");
        //         break;
        //     default:
        //         System.out.println("Invalid Marks");
        // }

//IF LOOP
        // int marks = 45;

        // String outp = (marks >= 40) ? "Pass" : "Fail";
        // System.out.println(outp);
        
        // System.out.println( (marks >= 40) ? "Pass" : "Fail");



        // if (marks>=75 && marks <=100) {
        //     System.out.println("Distintion");
        // }
        // else if (marks>=60 && marks<75) {
        //     System.out.println("First Class");
        // }
        // else if (marks>=50 && marks<60) {
        //     System.out.println("Second Class");
        // }
        // else if (marks>=40 && marks<50) {
        //     System.out.println("Pass Class");
        // }
        // else if (marks>=0 && marks<40) {
        //     System.out.println("Fail");
        // }
        // else{
        //     System.out.println("Invalid Marks");
        // }


    }
}