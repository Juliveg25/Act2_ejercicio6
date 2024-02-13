
public class Main {
    public static void main(String[] args) {

        double base = 10; //b
        double height = 3; //altura rectangulo c
        double heightA = height * 2; //a

        Figures rectangle = new Figures(Formulas.findRectangleArea(base, height));
        System.out.println("Rectangle area: " + rectangle);

        Figures triangle = new Figures(Formulas.findLengthPythagoras(base, height));
        System.out.println("Triangle hypotenuse: " + triangle);

        Figures triangleArea = new Figures(Formulas.findTriangleArea(height, base));
        System.out.println("Triangle area: " + triangleArea);

        Trapezium trapezium = new Trapezium(Formulas.valueHypotenuse);
        double trapeziumPerimeter = Formulas.findPerimeter(heightA, base, height, trapezium);
        System.out.println("Trapezium perimeter: " + String.format("%.2f", trapeziumPerimeter));

        double trapeziumArea = 0.5 * (heightA + base) * height;
        System.out.println("Trapezium area: " + String.format("%.2f", trapeziumArea) + " m^2");

    }
}