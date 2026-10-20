package Day1.recursion;

import java.io.File;

public class RecursionTest {
    public static void main(String[] args) {
        File file = new File("C:/");
        System.out.println(file.isFile());
        searchFile(file,"QQ.exe");
    }
    static void searchFile(File dir, String fileName){
        //1.校验参数是否合法
        if(dir == null || !dir.exists() || dir.isFile() || fileName.isEmpty()){
            return;
        }
        //2.获取所有一级文件对象
        File[] files = dir.listFiles();
        //3.遍历所有一级对象
        if(files == null || files.length <=0){
            return;
        }
        for (File file : files) {
            //判断是否为文件夹
            if(file.isDirectory()){
                //递归
                searchFile(file, fileName);
            } else {
                //获取文件名称
                String name = file.getName();
                //判断是否是所需文件
                if(name.contains(fileName)){
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
