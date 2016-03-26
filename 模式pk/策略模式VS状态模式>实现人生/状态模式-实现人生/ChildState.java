public class ChildState extends HumanState{
    //儿童的工作就是玩耍
    @Override
    public void work(){
        System.out.println("儿童的工作是玩耍!");
        super.human.setHumanState(Human.ADULT_STATE);
    }
}
