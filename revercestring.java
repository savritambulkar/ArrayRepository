public class revercestring {
    public static void main(String []args){
    //    String st="ABCD";
    //    for(int i=st.length()-1;i>=0;i--){
    //     char s=st.charAt(i);
    //     System.out.print(s);
    //    }
       String st="success";
       int count=0;
       for(int i=0;i<st.length();i++)
       {
       char s=st.charAt(i);
        if(s== 's')
        {
          count++;
        }
       }
       System.out.println(count);
    }
}
