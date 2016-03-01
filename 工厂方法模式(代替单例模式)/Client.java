public class Client{
    public static void main(String args[]) {
        SingletonFactory sf = new SingletonFactory();
        sf.getSingleton().doSomething();
    }
}
