package A02LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        //1 末尾添加一个元素
        linkedList.addLast(10);
        linkedList.showList();

        //添加元素
        for (int i = 0; i < 10; i++) {
            linkedList.addLast(i);
        }
        linkedList.showList();

        //2 指定索引插入 1,11
        linkedList.addIndex(1, 11);
        linkedList.showList();

        // 指定内容插入类型，只是在找内容，这里省略

        //3 查找内容返回索引值
        int num = linkedList.seekContent(0);//2
        System.out.println(num);

        //4 查找索引返回内容
        int data = linkedList.seekIndex(2);//0
        System.out.println(data);

        //5 指定索引修改值 (指定内容修改类型，并且可以组成，不考虑)
        linkedList.amendIndex(2, 12);
        linkedList.showList();

        //6 删除末尾值
        linkedList.deleteLast();
        linkedList.showList();

        //7 删除指定内容
        linkedList.deleteContent(12);
        linkedList.showList();

        //删除列表，就是Head清空，不考虑。

    }
}
