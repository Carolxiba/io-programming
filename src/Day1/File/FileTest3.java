package Day1.File;

import java.io.File;
import java.io.IOException;

public class FileTest3 {
    public static void main(String[] args) throws IOException {
//        //1.创建新文件,不存在则创建新的，返回true，存在则不创建，返回false
//        File f1 = new File("C:\\Code\\projects\\resource\\carol2.txt");
//        System.out.println(f1.createNewFile());
//        //2.用于创建文件夹，只能创建一级文件夹
//        File f2 = new File("C:\\Code\\projects\\resource\\aaa");
//        System.out.println(f2.mkdir());
//        //3.创建多级文件夹
//        File f3 = new File("C:\\Code\\projects\\resource\\bbb\\ccc\\ddd\\fff");
//        System.out.println(f3.mkdirs());
//        //4.删除文件
//        System.out.println(f1.delete());
//        System.out.println(f2.delete());
//        System.out.println(f3.delete());
        //非空文件夹不能直接删除
        File f4 = new File("C:\\Code\\projects\\resource");
        System.out.println(f4.delete());
    }
}
