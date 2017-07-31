package pattern.singleton;

public class SingletonPatternDemo {
    public static void main(String [] args){
        //Error: have access to private
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //Show the message
        object.showMessage();

        //Get the only object available
        SingleObject object2 = SingleObject.getInstance();

        //Show the message
        object2.showMessage();

        //Assert object1 == object2
        System.out.println(object == object2);
        System.out.println(object.count == object2.count);
    }
}
