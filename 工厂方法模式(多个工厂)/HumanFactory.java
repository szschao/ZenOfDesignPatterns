public class HumanFactory extends AbstractHumanFactory {

    //泛型:必须是Class类,必须是Human的实现类
    public <T extends Human> T createHuman(Class<T> c){
        //定义一个生产的人种
        Human human=null;
        try{
             //产生一个人种
             human=(T)Class.forName(c.getName()).newInstance();
        }catch(Exception e){
            System.out.println("人种生成错误");
        }
        return (T)human;
    }
}
