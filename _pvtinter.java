abstract interface  Siya{
    default void call(){
         massg();
         text();
    System.out.println("Default Method");
    }
    void ram();
    private void massg(){
     System.out.println("Private Method ");   
    }
    private static void text(){
        System.out.println("Private Static Method ");
    }
    
    

}
class miscall implements Siya{
    public static void main(String[] args) {
      Siya A=new miscall();
      A.call();
      A.ram();
       
        System.out.println("Hello Would");
    }
    @Override
    public void ram(){
     System.out.println("Abstract Method ");
    }

}
