public class Formulas {

    public static double valueHypotenuse;

    public static double findRectangleArea(double base, double height) {
        return base * height;
    }

    //teorema de Pitágoras para encontrar longitud: c = sqrt(a^2 + b^2)
    public static double findLengthPythagoras(double a, double b) {
        valueHypotenuse =  Math.sqrt(a * a + b * b); //teorema de Pitágoras para encontrar hipotenusa/longitud:
        return valueHypotenuse;
    }

    public static double findTriangleArea(double height, double base){
        double area = (height * base) / 2.0;
        return area;
    }

    public static double findPerimeter(double sideA, double sideB, double sideC, Trapezium trapezium) {
        double sideD = trapezium.getSideD();
        double perimeter = sideA + sideB + sideC + sideD;
        return perimeter;
    }

}

