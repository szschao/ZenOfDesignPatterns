public interface Iterator {
    //历遍到下一个元素
    public Object next();
    //是否已经遍历到尾部
    public boolean hasNext();
    //深处当前指向的元素
    public boolean remove();
}
