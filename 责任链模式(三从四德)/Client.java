import java.util.Random;
import java.util.ArrayList;

/*
 *中国古代对妇女制定了"三从四德"的道德规范
 *未嫁从父,既嫁从夫,夫死从子
 */
class Client {
    public static void main(String args[]) {
        //随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for(int i=0; i<5; i++){
            arrayList.add(new Women(rand.nextInt(4),"我要出去逛街"));
        }
        //定义三个请求对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        //设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        for(IWomen women:arrayList){
            father.HandleMessage(women);
        }
    }
}
