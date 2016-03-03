public class KungFuRole implements Role{
    //武功天下第一的角色
    public void accept(AbsActor _actor){
        _actor.act(this);
    }
}
