public class testbai3_4 {
    public static void main(String[] args) {
        bai3_4 b1 = new bai3_4(23, 59, 59);
        System.out.println("Initial Time: " + b1);
        System.out.println("Next Second: " +b1.nextSecond());
        System.out.println("Next Minute: " +b1.nextMinute());
        System.out.println("Next Hour: " +b1.nextHour());
        System.out.println("Previous Second: " + b1.previousSecond());
        System.out.println("Previous Minute: " + b1.previousMinute());
        System.out.println("Previous Hour: " + b1.previousHour());

    }
}
