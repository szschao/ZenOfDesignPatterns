public abstract class AbsActor{
    //演员都能够演一个角色
    public void act(Role _role){
        System.out.println("演员可以扮演任何角色");
    }
    //可以演功夫
    public void act(KungFuRole _role){
        System.out.println("演员都可以演功夫角色");
    }
}
