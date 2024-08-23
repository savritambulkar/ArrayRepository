public class question29 {
    public static void main(String[] args) {
        int a[]=new int[]{1, 3, 5, 7, 9};
        int rem=0;
        int s=0;
        for(int i=0;i<a.length;i++){
            rem=rem+a[i];
             s=rem/a.length;
           
        }
        System.out.println(s);
    }
}
