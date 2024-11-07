 class Man {
    public static void work()
    {
        System.out.println("work");
    }
    public static void Office()
    {
        System.out.println("Office");
    }
    public static void cabin()
    {
        System.out.println("cabin");
    }
}
    class Employe extends Man{
        public static void Id()
        {
          System.out.println("12345");
        }
        public static void name()
        {
            System.out.println("savri");
        }
        public static void main(String[] args) {
            Employe ob=new Employe();
                cabin();
                Office();
                Id();
                name();
                work();

        }
    }

