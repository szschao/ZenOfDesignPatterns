class Client {
    public static void main(String args[]) {
        //定义我们的接头人
        Invoker xiaoSan = new Invoker();
        //客户增加一项需求
        System.out.println("---客户增加一项需求---");
        //客户给我们下命令
        Command arc = new AddRequirementCommand();
        //接头人接收到命令
        xiaoSan.setCommand(arc);
        //接头人执行命令
        xiaoSan.action();

        //客户增加一项需求
        System.out.println("---客户要求删除一个页面---");
        //客户给我们下命令
        Command dpc = new DeletePageCommand();
        //接头人接收到命令
        xiaoSan.setCommand(dpc);
        //接头人执行命令
        xiaoSan.action();

        //客户增加一项需求
        System.out.println("---客户要求回滚一个页面---");
        //客户给我们下命令
        Command cdpc = new CancelDeletePageCommand();
        //接头人接收到命令
        xiaoSan.setCommand(cdpc);
        //接头人执行命令
        xiaoSan.action();
    }
}
