//GeometricObject
//        -color: String
//        -filled: boolean
//        -dateCreated: java.util.Date
//        +GeometricObject()
//        +GeometricObject(color: String, filled: boolean)
//        +getColor(): String
//        +setColor(color: String): void
//        +isFilled(): boolean
//        +setFilled(filled: boolean): void
//        +getDateCreated(): java.util.Date
//        +toString(): String

package com.Lamar.Chapter11;

import java.util.Date;

public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

//    Construct a default geometric object
    public GeometricObject(){
        dateCreated = new java.util.Date();
    }

//    Construct a geometric object with the specified color and filled value
    public GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

//    Getter and Setters


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}
