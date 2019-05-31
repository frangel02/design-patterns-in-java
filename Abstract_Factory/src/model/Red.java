package model;

import interfaces.Color;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * model.Red
 * Date: 5/31/2019
 * Time: 10:45 AM
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red ::fill() method.");
    }
}
