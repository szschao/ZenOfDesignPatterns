class Client {
    public static void main(String args[]) {
        for (int j=0; j<10; j++) {
            //获得元素对象
            Element el = ObjectStructure.createElement();
            //接受访问者访问
            el.accept(new Visitor());
        }
    }
}
