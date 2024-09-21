import java.util.Scanner;
class oddNumExp extends RuntimeException {
oddNumExp() {
super("The numebr is Odd...");
}
}
class checkNumberodd {
void numCheck(int num) {
try {
if (num % 2 != 0) {
throw new oddNumExp();
} else {
System.out.println("the number is Even...");
}
} catch (oddNumExp er) {
er.printStackTrace();
}
}
}

public class _21Ass {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
checkNumberodd ob = new checkNumberodd();
System.out.println("Please Enter a Number");
int num = sc.nextInt();
ob.numCheck(num);
}
}
