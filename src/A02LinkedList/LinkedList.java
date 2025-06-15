package A02LinkedList;

public class LinkedList {
    int len = 0;
    Node head = null;//头结点，存入第一个结点值（地址）。

    class Node{//结点中肯定有数据，所以我们直接定义数据
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // 1 在末尾添加元素
    void addLast(int data){
        //1 创建新节点
        Node newNode = new Node(data);

        //2 添加新节点
        if (head == null){
            //如果没有节点，直接头结点指向
            head = newNode;
        }else{
            //如果有节点，遍历到末尾，然后添加
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }

        //3 长度+1
        len ++;
    }

    //2 遍历链表
    void showList(){
        //只考虑已经有结点的情况

        //循环打印
        Node current = head;
        while (current != null){
            System.out.print(current.data +" ");
            current = current.next;
        }

        System.out.println();
    }

    //3 指定索引插入
    void addIndex(int index, int data){
        //1 创建新结点
        Node newNode = new Node(data);

        //2 找到指定索引
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        //3 修改插入
        newNode.next = current.next;
        current.next = newNode;

        //4 总长度++
        len ++;

    }
    //4 查找内容返回索引值
    int seekContent(int data){
        int index = -1;

        //遍历查找
        Node current = head;
        int num = 0;
        while (current != null){
            if (current.data == data){
                index = num;
                break;
            }
            num ++;
            current = current.next;
        }

        //返回值
        return index;
    }

    //5 查找索引返回内容
    int seekIndex(int index){
        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    //6 指定索引修改值
    void amendIndex(int index, int data){

        //1 找到位置
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        //2 修改
        current.data = data;
    }

    //7 删除末尾
    void deleteLast(){
        Node current = head;
        Node preCurrent = null;

        // 找到末尾的前一个元素
        while (current.next != null){
            preCurrent = current;
            current = current.next;
        }

        preCurrent.next = null;
    }

    //8 删除指定内容
    void deleteContent(int data){
        Node current = head;
        Node preCurrent = null;

        //遍历找内容（不考虑找不到的情况）
        while (current != null){
            if (current.data == data){
                preCurrent.next = current.next;
                break;
            }
            preCurrent = current;
            current = current.next;
        }
    }

}
