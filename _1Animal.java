 class Animal2 {
    public void eating()
    {
       System.out.println("i am animal"); 
    }
    public void sleeping()
    {
        System.out.println("sleep");
    }
}
   class cat1 extends Animal2
{
  public void meow(){
    System.out.println("meow");
}
}
class Runer
{
    public static void main(String[] args) {
        cat1 ob=new cat1();
        ob.eating();
        ob.sleeping();
        ob.meow();
    }
}
