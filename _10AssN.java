class Truck {
    void speed(){
     int a=10,b=0,c;
     c=a/b;
     System.out.println(c);
    }
}
class Car extends Truck{
    void speed(){
     String name=null;
    }
}
class Trien extends Car{
    public static void main(String[] args) {
    try{
        Truck a=new Truck();
        a.speed();
        Car b=new Car();
        b.speed();
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
}
