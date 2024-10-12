//import java.io.FileNotFoundException;
import java.io.FileInputStream;
//import java.io.IOException;
import java.io.*;
public class _experiment extends Exception{
    public static void main(String[] args)  {
      
       try{
        // FileInputStream FI=new FileInputStream("Count.txt");
        // BufferedInputStream BF=new BufferedInputStream(FI);
        FileOutputStream file=new FileOutputStream("Ques.txt");
         BufferedOutputStream Bf=new BufferedOutputStream(file);
        // int i=0;
        // while ((i=BF.read())!=-1) {
        //    System.out.print((char)i); 
        // }
    String greetting="Welcome tooooooo Experiment";
        byte b[]=greetting.getBytes();
       
        // file.write(b);
        // file.flush();
        // file.close();
        
    //    int i= file.read();
    //     file.close();
         //System.out.println((char)i);
        // file.close();
         System.out.println("Sucess");
       } 
       
       catch(Exception e){
        e.printStackTrace();
       } 
    }
}
