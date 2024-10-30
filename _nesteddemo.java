class nesteddemo {
    int a=10,b=20;
    class inner12{
        int x=100,y=200;
        void add(int i,int j){
            System.out.println(i+j);
            System.out.println(x+y);
            System.out.println(a+b);
        }
    }
}
class test{
    public static void main(String[] args) {
        nesteddemo a=new nesteddemo();
        nesteddemo.inner12 b=a.new inner12();
        b.add(20000, 40000);
    }
}
