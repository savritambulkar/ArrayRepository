import java.util.*;
public class Example{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number a");
        int a = sc.nextInt();
        System.out.println("Enter ur number b");
        int b = sc.nextInt();
        char op = sc.next().charAt(0);
       
        if(op=='+'){
            System.out.println(a+b);
        }else 
        {
            if(op=='-'){
                System.out.println(a-b);   
            }else {
                if(op=='*'){
                    System.out.println(a*b);
                }else     
                 System.out.println(a/b);
            }
        }
       

    }
}

    