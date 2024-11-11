package com.example;
import java.util.Scanner;
public class Rectangle implements Shape{
    private double width, height;
    Rectangle(double x, double y){
        this.width = x;
        this.height = y;
    }
    @Override
    public double getArea() {
        return width * height;
    }
}
