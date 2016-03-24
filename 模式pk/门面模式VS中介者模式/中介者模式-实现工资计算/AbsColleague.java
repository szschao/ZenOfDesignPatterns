public abstract class AbsColleague{
    //每个同事类对中介者非常了解
    protected AbsMediator mediator;
    public AbsColleague(AbsMediator _mediator){
        this.mediator = _mediator;
    }
}
