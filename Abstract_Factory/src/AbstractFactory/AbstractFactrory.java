package AbstractFactory;

import interfaces.Color;
import interfaces.Shape;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * Abstract
 * Date: 5/31/2019
 * Time: 11:11 AM
 */
public abstract class AbstractFactrory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
