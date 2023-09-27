import java.util.*;

class Shape {
    private double length;
    private double height;

    Shape() {
        this.length = 2;
        this.height = 3;
    }

    @Override
    double calculateArea() {
        return length * height;
    }
    
}

class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius; 
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea() {
        return length * width; 
    }
}

public class Main {
	public static void main(String[] args) {
		Shape s = new Circle(4); // result depended on 
        printArea(s);
    }

    public static void printArea(Shape s) {
        System.out.println(s.calculateArea());
    }
}

