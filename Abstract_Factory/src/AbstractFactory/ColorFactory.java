package AbstractFactory;

import interfaces.Color;
import interfaces.Shape;
import model.Blue;
import model.Green;
import model.Red;


/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * ColorFactory
 * Date: 5/31/2019
 * Time: 2:28 PM
 */
public class ColorFactory extends AbstractFactrory{

    @Override
   public Color getColor(String color) {
        if(color == null){

            return null;

        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }

    @Override
   public Shape getShape(String shape) {
        return null;
    }
}
