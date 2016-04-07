class Client {
    public static void main(String args[]) {
        //声明所有的处理节点
        CommandName handler1 = new LS();
        CommandName handler2 = new LS_A();
        CommandName handler3 = new LS_L();
        //设置链中的阶段顺序1-->2-->3
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        //提交请求,返回结果
        String response = handler1.handleMessage(new CommandVO());
    }
}
