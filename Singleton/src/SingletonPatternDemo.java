public class SingletonPatternDemo {

    public static void main(String[] args) {
        //illegal Construct
        //Compile time error: The constructr SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get only object available
        SingleObject object = SingleObject.getInstance();

        //Show message
        object.showMessage();
    }
}
