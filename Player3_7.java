public class Player3_7 {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player3_7(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }
    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }
    public void jump(float zDisp) {
        z += zDisp;
    }
    public Boolean near(Ball3_7 ball) {
        double distance = Math.sqrt(Math.pow(x - ball.getX(), 2) + Math.pow(y - ball.getY(), 2));
        return distance < 8;
    }
    public void kick(Ball3_7 ball) {
        ball.setXYZ(ball.getX(), ball.getY(), ball.getZ() + 5);
    }
}
