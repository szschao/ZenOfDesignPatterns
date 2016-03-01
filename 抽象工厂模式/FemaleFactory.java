//女娲有两个八卦炉,这个负责生产女性
public class FemaleFactory implements HumanFactory{
    //生产出黑人女性
    public Human createBlackHuman(){
        return new FemaleBlackHuman();
    }
    //生产出白人女性
    public Human createWhiteHuman(){
        return new FemaleWhiteHuman();
    }
    //生产出黄人女性
    public Human createYellowHuman(){
        return new FemaleYellowHuman();
    }

}
