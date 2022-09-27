import java.util.Scanner;
public class Main {
    public static double diameterTetragon(Double tetragonSide){
        return Math.sqrt(2) * tetragonSide;
    }

    public static int minValueCircles(double tetragonSide, double diameter, double radius, int count) {

        if (radius < diameter / 4) {
            count = -1;
        } else if (radius >= diameter / 2) {
            count = 1;
        } else if (Math.pow(radius, 2) >= (Math.pow(tetragonSide, 2) / 4) + (Math.pow(tetragonSide, 2) / 16)) {
            count = 2;
        } else if (Math.pow(radius, 2) >= (Math.pow(tetragonSide, 2) / 4) + (Math.pow(tetragonSide, 2) / 36)) {
            count = 3;
        } else  {
            count = 4;
        }
        return count;
    }
    public static void readValues() {
        var scanner = new Scanner(System.in);

        System.out.print("Pls write side of tetragon: ");
        var tetragonSide = scanner.nextDouble();

        System.out.print("Pls write value radius: ");
        var radius = scanner.nextDouble();

        var diameter = diameterTetragon(tetragonSide);

        int count = 0;

        System.out.println("Радиус 1 круга = " + radius);

        int counter = minValueCircles(tetragonSide, diameter, radius, count);

        System.out.println(counter);

    }






    public static void main(String[] args){
        readValues();
    }
}