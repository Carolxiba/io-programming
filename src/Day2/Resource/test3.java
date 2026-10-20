package Day2.Resource;

import java.io.*;

public class test3 {
    public static void main(String[] args) {
        try(//1.创建输入流管道
            InputStream is = new FileInputStream("C:\\Users\\carolCode\\Desktop\\test1\\Snipaste_2026-10-19_10-25-48.png");
            //2.创建输出流管道
            OutputStream os = new FileOutputStream("C:\\Users\\carolCode\\Desktop\\test2\\copy.png");
            //注意：这里只能防止资源对象
            //所有资源对象都会实现一个AutoCloseable接口，资源都会有一个close方法，
            //用完之后，会被自动调用close方法关闭资源
            ) {
            //3.创建一个缓存字节数组
            byte[] buffer = new byte[1024];
            int len;
            //4.开启循环
            while((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
