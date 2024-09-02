import java.util.HashSet;
public class hashsetex{
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(10);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(60);
        System.out.println(hs);
        hs.add(70);
        System.out.println(hs);
    }
}