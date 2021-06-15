package lab2.doityourself1;

import lab2.doityourself1.entity.Rectangle;

public class MainThread {
    public static void main(String[] args) {
        //Declare and initialize an object of type Rectangle.
        Rectangle rectangle = new Rectangle(3, 4);

        //Show the rectangle on the screen console.
        System.out.println("Display Rectangle: ");
        rectangle.display();

        //Change the length and width of the rectangle.
        rectangle.setWidth(4);
        rectangle.setHeight(5);

        //Display to screen area and perimeter of this rectangle.
        System.out.printf("Area of rectangle: %d", rectangle.getArea());
        System.out.printf("\nPerimeter of rectangle: %d", rectangle.getPerimeter());
    }
}
