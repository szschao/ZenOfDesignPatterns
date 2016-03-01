public class NvWa {
    public static void main(String args[]) {
        //男性生产线
        HumanFactory maleHumanFactory =new MaleFactory();
        //女性生产线
        HumanFactory femaleHumanFactory =new FemaleFactory();

        //成产线建立完毕,开始生产人
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human maleWhiteHuman = maleHumanFactory.createWhiteHuman();
        Human maleBlackHuman = maleHumanFactory.createBlackHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        Human femaleWhiteHuman = femaleHumanFactory.createWhiteHuman();
        Human femaleBlackHuman = femaleHumanFactory.createBlackHuman();

        //人都成产完毕
        System.out.println("--生产了一个黄人男性--");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();
        System.out.println("--生产了一个白人男性--");
        maleWhiteHuman.getColor();
        maleWhiteHuman.talk();
        maleWhiteHuman.getSex();
        System.out.println("--生产了一个黑人男性--");
        maleBlackHuman.getColor();
        maleBlackHuman.talk();
        maleBlackHuman.getSex();

        System.out.println("--生产了一个黄人女性--");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
        System.out.println("--生产了一个白人女性--");
        femaleWhiteHuman.getColor();
        femaleWhiteHuman.talk();
        femaleWhiteHuman.getSex();
        System.out.println("--生产了一个黑人女性--");
        femaleBlackHuman.getColor();
        femaleBlackHuman.talk();
        femaleBlackHuman.getSex();
    }
}
