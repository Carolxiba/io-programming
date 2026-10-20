package Day1.File;

import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
        //1.创建一个File对象，指代具体文件
        //路径分隔符用一个/或者两个\\
        //或者，可以使用File.separator代替分隔符，会根据操作系统不同而改变
        File f1 = new File("C:/Users/carolCode/Desktop/10_19操作系统作业/Snipaste_2026-10-19_10-24-19.png");
//        File f1 = new File("C:\\Users\\carolCode\\Desktop\\10_19操作系统作业\\Snipaste_2026-10-19_10-24-19.png");
        System.out.println(f1.length());//文件大小

        //File对象可以指代一个不存在的文件路径
        File f2 = new File("D:/GameStarter");
        //只是文件夹的大小，而不是里面所有内容的总大小
        System.out.println(f2.length());

        //定位模块中的文件
        //相对路径：不带盘符，直接在工程下寻找文件
        File f3 = new File("src/carol.txt");
        System.out.println(f3.length());

    }
}
