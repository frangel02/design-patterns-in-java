package model;

import interfaces.Color;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * model.Blue
 * Date: 5/31/2019
 * Time: 10:56 AM
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue ::fill() method.");
    }
}
