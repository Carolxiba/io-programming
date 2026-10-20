package Day2.FileInputStream;

import java.io.*;

public class FileInputStreamTest1 {
    public static void main(String[] args) throws IOException {
        //1.创建文件字节输入流管道，与源文件接通
//        InputStream is = new FileInputStream(new File("src\\carol.txt"));
        InputStream is = new FileInputStream("src\\carol.txt");

        //2.读取文件的字节数据
        //public int read() 每次读取一个字节返回，如果没有数据了，返回 -1
//        System.out.println((char)is.read());
//        System.out.println((char)is.read());
//        System.out.println(is.read());

        //3.使用循环改造上述代码
        int b;//用于记录读取的字节
        while((b = is.read()) != -1){
            System.out.print((char) b);
        }

        //读取数据的性能很差
        //读取汉字会乱码
        //流使用完毕后必须关闭，需要释放系统资源
        is.close();
    }
}
