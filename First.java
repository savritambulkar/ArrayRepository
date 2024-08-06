class First{
    public static void main(String[] args) {
        First.sum(new int[]{10,20,30,40});
    }
    static void sum(int [] no){
        int Total=0;
        for(int i: no){
            Total=Total+i;
        }
        System.out.println(Total);
    }
}