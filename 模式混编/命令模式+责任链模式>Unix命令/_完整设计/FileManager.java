//可以提供3种思路来实现这个类
//1.通过java.io.File类封装出类似UNIX的返回格式
//2.通过java.lang.Runtime类的exec方法执行DOS的dir命令,产生类似的ls结果
//3.通过JNI(java Native Interface)来调用与操作系统有关的动态链接库
public class FileManager{
    //ls命令
    public static String ls(String path){
        return "file\nfile2\nfile3\nfile4";
    }
    //ls -l 命令
    public static String ls_l(String path){
        String str = "drw-rw-rw root system 1024 2009-8-20 10:23 file\n";
        str = str + "drw-rw-rw root system 1024 2009-8-20 10:24 file2\n";
        str = str + "drw-rw-rw root system 1024 2009-8-20 10:24 file3\n";
        return str;
    }
    //ls -a命令
    public static String ls_a(String path){
        String str = ".\n..\nfile1\nfile2\nfile3";
        return str;
    }
}
