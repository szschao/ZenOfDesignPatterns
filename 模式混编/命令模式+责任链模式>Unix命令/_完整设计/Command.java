import java.util.List;
import java.util.ArrayList;

public abstract class Command{
    //每个命令类都必须有一个执行命令的方法
    public abstract String execute(CommandVO vo);
    //建立链表
    protected final List<? extends CommandName> buildChain(Class<? extends CommandName> abstractClass){
        //取出所有的命令下的子类
        List<Class> classes = ClassUtils.getSonClass(abstractClass);
        //存放命令的实例,并建立链表关系
        List<CommandName> commandNameList = new ArrayList<CommandName>();
        for(Class c:classes){
            CommandName commandName = null;
            System.out.println(c.getName());
            try{
                //产生实例(在一个遍历中,类中的每个元素都是一个类名,然后根据类名产生一个实例.它会抛出异常,例如类文件不存在,初始化失败等)
                commandName = (CommandName)Class.forName(c.getName()).newInstance();
            }catch(Exception e){
                //TODO 异常处理
            }
            //建立链表
            System.out.println(commandNameList.size());
            if(commandNameList.size()>0){
                commandNameList.get(commandNameList.size()-1).setNext(commandName);
            }
            commandNameList.add(commandName);
        }
        return commandNameList;
    }
}
