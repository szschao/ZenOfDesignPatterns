import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends DynamicProxy{
    public static <T> T newProxyInstance(Subject subject){
        //获取ClassLoader的接口(代理类的加载器)
        ClassLoader loader = subject.getClass().getClassLoader();
        //获取接口数组(代理类所实现的所有接口)
        //得到了java动态生成的代理类$Proxy0的java.lang.Class对象。
        //同时，java还让这个动态生成的$Proxy0类实现了要代理类的实现的所有接口，并继承了Proxy接口。
        Class<?>[] classes = subject.getClass().getInterfaces();
        //获得handler
        //实例化这个动态生成的$Proxy0类的一个实例，实例化代理类的构造函数为Proxy(InvocationHandler h)
        //也就是说要实例化这个动态生成的$Proxy0类，必须给它一个InvocationHandler参数
        //通过InvocationHandler接口,所有方法都由该Handle来进行处理,即所有被代理的方法都由InvocationHandler接管实际的处理任务
        InvocationHandler handler = new MyInvocationHandler(subject);
        //得到$Proxy0 extends Proxy implements Subject的类(此处的Proxy是指DynamicProxy中的)
        return newProxyInstance(loader,classes,handler);
    }
}
