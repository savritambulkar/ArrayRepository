//  class index implements Runnable {  // when we create a thread and run it (extend  Thread  or implement Runnable)
//    public void run(){
//     for(int i=0;i<=100;i++){
//       System.out.println(i);
//     }
//    }
// }
// class demo{
//   public static void main(String args[]){
//    index obj= new index();
//    Thread t= new Thread(obj);
//    t.start();
//   }
// }

// import java.io.IOException;

// class index extends Thread{
//   boolean stop =false;
//   public void run(){
//     for(int i=0;i<=100;i++){
//       System.out.println(i);
//       if(stop )return;
//     }
//   }
// }
// class  demo {
// public static void main(String args[]) throws IOException

//      {
//   index obj =new index();
//   Thread t= new Thread(obj);
//   t.start();
//   System.in.read();
//   obj.stop =true;
// } 
  
// }

// import java.io.IOException;
// class index implements Runnable{
//  public void run(){
//   task1();
//   task2();
//   task3();
//  }
// void task1(){
//   System.out.println("task 1 is completed...");
// }
// void task2(){
//   System.out.println("task 2 is completed...");
// }
// void task3(){
//   System.out.println("task 3 is completed...");
// }
//  }
// class demo{
//     public static void main(String[] args) throws Exception{
//       index obj = new index();
//       Thread t = new Thread((Runnable) obj);
//       t.sleep(2000);
//       t.start();

//   }
// }

public class index implements Runnable {

  String src;
   index(String src){
    this.src=src;
  }
  public void run(){
    for(int i=1;i<=10;i++){
      System.out.println(i);
      try{
    Thread.sleep(2000);
      }
      catch(InterruptedException e){
        e.printStackTrace();
      }
    }
  }
}
class threads {
  public static void main(String[] args) {
    index ob1= new index ("This is First Thread");
    index ob2 =new index("this is second Thread ");
    Thread t1=new Thread(ob1);
    Thread t2 =new Thread(ob2);
    t1.start();   t2.start();
  }
}