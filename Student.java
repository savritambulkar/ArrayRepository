public class Student{
    String name = "savri"+"tambulkar";
    int RollNo =  12345;
    public void Showdata(){
        System.out.println("sleeping");
        System.out.println(name);
        System.out.println(RollNo);
    }
}
class Drive  extends Student{
public static void main(String[] args) {
    Student ob =new Student(); 
    ob.Showdata();
}
}
class Rooms extends Drive{
    public static void main(String[] args) {
        Student sc =new Student();
        sc.Showdata();
    }
}