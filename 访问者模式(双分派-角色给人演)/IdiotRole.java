public class IdiotRole implements Role{
    //一个弱智角色
    public void accept(AbsActor _actor){
        _actor.act(this);
    }
}
