import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class Oues04 {
    public static void main(String[] args) {
        try{
            int count=0;
            File f1=new File("Oues.txt");
         FileInputStream fs =new FileInputStream(f1);
         String data ="   ";
         while (true) {
            int x=fs.read();
            if(x=='t'){
                count++;
            }
            if(x==-1){
                break;
            }
            data =data+(char)x;

         }
         System.out.println(count);
         System.out.println(data);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
