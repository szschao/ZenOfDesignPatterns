//私有的构造函数,避免被其他类new出来一个对象
//其他类对该类的访问可以通过getInstance获得同一个对象
public class Emperor {

    //初始化一个皇帝
    private static final Emperor emperor = new Emperor();
    private Emperor(){
        //世俗和道德约束你,目的就是不希望产生第二个皇帝
    }

	public static Emperor getInstance() {
		return emperor;
	}
    //皇帝发话了
	public static void say() {
        System.out.println("我就是皇帝某某某...");
	}

}
