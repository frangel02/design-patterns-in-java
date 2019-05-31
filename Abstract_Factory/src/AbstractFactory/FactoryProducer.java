package AbstractFactory;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * FactoryProducer
 * Date: 5/31/2019
 * Time: 2:33 PM
 */
public class FactoryProducer {

    public static AbstractFactrory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
