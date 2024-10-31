import java.util.Scanner;
class _1Assg{
    public static void num()
    {
Scanner ob=new Scanner(System.in);
     System.out.println("Enter  First digit");
     int a = ob.nextInt();
     
     System.out.println("Enter Sec digit");
     int b = ob.nextInt();
     System.out.println("Enter Third digit");
        int c = ob.nextInt();
        System.out.println("Enter four digit");
        int d = ob.nextInt();
      if((++a==b) && (++b==c) && (++c==d) )  
      {
        System.out.println("true");
      }
    
      else {
        System.out.println("False");
      }
    }
    public static void main(String[] args) {
        num();
    }
}
