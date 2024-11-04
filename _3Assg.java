import java.util.Scanner;
class _3Assg {
    public static void factor()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter your num");
        int n= ob.nextInt();
        int result ;
        while (n%3==0) {
         System.out.println("3");
         n=n/3;
        }
        System.out.println(n);
        ob.close();
    }
    public static void main(String[] args) {
        factor();
    }
}
