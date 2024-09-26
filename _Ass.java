class Test {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        try{
            int a=100,b=0,c;
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
            e.printStackTrace();
        }
    }
}