public class Client {
    public static void main(String args[]) {
        System.out.println("====演戏过程模拟====");
        //定义一个大明星
        IStar star = new FilmStar();
        star.act("前十五分钟,明星本人演戏");
        //导演把一个普通演员当明星演员来用
        IActor actor = new UnkownActor();
        IStar standin = new Standin(actor);
        standin.act("中间五分钟,替身在演戏");
        star.act("后十五分钟,明星本人在演戏");
    }
}
