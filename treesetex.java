import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
public class treesetex {
    public static void main(String[] args) {
        HashSet<Integer>h01=new HashSet<>();
        h01.add(10);
        h01.add(20);
        h01.add(30);
        h01.add(40);
        h01.add(50);
        h01.add(60);
        h01.add(70);
      Set<Integer> h02 = new TreeSet<>(h01);
      for(int e:h02){
        if(e<=40)
        System.out.println(e);
      }
      //question 
      System.out.println(h02.equals(h01));

    }
}
