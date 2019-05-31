package model;

import interfaces.Color;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * model.Green
 * Date: 5/31/2019
 * Time: 10:46 AM
 */
public class Green implements Color {

    @Override
    public void fill() {
       System.out.println("Inside Green ::fill() method.");
    }
}
