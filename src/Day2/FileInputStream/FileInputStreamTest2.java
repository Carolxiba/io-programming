package Day2.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest2 {
    public static void main(String[] args) throws IOException {
        //1.创建也给字节输入流对象
        InputStream is = new FileInputStream("src\\carol.txt");

        //2.开始读取文件中的字节数据,每次读取多个字节
//        byte[] buffer = new byte[3];
//        int len = is.read(buffer);
//        String rs = new String(buffer);
//        System.out.println(rs);
//        System.out.println(len);
//
//        int len2 = is.read(buffer);
////        String rs2 = new String(buffer);
//        //注意：读取多少，倒出多少
//        String rs2 = new String(buffer, 0, len2);
//        System.out.println(rs2);
//        System.out.println(len2);

        //3.使用循环改造
        byte[] bytes = new byte[3];
        int len;
        while((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }
        //性能得到明显提升

        is.close();

    }
}
