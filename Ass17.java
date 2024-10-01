public class Ass17 {
    public static void main(String[] args) {
    try {
    if (args.length == 3) {
    throw new IllegalArgumentException(" Arguments Number are not match");
    
    }
    String a = args[0];
    String b = args[1];
    String c = args[2];
    } catch (IllegalArgumentException er) {
    System.out.println(er);
    }
    }
    }
