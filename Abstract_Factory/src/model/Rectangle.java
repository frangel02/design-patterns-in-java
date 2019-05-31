package model;

import interfaces.Shape;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * model.Rectangle
 * Date: 5/31/2019
 * Time: 10:35 AM
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
       System.out.println("Inside Rectangle ::draw() method.");
    }
}
