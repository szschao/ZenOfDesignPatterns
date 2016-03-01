class Client {
    public static void main(String args[]) {
        //创建一个根节点
        Composite root = new Composite();
        root.doSomething();
        //创建一个树枝构件
        Composite branch = new Composite();
        //创建一个叶子节点
        Leaf leaf = new Leaf();
        //建立整体
        root.add(branch);
        branch.add(leaf);
    }
    //通过递归遍历树
    public static void display(Component _root){
        for(Component c:_root.getChildren()){
            if(c instanceof Leaf){
                 c.doSomething();
            }else{
                display(c);
            }
        }
    }
}
