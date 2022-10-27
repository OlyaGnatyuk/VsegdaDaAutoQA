package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World я " + System.getProperty("user.name"));
        System.out.println("Площадь квадрата со стороной 3 = " + calculateSquareOfSquare(3.0));
        System.out.println("Площадь круга с радиусом 4 = " + calculateCircleSquare(4.0));
        System.out.println("Площадь треугольника со сторонами 3, 4, 5 = " + calculateTriangleSquare(3.0, 4.0, 5.0));
    }

    public static double calculateSquareOfSquare(double side) {
        return side * side;
    }

    public static double calculateCircleSquare(double radius) {
        return Math.PI * radius * radius / 4;
    }

    public static double calculateTriangleSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

