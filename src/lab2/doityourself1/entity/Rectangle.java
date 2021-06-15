package lab2.doityourself1.entity;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {

    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void display() {
        for (int recRow = 0; recRow < height; recRow++) {
            for (int recCol = 0; recCol < width; recCol++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

    public int getArea() {
        int area = height * width;
        return area;
    }

    public int getPerimeter() {
        int perimeter = (height + width) * 2;
        return perimeter;
    }

}
