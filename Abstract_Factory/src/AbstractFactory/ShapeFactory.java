package AbstractFactory;
import interfaces.Color;
import interfaces.Shape;
import model.Circle;
import model.Rectangle;
import model.Square;


/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * AbstractFactory.ShapeFactory
 * Date: 5/31/2019
 * Time: 2:05 PM
 */
public class ShapeFactory extends AbstractFactrory {

     private Circle color = new Circle();

    @Override
    public Color getColor(String color) {

        return null;

    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){

            return null;

        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
