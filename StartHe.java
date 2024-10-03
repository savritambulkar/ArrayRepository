public class StartHe {
    public static void main(String args[]){
        String str="Hello";
        int indexH=0;
        int indexe=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='H'){
                indexH=i;
            }
            if(str.charAt(i)=='e'){
                indexe=i;
            }
        }
        if(indexH == 0 && indexe == indexH+1){
            System.out.println("yes it start with He   : ");
        }
        else{
            System.out.println("Not start with He  : ");
        }

    }

}
