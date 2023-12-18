package Interfaceandpackagedemo.test;

import Interfaceandpackagedemo.shape.Rectangle;
import Interfaceandpackagedemo.shape.Square;
import Interfaceandpackagedemo.shape.Polygon;


public class ShapeTest {
    public static void main(String[] args) {
        // Create an object of the Square class
        Square square = new Square(5.0f);

        // Calculate and display the area and perimeter of the square
        square.calcArea();
        square.calcPeri();

        // Create an object of the Rectangle class
        Rectangle rectangle = new Rectangle(6.0f, 4.0f);

        // Calculate and display the area and perimeter of the rectangle
        rectangle.calcArea();
        rectangle.calcPeri();
        
       System.out.println("============================");
     // Create objects of the Square and Rectangle classes
        Polygon square1 = new Square(5.0f);
        Polygon rectangle1 = new Rectangle(6.0f, 4.0f);

      // Calculate and display the area and perimeter of the square using the Polygon interface
        square.calcArea();
        square.calcPeri();

      // Calculate and display the area and perimeter of the rectangle using the Polygon interface
        rectangle.calcArea();
        rectangle.calcPeri();
    }
}
