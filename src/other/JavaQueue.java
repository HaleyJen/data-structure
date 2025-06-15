package other;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        //1 创建
        Queue<Integer> queue = new LinkedList<>();

        //2 添加元素
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }

        //3 遍历输出
        while (! queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
