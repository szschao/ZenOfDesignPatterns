public class Context{
    //抽象策略
    private WorkAlgorithm workMethod = null;
    //getter/setter
    public WorkAlgorithm getWork(){
        return workMethod;
    }
    public void setWork(WorkAlgorithm _work){
        this.workMethod = _work;
    }
    //封装后的策略方法
    public void work(){
        this.workMethod.work();
    }
}
