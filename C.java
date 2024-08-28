import java.util.HashSet;

public class C {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        // set.add("Ram");
        // set.add("Shyam");
        // set.add("sita");
        // set.add("Rukmani");
        // set.add("Ramayan");
        // set.add("Shyamlal");
        // set.add("sitaram");
        // set.add("Rukmani");
          set.add(1);
          set.add(2);
          set.add(10);
          set.add(21);
          set.add(11);
          set.add(12);
          set.add(15);
          set.add(23);
          set.add(14);
          set.add(20);
          set.add(19);
          set.add(27);
          System.out.println(set);
         System.out.println( set.hashCode());
         System.out.println(set.isEmpty());
         System.out.println(set.retainAll(set.newHashSet(0)));
        System.out.println(set);
    }
}
