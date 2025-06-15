package A03tree;
/*
    编程1x2x3x...x10，测试递归
 */
public class TestRecursive {
    public static void main(String[] args) {
        int sum = 1;
        sum = recursive(3);
        System.out.println(sum);

    }
    static int recursive(int num) {
        if (num == 1){
            return 1;
        }else {
            return num * recursive(num - 1);
        }
    }
}
