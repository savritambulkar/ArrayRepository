class IntMarkCheckExp extends RuntimeException {
    IntMarkCheckExp(String args) {
    super(args);
    }
    }
    class ExtMarkCheckExp extends RuntimeException {
    ExtMarkCheckExp(String args) {
    super(args);
    }
    }
    class CheckNumber {
    void checkNum(int IntMark, int ExpMark) {
    try {
    if (IntMark > 40) {
    throw new IntMarkCheckExp("Internal Marks is Exceed");
    
    } else {
    System.out.println("Internal Under control");
    }
    } catch (IntMarkCheckExp er) {
    er.printStackTrace();
    }
    
    try {
    if (ExpMark > 60) {
    throw new ExtMarkCheckExp("External Marks is
    
    Exceed");
    
    } else {
    System.out.println("External Under control");
    }
    } catch (ExtMarkCheckExp er) {
    er.printStackTrace();
    }
    }
    }
 class Assement19 {
    public static void main(String[] args) {
    CheckNumber ob = new CheckNumber();
    ob.checkNum(10, 80);
    }
    }
