import java.util.ArrayList;
import java.util.Iterator;

public class iteratex {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(60);
        list.add(20);
        list.add(70);
        list.add(40);
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
