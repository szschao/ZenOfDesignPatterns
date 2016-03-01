//改进.限制单一的场景(深拷贝,浅拷贝)
class Client {
    public static void main(String args[]) {
        //声明出主角
        Originator originator = new Originator();
        //初始化当前状态
        originator.setState("心情很棒!");
        System.out.println("====男孩现在的状态====");
        System.out.println(originator.getState());
        //需要记录下当前的状态
        originator.createMemento();
        //男孩追女孩,状态改变
        originator.setState("男孩心情可能很差!");
        System.out.println("=====男孩追女孩后的状态===");
        System.out.println(originator.getState());
        //追女孩失败,恢复原状态
        originator.restoreMemento();
        System.out.println("====男孩恢复后的状态====");
        System.out.println(originator.getState());
    }
}
