import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class B{
    public static void main(String[] args) {
        LinkedList<String>link=new LinkedList<>();
        link.add("Savri");
        link.add("Swasti");
        link.add("priya");
        link.add("komal");
        link.add("Sonali");
        link.add("Swati");
        link.addFirst("harshita");
        link.addLast("Worry");
        
        
        
        System.out.println(link);
        System.out.println(link.get(0));
        System.out.println(link.getFirst());
        System.out.println(link.getLast());
        System.out.println(link);
        System.out.println(link.reversed());
        System.out.println(link.removeFirst());
        System.out.println(link);
        System.out.println(link.removeLast());
        System.out.println(link);
        System.out.println(link.clone());
        System.out.println(link);
        System.out.println(link.set(2, null));
        System.out.println(link);
        Collections.unmodifiableList(link);
        System.out.println(link.add("Komal"));
        System.out.println(link.set(4, null));
        System.out.println(link);
        System.out.println(link.contains(link.get(5)));
        System.out.println(link.pop());
        //immutable banane ki method hai
        List<String>obj=Collections.unmodifiableList(link);
        //obj.add("jyoti");
        System.out.println(obj);
        

    }
}
