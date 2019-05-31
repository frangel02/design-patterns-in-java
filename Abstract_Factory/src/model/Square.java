package model;

import interfaces.Shape;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * model.Square
 * Date: 5/31/2019
 * Time: 10:37 AM
 */
public class Square implements Shape {

    @Override
    public void draw() {
       System.out.println("Inside Square ::draw() method.");
    }
}
