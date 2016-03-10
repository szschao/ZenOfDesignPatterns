//建造者必须关注超人的部件
public class Client {
    public static void main(String args[]) {
        //生产一个成年超人
        SuperMan adultSuperMan = Director.getAdultSuperMan();
        //展示一下成年超人
        System.out.println(adultSuperMan.getBody());
        System.out.println(adultSuperMan.getSpecialTalent());
        System.out.println(adultSuperMan.getSpecialSymbol());
    }
}
