package Day1.File;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest2 {
    public static void main(String[] args) {
        //1.创建文件对象
        File f1 = new File("C:\\Code\\projects\\resource\\ab.txt");
        //2.判断文件路径是否存在
        System.out.println(f1.exists());
        //3.判断是否是文件
        System.out.println(f1.isFile());
        //4.判断当前文件对象是否是文件夹
        System.out.println(f1.isDirectory());
        //5.获取文件名称
        System.out.println(f1.getName());
        //6.获取文件大小，返回字节数
        System.out.println(f1.length());
        //7.获取最后修改时间
//        System.out.println(f1.lastModified());
        long time = f1.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(time));
        //8.获取创建对象时使用的路径
        System.out.println(f1.getPath());
        File f2 = new File("src/carol.txt");
        System.out.println(f2.getPath() + f2.length());
        //9.获取绝对路径
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
    }
}
