/*
 *因为Ojbect类提供的方法clone只是拷贝本对象,
 *其对象内部的数组,引用对象等都不拷贝.
 *还是指向原生对象的内部元素地址.
 *两个对象将共享一个私有变量
 */
class Client {
    public static void main(String args[]) {
        //产生一个对象
        Thing thing = new Thing();
        thing.setValue("张三");
        System.out.println("原生对象的值(拷贝&赋值前):"+thing.getValue());
        //拷贝一个对象
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println("原生对象的值(拷贝&赋值后):"+thing.getValue());
        System.out.println("拷贝对象的值:"+cloneThing.getValue());
    }
}
