class array45{
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3};
        int ar[]=new int[]{a.length+1};
        
        for(int i=0;i<a.length;i++){
            a[i]=a[i];
        }
        ar[a.length]=4;
           a=ar;
        for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
        }
        }
    }

