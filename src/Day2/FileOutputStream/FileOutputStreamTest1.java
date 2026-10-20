package Day2.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest1 {
    public static void main(String[] args) throws IOException {
        //1.创建一个字节输出流管道与目标文件接通
        //覆盖管道，覆盖之前的数据
//        OutputStream os = new FileOutputStream("src\\carol.txt");
       //追加管道
        OutputStream os = new FileOutputStream("src\\carol.txt",true);


        //2.开始写字节出去
        os.write(97);
        os.write('b');
//        os.write('石');//默认只写出去一个字节

        byte[] bytes = "我爱你中国abc".getBytes();
        os.write(bytes, 0, 15);

        //换行符
        os.write("\r\n".getBytes());

        os.close();
    }
}
