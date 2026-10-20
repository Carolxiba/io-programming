package Day2.FileInputStream;

import java.io.*;

public class FileInputStreamTest3 {
    public static void main(String[] args) throws IOException {
        //1.一次性读取完文件的全部字节到一个字节数组中去
        //创建一个字节输入流管道与源文件接通
        InputStream is = new FileInputStream("src\\carol.txt");

//        //2.准备一个字节数组，大小和文件大小一致
//        File f = new File("src\\carol.txt");
//        long size = f.length();
//        byte[] buffer = new byte[(int)size];
//
//        int len = is.read(buffer);
//        System.out.println(new String(buffer));
//        System.out.println("===========");
//        System.out.println(size);
//        System.out.println(len);

        //3.readAllBytes()
        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));

        //关闭流
        is.close();
    }
}
