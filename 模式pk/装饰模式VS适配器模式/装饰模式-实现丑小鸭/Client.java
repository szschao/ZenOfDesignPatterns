class Client {
    public static void main(String args[]) {
        //很久很久以前,这里有一个丑陋的小鸭子
        System.out.println("===很久很久以前,这里有一只丑陋的小鸭子===");
        Swan duckling = new UglyDuckling();
        //展示一下小鸭子
        duckling.desAppearance();
        duckling.cry();
        duckling.fly();
        System.out.println("\n===小鸭子终于发现自己是一只鸭子===");
        //首先外形变了
        duckling = new BeautifulAppearance(duckling);
        //其次性外也变了
        duckling = new StrongBehavior(duckling);
        //虽然还是叫丑小鸭,但是已经发生了很大的变化
        duckling.desAppearance();
        duckling.cry();
        duckling.fly();
    }
}

