public class comparestring {
    public static void main(String[] args) {
        String sr="This is Exercise 1";              
        String str="This is Exercise 2";
        int result=sr.compareTo(str);
        if(result<0){
            System.out.println(sr+" is less than   "+str);
        }
        else if(result>0){
            System.out.println(sr+" is greater than  "+str);
        }
        else{
            System.out.println(sr+" are both equal  "+str);
        }
        
    }
}
