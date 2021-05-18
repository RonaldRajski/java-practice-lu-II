package com.Lamar.Chapter11;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius =  radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    //    return radius
    public double getRadius() {
        return radius;
    }

    //    set new radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //    return Area
    public double getArea(){
        return radius * radius * Math.PI;
    }


//    return diameter
    public double getDiameter(){
        return 2 * radius;
    }


//    return Perimeter
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void printCircle(){
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }
}
