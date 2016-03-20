//要使用哪个策略,先产生出它的对象,然后放到封装角色中
class Client {
    public static void main(String args[]) {
        //声明上下文对象
        Context context = new Context();
        //声明一个具体的策略
        System.out.println("===儿童的主要工作===");
        context.setWork(new ChildWork());
        context.work();
        System.out.println("===成年人的主要工作===");
        context.setWork(new AdultWork());
        context.work();
        System.out.println("===老年人的主要工作===");
        context.setWork(new OldWork());
        context.work();
    }
}
