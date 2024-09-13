public class _Ass18 {
    public static void main(String[] args) {
    int arr[] = { 1, 4, 6, 8, 9 };
    try {
   // System.out.println(arr[4]);
    System.out.println(arr[7]);
    } catch (IndexOutOfBoundsException e) {
    e.printStackTrace();
    }
    finally{
    System.out.println("This is the final Block");
    }
    }
    }
