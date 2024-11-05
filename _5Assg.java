 import java.util.Scanner;
 class Primenum
 {
    public void show()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter num");
        int n = ob.nextInt();
           
        if((n%2==0)&&(n%3==0))
        {
            System.out.println("prime number");
            ob.close();
        }
        }
}       
    public static void main(){
        Primenum ob = new Primenum();
                ob.show(); 
    }
 