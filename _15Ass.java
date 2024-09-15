class checkingSpeedExp extends RuntimeException {
    checkingSpeedExp(String args) {
    super(args);
    }
    }
    
    class vehical15 {
    void set_speed(int speed) {
    System.out.println("Check the Speed of Vehical");
    }
    }
    class truck15 extends vehical15 {
    void set_speed(int speed) {
    try {
    if (speed < 120) {
    System.out.println("You can go on the Road");
    } else {
    throw new checkingSpeedExp("You are fined with 20000 Rs.");
    }
    } catch (checkingSpeedExp er) {
    System.out.println(er);
    }
    }
    }
    class submarines15 extends vehical15 {
    void set_speed(int speed) {
    try {
    if (speed < 220) {
    System.out.println("You can swim in Ocean");
    } else {
    throw new checkingSpeedExp("You are fined with rs.80000 , Overspeeding on the Ocean");
    
    }
    } catch (checkingSpeedExp er) {
    System.out.println(er);
    }
    }
    }
     class Assment15 {
    public static void main(String[] args) {
    truck15 ob1 = new truck15();
    submarines15 ob2 = new submarines15();
    ob1.set_speed(200);
    ob2.set_speed(250);
    }
    }
