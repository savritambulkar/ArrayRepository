 class Student1 {
    String name;
    int age;
    int emarks;
    public int data (int jmarks)
    {
        int total = jmarks+emarks;
        return total;
    }
}
class savri{
    public static void main(String[] args) 
    {
        Student1 sobj=new Student1();
        sobj.name="Rachan";
        sobj.age=20;
        sobj.emarks=25;
        int result =sobj.data(16);
        System.out.println(sobj.name+"scord"+result);
    }
}
