public abstract class HumanState{
    //定义一个环境角色,提供子类访问
    protected Human human;
    //设置环境角色
    public void setHuman(Human _human){
        this.human = _human;
    }
    //行为1
    public abstract void work();
}
