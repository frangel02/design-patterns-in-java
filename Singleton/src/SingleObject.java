/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * SingleObject ${FILENAME}
 * Date: 2/14/2019
 * Time: 12:37 AM
 * Created by frodriguez on
 */
public class SingleObject {

    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //Make the Constructor private so that this class cannot be
    //instantiated

    private SingleObject(){

    }

    //Get the only Object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
