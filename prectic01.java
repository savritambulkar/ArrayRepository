import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class prectic01{
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        //question - 1
        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        System.out.println(list);
        //question  -2
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //question  - 3
       // list.add(0,"Blue");
        System.out.println(list.iterator());
        System.out.println(list);
        //question  - 4
        System.out.println(list.get(1));
        //question  - 5
        list.add("White");
        System.out.println(list);
        // question   - 6
        System.out.println(list.remove(3));
        System.out.println(list);
        // question - 7
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+"  =  "+i);
            
        }
        // question  - 8
          Collections.sort(list);
          System.out.println(list);
        
        // question -  9
        ArrayList<String>list01=new ArrayList<>(list);
        System.out.println(list01);
        // question - 10
       Collections.shuffle(list);
       System.out.println(list);

        // question  - 11
        System.out.println(list.reversed());
        // question  - 12
        System.out.println(list.equals(list01));
        // question - 13
        Collections.swap(list01, 0, 0);
        System.out.println(list);
        // question - 14
        list.trimToSize();
        System.out.println(list.size());
        // question -  15
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" "+i);
        }
        //ArrayList list03=(ArrayList)list.clone();
                                      
    }
}