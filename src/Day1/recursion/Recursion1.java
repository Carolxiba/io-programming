package Day1.recursion;

public class Recursion1 {
    public static void main(String[] args) {
        System.out.println(d(5));
    }
    static int d(int i){
        if(i == 1) return 1;
        return i * d(i - 1);
    }
}
