package Day1.charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.编码
        String data = "a我b";
        byte[] bytes = data.getBytes();
        System.out.println(Arrays.toString(bytes));

        //2.按照指定字符集编码
        byte[] bytes1 = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        //3.解码
        String s1 = new String(bytes);
        System.out.println(s1);

        String s2 = new String(bytes1, "GBK");
        System.out.println(s2);
    }
}
