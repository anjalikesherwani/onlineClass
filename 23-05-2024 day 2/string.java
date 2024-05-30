class string{
    public static void main(String[] args){
        String s1 = "Hello";
        System.out.println(s1);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: "+txt.length());
        
        System.out.println("string is in Lowercase: "+txt.toLowerCase()); 
        System.out.println("string is in Uppercase: "+txt.toUpperCase()); 
    
        String text = "Please locate where 'locate' occurs!";
         System.out.println(text.indexOf("locate"));
    
    }
}