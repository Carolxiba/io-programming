package Day2.Resource;

public class test1 {
    public static void main(String[] args) {
       try {
           System.out.println(10 / 2);
       } catch (Exception e){
           e.printStackTrace();
       } finally {
           System.out.println("finally执行了一次");
       }
        System.out.println(chu(10, 2));
    }

    static int chu(int a, int b){
        try {
            return a / b;
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }finally {
            //千万不要再finally返回数据
            return 111;
        }
    }
}
