import java.util.Scanner;
class _4Assg {
   public static void Evan()
   {
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter Num");
    int a= ob.nextInt();
    int count=1;
     
    if(a%2==0)
    {
System.out.println("Evan");
    }
    else
    {
        System.out.println("Odd");
    }
}
   public static void main(String[] args) {
    Evan();
   }
} 

