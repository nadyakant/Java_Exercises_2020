package com.softuni;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = getRectangleArea(width, length);
        System.out.printf("%.0f", area);
    }

    private static double getRectangleArea(double width, double length) {
        double rectangleArea = width * length;
        return rectangleArea;
    }
}
