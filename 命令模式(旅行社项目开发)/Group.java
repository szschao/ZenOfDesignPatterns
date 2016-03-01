public abstract class Group{
    //甲乙双方分开办公,如果甲需要和某个组讨论,首先要找到这个组
    public abstract void find();
    //被要求增加功能
    public abstract void add();
    //被要求删除功能
    public abstract void delete();
    //被要求修改功能
    public abstract void change();
    //被要求给出所有的变更计划
    public abstract void plan();
    //每个接受者都要对直接执行的任务可以回滚
    public void rollBack(){
        //依据日志进行回滚
        System.out.println("依照日志进行回滚");
    }
}
