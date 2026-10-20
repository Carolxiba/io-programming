package Day1.File;

import java.io.File;

public class FileTest4 {
    public static void main(String[] args) {
        //1.获取所有一级文件名称
        File f1 = new File("C:\\Code\\projects");
        String[] names = f1.list();
        for (String name : names) {
            System.out.println(name);
        }
        //2.获取当前目录下的所有一级文件对象
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsoluteFile());
        }
    }
}
