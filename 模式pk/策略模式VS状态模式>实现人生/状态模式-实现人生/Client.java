public class Client {
    public static void main(String args[]) {
        //定义一个普通人
        Human human = new Human();
        //设置一个人的初始状态
        human.setHumanState(new ChildState());
        //行为执行
        System.out.println("===儿童的主要工作===");
        human.work();
        System.out.println("\n===成年人的主要工作===");
        human.work();
        System.out.println("\n===老年人的主要工作===");
        human.work();
    }
}
