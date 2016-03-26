public class Agent implements IStar{
    //定义是谁的经纪人
    private IStar star = null;
    //默认被代理者
    public Agent(){
        this.star = new Singer();
    }
    /*
     *通过构造函数传递代理者
     *example:被代理者传递进来
     *public Proxy(Subject _subject){
     * this.subject = _subject;
     *}
     */
    public Agent(Object ...object){

    }
    //实现接口中定义的方法
    public void sign(){
         this.before();
         this.star.sign();
         this.after();
    }
    //预处理
    private void before(){
         //do something
    }
    //善后处理
    private void after(){
         //do something
    }
}
