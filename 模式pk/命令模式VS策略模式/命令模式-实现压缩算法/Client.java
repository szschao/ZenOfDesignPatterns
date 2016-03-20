class Client {
    public static void main(String args[]) {
        //首先声明调用者Invoker
        Invoker invoker = new Invoker();
        //定义一个发送给接收者的命令
        AbstractCmd command = new GzipCompressCmd();
        /*
         *算法替换
         *AbstractCmd command = new ZipCompressCmd();
         */
        //把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action("c:\\windows","d:\\windows.zip");
    }
}
