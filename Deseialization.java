import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deseialization {
    public static void main(String[] args) {
        try{
            File k=new File("Employe.txt");
            FileInputStream fout=new FileInputStream(k);
            ObjectInputStream OS1=new ObjectInputStream(fout);
            Employe o=new Employe(103,"priya","25697556");
            OS1.readObject();
            OS1.close();
            System.out.println("Deserialzation....");
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
