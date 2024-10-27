import java.io.File;
import java.io.FileInputStream;
//import java.io.FileOutputStream;

 public class Test{
    public static void main(String[] args) {
        try{
           // File f=new File("Exam.txt");
            File f1=new File("Exam2.txt");
           // FileOutputStream fout=new FileOutputStream(f,true);
            FileInputStream fout2=new FileInputStream(f1);
            //String data="Java is Semple";
            String data2="Java is Platform Indipendent";

           // byte b[]=data.getBytes();
            byte b1[]=data2.getBytes();
          //  fout.write(b);
            fout2.read(b1);
           // System.out.println(data);
            System.out.println(data2);
        }
        catch(Exception e){
         e.printStackTrace();
        }
    }
}