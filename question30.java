public class question30 {
    public static void main(String[] args) {
        int a[]=new int[]{2, 3, 2, 5, 2, 6, 2};
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==2){
                count++;
            }
           
        }
        System.out.println(count+" = "+2 );
    }
}
