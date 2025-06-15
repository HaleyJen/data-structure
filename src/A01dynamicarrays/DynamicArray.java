package A01dynamicarrays;
/*
    定义
        初始化数组，长度为10
        记录最大长
        记录当前长
    操作
        增加一个元素（末尾）
        显示当前所有数组元素

        增加一个元素（指定）
        删除末尾元素
        删除指定元素（内容、索引）

        修改指定元素（动态数组比较简单）

        查找指定元素（下标；内容）

 */
public class DynamicArray {
    int [] array = {};
    int length = 0;
    int maxLength = 0;


    // 数组扩容(每次 + 20）
    void enlarger(){
        System.out.println("数组扩容……");
        //1创建新数组
        maxLength += 20;
        int [] arrTest = new int[maxLength];

        //2 复制内容
        for (int i = 0; i < length; i++) {
            arrTest[i] = array[i];
        }

        //3 替代旧数组
        array = arrTest;

    }


    //1 遍历数组
    void printArray(){
        System.out.println("………………………………………………………………………………………………");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n长度 = " + length);
        System.out.println("最大容量=" + maxLength);
        System.out.println("………………………………………………………………………………………………");
    }

    //2 末尾添加元素
    void addLast(int data){
        //1 是否超过最大容量
        if (length +1 > maxLength) enlarger();

        //2 末尾添加元素
        array[length] = data;

        //3 总长度+1
        length++;

    }

    //3 查找索引
    void seekIndex(int index){
        System.out.println(index + "索引的值  = " + array[index]);
    }

    //4 查找指定元素(遍历查找)
    void seekContent(int data){
        int flag = -1; //后面用来判断

        //循环查找
        for (int i = 0; i < length; i++) {
            if ( array[i] == data){
                flag = i;
                break;
            }
        }

        if (flag != -1){
            System.out.println("找到元素的索引 = " + flag);
        }else {
            System.out.println("没有找到");
        }
    }

    //5 指定索引添加
    void addIndex(int index, int data){
        //1 判断容量
        if (length + 1 > maxLength) enlarger();

        //2 元素后移
        for (int i = length; i > index ; i--) {
            array[i] = array[i - 1];
        }

        //3 添加元素
        array[index] = data;
        length ++;
    }

    //6 删除末尾
    void deleteLast(){
        length --; //直接长度--就可以了
    }

    //7 删除索引
    void  deleteIndex(int index){
        //1 元素前移
        for (int i = index; i < length; i++) {
            array[i] = array[i + 1];
        }
        //2 长度减1
        length--;
    }

    //8 删除内容（不写，因为是组合实现）
    void deleteContent(int data){
        //调用2个方法就可以实现
        //1 使用查找返回索引
        //2 删除索引索引
    }

    //9 修改索引值
    void amendIndex(int index, int data){
        array[index] = data;
    }

}
