package A01dynamicarrays;

public class Test {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();

        //1 末尾添加一个元素
        arr.addLast(10);
        arr.printArray();

        //混合数据
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        arr.printArray();

        //2 查找2号索引，值=1
        arr.seekIndex(3);

        //3 查找内容，2内容，返回3。10内容，返回0， 11，找不到。
        arr.seekContent(2);
        arr.seekContent(10);
        arr.seekContent(11);

        //4 指定索引添加, 1索引 添加11， 结果：10 11 1 2
        arr.addIndex(1, 11);
        arr.printArray();

        //5 删除末尾
        arr.deleteLast(); //9消失了

        //6 删除索引
        arr.deleteIndex(1);//11消失了
        arr.printArray();

        //7 删除内容（可组合实现，这里不写）

        //8 修改指定索引内容（修改指定内容，可组合实现，这里不写； 1——11， 10 11 1 2）
        arr.amendIndex(1, 11);
        arr.printArray();

    }

}
