//对客户发出的命令进行封装,不使用String--没有约束力
public class AddRequirementCommand extends Command{
    //执行增加一项需求的命令
    public void execute(){
        //找到需求组
        super.rg.find();
        //增加一份需求
        super.rg.add();
        //页面也要增加
        super.pg.add();
        //功能也要增加
        super.cg.add();
        //各自给出计划
        super.rg.plan();
        super.pg.plan();
        super.cg.plan();
    }
}
