package AbstractFactory;

import interfaces.Color;
import interfaces.Shape;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * AbstractFactoryPatternDemo
 * Date: 5/31/2019
 * Time: 2:40 PM
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args){

        //get shape factory
        AbstractFactrory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Shape Circle
        shape1.draw();


        //get an object of shape Rectangule
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Shape Circle
        shape2.draw();

        //get an object of shape SQUARE
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of Shape Circle
        shape3.draw();


        //get color factory
        AbstractFactrory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Color RED
        Color color1 = colorFactory.getColor("RED");

        //call fill method of Color Red
        color1.fill();

        //get an object of colort BLUE
        Color color2 = colorFactory.getColor("GREEN");

        //call fill
        color2.fill();

        //get an object of Color Blue
        Color color3 = colorFactory.getColor("BLUE");

        //call fill method of Color Blue
        color3.fill();



    }
}
