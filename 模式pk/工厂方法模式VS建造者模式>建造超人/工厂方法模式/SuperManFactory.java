public class SuperManFactory{
    //定义一个生产超人的工厂
    public static ISuperMan createSuperMan(String _type){
        //根据输入参数产生不同的超人
        if(_type.equalsIgnoreCase("adult")){
            //生产成人超人
            return new AdultSuperMan();
        }else if(_type.equalsIgnoreCase("child")){
            //生产未成年人
            return new ChildSuperMan();
        }else{
            return null;
        }
    }
}
