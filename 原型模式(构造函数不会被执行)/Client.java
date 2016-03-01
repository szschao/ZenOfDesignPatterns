/*
 *构造函数被执行的话,会输出两次消息
 */
class Client {
    public static void main(String args[]) {
        //产生一个对象
        Thing thing = new Thing();
        //拷贝一个对象
        Thing cloneThing = thing.clone();
    }
}
