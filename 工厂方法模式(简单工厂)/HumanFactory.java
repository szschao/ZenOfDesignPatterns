public class HumanFactory {

    //简单工厂(去掉了Abstract Factory类)
    //简单却不利于扩展
    public static <T extends Human> T createHuman(Class<T> c){
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
