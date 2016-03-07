public class ExtrinsicState{
    //考试地点
    private String location;
    //考试科目
    private String subject;

    public String getLocation(){
        return this.location;
    }
    public void setLocation(String _location){
        this.location = _location;
    }
    public String getSubject(){
        return this.subject;
    }
    public void setSubject(String _subject){
        this.subject = _subject;
    }
    //如果把一个对象作为Map类的键值,一定要确保重写了equals和hashCode方法,
    //否则会出现键值搜索失败的情况,例如:map.get(object),map.contains(object)等会返回失败的结果
    @Override
    public boolean equals(Object _obj){
        if(_obj instanceof ExtrinsicState){
            ExtrinsicState state = (ExtrinsicState)_obj;
            return state.getLocation().equals(location) && state.getSubject().equals(subject);
        }
        return false;
    }
    @Override
    public int hashCode(){
        return subject.hashCode() + location.hashCode();
    }
}
