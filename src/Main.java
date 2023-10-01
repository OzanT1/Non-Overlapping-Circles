import java.util.Random;

public class Main {

    public static boolean isEligable(MyCircle[]list, MyCircle circle){
        for (int i = 0; i < list.length; i++){

            if (list[i].distance(circle) < list[i].getR() + circle.getR()){
                return false;
            }
            if (circle.getX() + circle.getR() > 1 || circle.getX() - circle.getR() < 0
            || circle.getY() + circle.getR() > 1 || circle.getY() - circle.getR() < 0
            ){
                return false;
            }

            if (list[i+1] == null){
                break;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int canvasWidth = 600, canvasHeight = 600;
        StdDraw.setCanvasSize(canvasWidth, canvasHeight);
        StdDraw.setScale(0, 1);

        Random randomGenerator = new Random();
        MyCircle firstCircle = new MyCircle(0.5, 0.5, 0.097);


        int N = 100;
        MyCircle [] circleList = new MyCircle[N];
        circleList[0] = firstCircle;


        int counter = 1;
        while (counter < N){
            double minRadius = 0.01;
            double maxRadius = 0.2;
            double myVal1 = randomGenerator.nextDouble();
            double myVal2 = randomGenerator.nextDouble();
            double myVal3 = minRadius + (maxRadius - minRadius) * randomGenerator.nextDouble();

            MyCircle newCircle = new MyCircle(myVal1, myVal2, myVal3);
            if (isEligable(circleList, newCircle)){
                circleList[counter] = newCircle;
                counter++;
            }
        }
        for (int i = 0; i < circleList.length; i++){
            circleList[i].draw();
        }

    }
}
