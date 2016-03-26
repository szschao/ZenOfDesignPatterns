class Client {
    public static void main(String args[]) {
        //定义出所谓的明星
        IStar freakStar = new FreakStar();
        //看看他是怎么粉饰自己的
        freakStar = new HotAir(freakStar);
        //第二次修饰
        freakStar = new Deny(freakStar);
        System.out.println("===看看一些假明星的形象===");
        //修饰后运行
        freakStar.act();
    }
}

