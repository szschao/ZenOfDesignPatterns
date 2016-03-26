//要使用哪个策略,先产生出它的对象,然后放到封装角色中
class Client {
    public static void main(String args[]) {
        //定义环境角色
        Context context = null;
        System.out.println("====执行算法====");
        context = new Context(new Gzip());
        /*
         *算法替换
         *context = new Context(new Zip());
         */
        //执行压缩算法&解压算法
        context.compress("c:\\windows","d:\\windows.zip");
        context.uncompress("c:\\windows.zip","d:\\windows");
    }
}
