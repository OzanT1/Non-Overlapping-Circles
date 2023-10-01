import java.awt.*;

public class MyCircle {
    private double x; //center x coordinate
    private double y; //center y coordinate
    private double r; //radius

    public MyCircle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public void draw(){
        StdDraw.setPenColor(Color.red);
        StdDraw.filledCircle(getX(),getY(),getR());
    }
    public double distance(MyCircle otherCircle){
        double x1 = x;
        double y1 = y;
        double x2 = otherCircle.getX();
        double y2 = otherCircle.getY();
        double result = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

        return result;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }
}
