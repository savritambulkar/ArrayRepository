public class West{
   public static void main(String[] args) {
      int a[]=new int[]{10,20,30,40};
      int Ar[]=new int[a.length+6];
      for(int i=0;i<a.length;i++){
         Ar[i]=a[i];
      }
      Ar[a.length]=50 ;
      Ar[a.length+1]=60;
      Ar[a.length+2]=70;
      Ar[a.length+3]=80;
      Ar[a.length+4]=90;
      Ar[a.length+5]=100;
      a=Ar;
      for(int i=0;i<a.length;i++){
         System.out.println(a[i]);
      }
   }
}