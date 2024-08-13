public class Earth {
    public static void main(String[] args) {
        new Thread(() ->
        {
            System.out.println("New Thread With Lembda Expresion");
        }).start();
    }
}
