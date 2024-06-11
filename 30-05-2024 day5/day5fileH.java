import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class day5fileH{
    public static void main(String[] args) {
        
//delete
        File a = new File("abcd.txt");

        if(a.exists()){
            a.delete();
            System.out.println("file deleted successfully");
        }
        else{
           System.out.println("file not found");
          
        }


// read
        // try{
        //     File a = new File("abc.txt");
        //     Scanner b = new Scanner(a);
        //     while(b.hasNextLine()){
        //         System.out.println(b.nextLine());
        //         }
            

        // }catch(Exception e){
        //     System.out.println("File not found");
        // }


//write
        // try{
        //     FileWriter a = new FileWriter("abc.txt");
        //     a.write("Hello World");
        //     a.close();
        //     System.out.println("File written successfully");
        //     }catch(Exception f){
        //         System.out.println("File can not be written");
        // }


// file details

        // File file = new File("C:\\Users\\ANJALI\\Desktop\\JAVA\\Online Class\\topics.txt");
        // if(file.exists()){
        //     // System.out.println("File found");
        //     System.out.println("File name is: "+ file.getName());
        //     System.out.println("Path is: "+ file.getAbsolutePath());
        //     System.out.println("Parent  is: "+ file.getParent());
        //     System.out.println("File size is: "+ file.length());
        //     System.out.println("File is readble: "+ file.canRead());
        //     System.out.println("File is writeable: "+ file.canWrite());

        // }
        // else{
        //     System.out.println("File not found");
        //     }



//create

        // try{
        //     if(file.createNewFile())
        //     {
        //     System.out.println("created successfully");
        //     }
        //     else{
        //         System.out.println("file already exists");
        //     } 
        // }
        //     catch(Exception e){
        //         System.out.println("file not created");
        //     }
    }
}