class Client {
    public static void main(String args[]) {
        //聘来一个老演员
        AbsActor actor = new OldActor();
        //定义一个功夫角色
        Role role = new KungFuRole();
        //让老演员开始演戏
        actor.act(role);
        //让老演员开始演功夫角色
        actor.act(new KungFuRole());
    }
}
