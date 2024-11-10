class outer {
    int a=10;
    int b=20;
    int c=a+b;
    
class inner{
    int x=20;
    int y=30;
    int z=y+x;
}
  public static void main(String[] args) {
    outer o=new outer();
    System.out.println(o.c);
    outer.inner i=o.new inner();
    System.out.println(i.z);
    
  }  
}
