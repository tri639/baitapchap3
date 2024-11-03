public class testbai3_7 {
    public static void main(String[] args) {
        Player3_7 p1 = new Player3_7(1, 10, 10);
        Player3_7 p2 = new Player3_7(2, 20, 20);
        Ball3_7 b1 = new Ball3_7(15, 15, 0);

        p1.move(2, 2);

        if (p1.near(b1)) {
            p1.kick(b1);
        }

        System.out.println("Ball position after kick: " + b1);
    }
}
