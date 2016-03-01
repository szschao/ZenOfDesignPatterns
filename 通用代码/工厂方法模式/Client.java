//Define an interface for creating an object,but let subclasses decide which class to instantiate.
//Factory Method lets a classes defer instantiation to subclasses.
public class Client {
    public static void main(String args[]) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
    }
}
