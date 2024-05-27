class Operators {
    public static void main(String[] args){
        
        //Arithmetic Operators
        // 1.Addition   
        int a= 5,b=45,c=67;
        int d =a+b+c;
        System.out.println("num is: "+a);
        System.out.println("num is: "+b);
        System.out.println("num is: "+c);
        System.out.println("adding num: " + d); //Adds together all values

        // 2.Subtraction
        int e= 546,f=45;
        float g=67.45f;
        float h = e-f-g;
        System.out.println("num is: "+e);
        System.out.println("num is: "+f);
        System.out.println("num is: "+g);
        System.out.println("subtacting num: " + h);  //Subtracts values from another

        // 3.Multiplication
        int i= 15,j=45,k=6;
        int l = i*j*k;
        System.out.println("num is: "+i);
        System.out.println("num is: "+j);
        System.out.println("num is: "+k);
        System.out.println("Multipling num: " + l); //Multiplies three values

        // 4.Division
        int m= 115,n=45;
        float o=m/n;
        System.out.println("num is: "+m);
        System.out.println("num is: "+n);
        System.out.println("dividing num: " + o); //Divides one value by another

        // 5.Modulus
        int p= 115,q=45;
        int r = p%q;
        System.out.println("num is: "+p);
        System.out.println("num is: "+q);
        System.out.println("modulus num: " + r);  //Returns the division remainder

        // 6.Increment
        int s= 115;
        int t = s++;
        System.out.println("Increment num is: "+s); //Increases the value of a variable by 1
        int u = ++s;
        System.out.println("Increment num is: "+s); //Increases the value of a variable by 1

        // 7.Decrement
        int v= 115;
        int w = v--;
        System.out.println("Decrement num is: "+v); //Decreases the value of a variable by 1
        int x = --v;
        System.out.println("Decrement num is: "+v); //Decreases the value of a variable by 1


        //ASSIGNMENT OPERATORS
        // 1. =
        int x1 = 12;
        System.out.println("Original value of x1 : " + x1);
        System.out.println("= : " + x1);

        // 2. +=
        int x2 = 12;
        System.out.println("Original value of x2 : " + x2);
        x2 += 5;
        System.out.println("+= : " + x2);

         // 3. -=
        int x3 = 12;
        System.out.println("Original value of x3 : " + x3);
        x3 -= 5;
        System.out.println("-= : " + x3);

        // 4. *=
        int x4 = 12;
        System.out.println("Original value of x4 : " + x4);
        x4 *= 5;
        System.out.println("*= : "+ x4);

        //5. /=
        int x5 = 12;
        System.out.println("Original value of x5 : " + x5);
        x5 /= 5;
        System.out.println("/= : " + x5);

        // 6. %=
        int x6 = 12;
        System.out.println("Original value of x6 : " + x6);
        x6 %= 5;
        System.out.println("%= : " + x6);

         // 7. &=
        int x7 = 12;
        System.out.println("Original value of x7 : " + x7);
        x7 &= 5;
        System.out.println("&= : " + x7);

        // 8. |=
        int x8 = 12;
        System.out.println("Original value of x8 : " + x8);
        x8 |= 5;
        System.out.println("|= : "+ x8);
        
        // 9. ^=
        int x9 = 12;
        System.out.println("Original value of x9 : " + x9);
        x9 ^= 5;
        System.out.println("^= : " + x9);

         // 10. >>=
        int x10 = 12;
        System.out.println("Original value of x10 : " + x10);
        x10 >>= 2;
        System.out.println(">>= : " + x10);

        // 11. <<=
        int x11 = 12;
        System.out.println("Original value of x11 : " + x11);
        x11 <<= 2;
        System.out.println("<<= : "+ x11);

        //COMPARISON OPERATORS  OR RELATIONAL OPERATORS
        //Always gives values in true or false
        // 1. == (Equal to)
        int x12 = 12;
        int x13 = 12;
        System.out.println("Original value of x12 : " + x12);
        System.out.println("Original value of x13 : " + x13);
        System.out.println("== : " + (x12 == x13));

        //2. != (	Not equal)
        int x14 = 12;
        int x15 = 13;
        System.out.println("Original value of x14 : " + x14);
        System.out.println("Original value of x15 : " + x15);
        System.out.println("!= : " + (x14 != x15));

        //3. > (Greater than)
        int x16 = 12;
        int x17 = 13;
        System.out.println("Original value of x16 : " + x16);
        System.out.println("Original value of x17 : " + x17);
        System.out.println("> : " + (x16 > x17));

        //4. < (Less than)
        int x18 = 12;
        int x19 = 13;
        System.out.println("Original value of x18 : " + x18);
        System.out.println("Original value of x19 : " + x19);
        System.out.println("< : " + (x18 < x19));

        //5. >= (Greater than or equal to)
        int x20 = 12;
        int x21 = 13;
        System.out.println("Original value of x20 : " + x20);
        System.out.println("Original value of x21 : " + x21);
        System.out.println(">= : " + (x20 >= x21));

        //6. <= (Less than or equal to)
        int x22 = 12;
        int x23 = 13;
        System.out.println("Original value of x22 : " + x22);
        System.out.println("Original value of x23 : " + x23);
        System.out.println("<= : " + (x22 <= x23));

        //LOGICAL OPERATORS
        //Always gives values in true or false
        //1. && (Logical And)
        int x24 = 12;
        int x25 = 13;
        System.out.println("Original value of x24 : " + x24);
        System.out.println("Original value of x25 : " + x25);
        System.out.println("&& : " + (x24 > x25 && x24 < x25));  //Returns true if both statements are true

        //2. || (Logical OR)
        int x26 = 12;
        int x27 = 13;
        System.out.println("Original value of x26 : " + x26);
        System.out.println("Original value of x27 : " + x27);
        System.out.println("|| : " + (x26 > x27 || x26 < x27));   //Returns true if one of the statements is true

        // 3. ! (Logical Not)
        int x28 = 12;
        System.out.println("Original value of x28 : " + x28);
        System.out.println("! : " + (! (x28 > x27 || x26 < x27)));   //Reverse the result, returns false if the result is true



    }
}
