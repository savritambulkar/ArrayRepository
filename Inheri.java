 class Infobeans {
    public void java(){
        System.out.println("Learn java");
    }
    public void python()
    {
        System.out.println("Learn python");
    }
    public void  C()
    {
System.out.println("Learn C++");
    }
}
class Monika extends Infobeans{
    public void R()
    {
        System.out.println("Self Learn R");
    }
    public void Html()
    {
        System.out.println("Self Learn Html");
    }
    public void CSS()
    {
        System.out.println("Self Learn CSS");
    }
}
class Muskan extends Monika {
    public void javascript()
    {
        System.out.println("Too my Eff javascript");
    }
    public void DSA()
    {
        System.out.println("Too my eff DSA");
    }
}
class all{
    public static void main(String[] args) {
        Muskan ob=new Muskan();
        ob.C();
        ob.CSS();
        ob.DSA();
        ob.Html();
        ob.R();
        ob.java();
        ob.javascript();
    }
}
