import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {
    public static void main(String[] args) {
        ArrayList<String>li=new ArrayList<>();
        li.add("Savri");
        li.add("kanita");
        li.add("Sakcshi");
        li.add("Swasti");
        li.add("Sonali");
        System.out.println(li);
        // ArrayList<String>li01=new ArrayList<>(li);
        // li01.add("Chanchal");
        // li01.add("Trapti");
        // System.out.println(li01);
        // System.out.println(li);

        ArrayList <String> li02=(ArrayList<String>) li.clone();
        li02.add("Payal");
        li02.add("Purnima");
        System.out.println(li02);
        System.out.println(li);
        List<String> ob=Collections.unmodifiableList(li);
        System.out.println(ob);       
    }
}
