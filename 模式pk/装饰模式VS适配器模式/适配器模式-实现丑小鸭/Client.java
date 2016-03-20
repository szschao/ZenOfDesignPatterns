/*
 *采用适配器模式实现丑小鸭变成白天鹅的过程要从鸭妈妈的角度来分析
 *鸭妈妈有5个孩子,它认为这5个孩子都是她的后代,都是鸭类
 *但是实际上是有一只(也就是丑小鸭)不是真正的鸭类,她是一只小白天鹅
 *通过分析,我们要做的就是把一只天鹅看成了小鸭子,最终时间到来的时候丑小鸭变成了天鹅
 */
class Client {
    public static void main(String args[]) {
        //鸭妈妈有5个孩子,其中4个都是一个模样
        System.out.println("===妈妈有5个孩子,其中4个模样是这样:===");
        Duck duck = new Duckling();
        duck.cry();
        duck.desAppearance();
        duck.desBehavior();
        System.out.println("\n===一只独特的小鸭子,模样是这样的:===");
        Duck uglyDuckling = new UglyDuckling();
        uglyDuckling.cry();
        uglyDuckling.desAppearance();
        uglyDuckling.desBehavior();
    }
}
