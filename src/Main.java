import java.util.Scanner;
public class Main {


    public static double tetragonSquare(Double tetragonSide) {

        return Math.pow(tetragonSide, 2);
    }

    public static double CircleSquare(Double radius) {

        return Math.PI * Math.pow(radius, 2);
    }

    public static double diameterTetragon(Double tetragonSide){
        return Math.sqrt(2) * tetragonSide;
    }

    public static double circleSquare4(Double radius) {
        var fourCirclesSqure = CircleSquare(radius) * 4;
        System.out.println("Square of 4 Circles = " + fourCirclesSqure);
        return fourCirclesSqure;
    }

    public static void result() {
        var scanner = new Scanner(System.in);

        System.out.print("Pls write side of tetragon: ");
        var tetragonSide = scanner.nextDouble();

        System.out.print("Pls write value radius: ");
        var radius = scanner.nextDouble();

        var diameter = diameterTetragon(tetragonSide);

        var circleSq4 = circleSquare4(radius);

        System.out.println("Радиус 1 круга = " + radius);




        if ( circleSq4 < tetragonSquare(tetragonSide) ||  radius  < diameter / 4 ) {
            System.out.println("4 круга не достаточно");
        }

        else if(radius >= diameter / 2 ){
            System.out.println("Достаточно минимум 1 круг");
        }

        else if(Math.pow(radius, 2) >= (Math.pow(tetragonSide, 2) / 4) + (Math.pow(tetragonSide, 2) / 16) && radius >= diameter / 4){
            System.out.println("Достаточно минимум 2 круга");
        }

        else if (radius >= diameter / 4 && Math.pow(radius, 2) >= (Math.pow(tetragonSide, 2) / 4) + (Math.pow(tetragonSide, 2) / 36) && radius >= diameter / 4) {
            System.out.println("Достаточно минимум 3 круга");
        }

        else if (radius >= diameter / 4) {
            System.out.println("4 круга достаточно");
        }





    }

    public static void main(String[] args){
        result();
    }
}