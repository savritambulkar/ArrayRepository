import java.io.*;
public class _Newone {
    public static void main(String[] args) {
        try{
            FileInputStream F1=new FileInputStream("Ques.txt");
            FileInputStream F2=new FileInputStream("Count.txt");
            SequenceInputStream S1=new SequenceInputStream(F1, F2);
            int i=0;
            while ((i=S1.read())!=-1) {
                System.out.println((char)i);
                
                S1.close();
                F1.close();
                F2.close();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
