//建立一个超人工厂,年复一年的生产超人,对于具体生产出的产品,不管是成年超人还是未成年超人都是一个模样
public class Client {
    public static void main(String args[]) {
        //生产一个成年超人
        ISuperMan adultSuperMan = SuperManFactory.createSuperMan("adult");
        //展示一下超人的技能
        adultSuperMan.specialTalent();
    }
}
