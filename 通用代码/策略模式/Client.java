//要使用哪个策略,先产生出它的对象,然后放到封装角色中
class Client {
    public static void main(String args[]) {
        //声明一个具体的策略
        Strategy strategy = new ConcreteStrategy1();
        //声明上下文对象
        Context context = new Context(strategy);
        //执行封装后的方法
        context.doAnything();
    }
}
