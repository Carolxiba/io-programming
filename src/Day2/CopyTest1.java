package Day2;

import java.io.*;

public class CopyTest1 {
    public static void main(String[] args) throws IOException {
        //1.创建输入流管道
        InputStream is = new FileInputStream("C:\\Users\\carolCode\\Desktop\\test1\\Snipaste_2026-10-19_10-25-48.png");
        //2.创建输出流管道
        OutputStream os = new FileOutputStream("C:\\Users\\carolCode\\Desktop\\test2\\copy.png");
        //3.创建一个缓存字节数组
        byte[] buffer = new byte[1024];
        int len;
        //4.开启循环
        while((len = is.read(buffer)) != -1){
            os.write(buffer, 0, len);
        }

        //5.关闭流
        os.close();
        is.close();
    }
}
