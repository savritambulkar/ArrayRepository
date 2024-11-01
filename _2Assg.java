 import java.util.Scanner;
 class _2Assg {
    public static void positive()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter Number");
          int n= ob.nextInt();
          int result=0;
        while (n!=0) {
            int r=n%10;
            result=r;
            n=n/10;
        }
        System.out.println(result); 
        ob.close();        
    }
    public static void main(String[] args) {
        positive();
    }
}
