/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * FactoryPatternDemo
 * Date: 2/14/2019
 * Time: 4:15 PM
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.

        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();


        //get an object of Rectangle and call its draw method.

        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Circle
        shape2.draw();


        //get an object of Square and call its draw method.

        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of Square
        shape3.draw();


    }
}
