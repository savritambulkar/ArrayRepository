
@FunctionalInterface
 interface CallHello {
public String sayHello();
   
}
// @FunctionalInterface
// interface MisHello extends CallHello{
//     public void sayHello();
// }
class Newlemda {
    public static void main(String[] args) {
        CallHello sayhello= () -> "Software Employee";
        CallHello say=()-> "Hello Lembda Expressesion"; {
          System.out.println(sayhello.sayHello());
          System.out.println(say.sayHello());
        };
    }
    
}