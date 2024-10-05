public class conteiner <T> {
    T value;
    public void show(){
    System.out.println(value.getClass());
    }
}
 class Demo{
 public static void main(String[] args) {
   conteiner<String> c=new conteiner<>();
   c.value="10";
     c.show();
    conteiner<Integer> c1=new conteiner<>();
    c1.value=20;
    c1.show();

 }
}
