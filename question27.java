public class question27{
    public static void main(String[] args) {
        int a[]=new int[]{3, 1, 4, 1, 5, 9};
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            //if(a[i]==a.length-3)
            if(a[i]==a.length-1){
                System.out.println(a[i]);
            }
        }
    }
}