class Test100 implements Runnable {
   public void run(){
        System.out.println("Thread Method");
    }
    public static void main(String[] args) {
        Test100 t=new Test100();
        Thread th=new Thread(t);
        th.start();
        t.run();
        th.interrupt();
        th.currentThread();
    }
}
