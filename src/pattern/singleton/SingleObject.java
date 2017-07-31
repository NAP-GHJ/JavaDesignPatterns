package pattern.singleton;

public class SingleObject {

    //Value field of SingleObject
    int count = 0;

    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be instantiated
    private SingleObject(){}

    //Get the only object instance
    public static SingleObject getInstance(){
        instance.count++;
        return instance;
    }

    public void showMessage(){
        System.out.println(instance.count);
    }
}
