class Trucks01 {
    public void truck(){
        System.out.println("Trucks");
    }
}
class car extends Trucks01{
    public void truck(){
        System.out.println("Trucks Woods");
    }
    public void car(){
        int a=10,b=0,c;
        System.out.println(a/b);
        super.truck();
    }
}
class Test extends car{
      public static void main(String[] args) {
        car a=new car();
        a.car();
        try{
            int x=10,y=0,z;
        System.out.println(x/y);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }    
}
