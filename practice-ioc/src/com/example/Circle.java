package com.example;
import java.util.Scanner;
public class Circle implements Shape{
    private double r;
    Circle(double r){
        this.r = r;
    }

    public double getArea(){
        return Math.PI * r * r;
    }
}
