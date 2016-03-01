class Client {
    public static void main(String args[]) {
        //声明出主角
        Originator originator = new Originator();
        //定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        //初始化当前状态
        originator.setState("心情很棒!");
        System.out.println("====男孩现在的状态====");
        System.out.println(originator.getState());
        //创建一个备忘录
        caretaker.setMemento("001",originator.createMemento());
        originator.setState("心情很忐忑!");
        System.out.println("====男孩现在的状态====");
        System.out.println(originator.getState());
        //创建一个备忘录
        caretaker.setMemento("002",originator.createMemento());
        //男孩追女孩,状态改变
        originator.setState("男孩心情可能很差!");
        System.out.println("=====男孩追女孩后的状态===");
        System.out.println(originator.getState());
        //追女孩失败,恢复原状态
        originator.restoreMemento(caretaker.getMemento("001"));
        System.out.println("====男孩恢复001后的状态====");
        System.out.println(originator.getState());
        //追女孩失败,恢复原状态
        originator.restoreMemento(caretaker.getMemento("002"));
        System.out.println("====男孩恢复002后的状态====");
        System.out.println(originator.getState());
    }
}
