//赵云出场了,他依据诸葛亮的交代,依次拆开锦囊
//备注:妙计应该封装,赵云只要知道在什么场景下,打开第几个妙计就可以了
class ZhaoYun {
    public static void main(String args[]) {
        Context context;
        //刚刚到吴国的时候拆开第一个
        System.out.println("---第一个锦囊妙计---");
        context = new Context(new BackDoor());
        context.operate();

        System.out.println("---第二个锦囊妙计---");
        context = new Context(new GivenGreenLight());
        context.operate();

        System.out.println("---第三个锦囊妙计---");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
