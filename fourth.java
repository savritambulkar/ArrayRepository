public class fourth {
    public static void main(String[] args) {
        int a[]={9,12,6,2,8,3,5,1,4,7,10,11,0};
        int temp;
    
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]<a[j+1]){
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                  
                  
                }
               
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
