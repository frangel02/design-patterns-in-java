package model;

import interfaces.Shape;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * model.Circle
 * Date: 5/31/2019
 * Time: 10:39 AM
 */
public class Circle implements Shape {

    @Override
    public void draw() {
       System.out.println("Inside Circle ::draw() method.");
    }
}
