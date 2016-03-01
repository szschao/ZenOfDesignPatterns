//对客户发出的命令进行封装,不使用String--没有约束力
public class DeletePageCommand extends Command{
    //执行增加一项页面的命令
    public void execute(){
        //找到页面组
        super.pg.find();
        //增加一个页面
        super.pg.add();
        //给出计划
        super.pg.plan();
    }
}
