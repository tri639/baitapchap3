import java.lang.Math;

public class bai3_6 {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public bai3_6(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        double angle = Math.toRadians(direction);
        xDelta = (float) (speed * Math.cos(angle));
        yDelta = -(float) (speed * Math.sin(angle));
    }
    public float getX() {
        return x;
    }
    public void setX9() {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY() {
        this.y = y;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius() {
        this.radius = radius;
    }
    public float getXDelta() {
        return xDelta;
    }
    public void setXDelta() {
        this.xDelta = xDelta;
    }
    public float getYDealta() {
        return yDelta;
    }
    public void setYDelta() {
        this.yDelta = yDelta;
    }
    public void move() {
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }
    public void reflectVertical() {
        yDelta = -yDelta;
    }
    public String toString() {
        return "Ball[(" + x + ", " + y + ") speed = " + xDelta + ", " + yDelta + "]";
        }
    }





