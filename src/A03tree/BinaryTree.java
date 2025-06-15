package A03tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root = null;
    int size = 0;

    class Node{//树的结点
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //1 添加元素(先左后右，顺次添加)
    void addLast(int data){
        //1 创建结点
        Node newNode = new Node(data);


        //2 找到位置，没有结点时。
        if (root == null) {
            //没有结点
            root = newNode;
            size ++;
            return;
        }

        //3 找位置，有结点时
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root); //将整个树都放到了queue中，因为根结点，指向了后面所有的节点

        /*
            核心思路：“队列”的入队，是最核心的。
            1、如果为空，添加结点。
            2、如果不为空，将内容添加到队列中。
            3、次序先左再右。
         */
        while ( !queue.isEmpty()){
            Node current = queue.poll(); //当前结点

            if (current.left == null){
                current.left = newNode;
                size ++;
                break;
            }else {
                queue.offer(current.left);
            }

            if (current.right == null){
                current.right = newNode;
                size ++;
                break;
            }else {
                queue.offer(current.right);
            }
        }
    }

    //2 遍历1，bfs (不考虑为空的情况)
    void treeTraverBfs(){
        //1 将所有内容保存到队列中（怎么添加，怎么整出来）
        Queue<Node> queue = new LinkedList<>();
        queue.offer(this.root);

        while (!queue.isEmpty()){
            Node current = queue.poll(); //队列出列,最开始是根结点，后面分别将左右加入队列
            System.out.print(current.data + " ");

            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
        System.out.println();

    }

    //3 遍历2，bfs，先序遍历
    void treeTraverDfs(){
        recursion(this.root);
        System.out.println();
    }

    void recursion(Node node){
        if (node == null) return;
        recursion(node.left);
        System.out.print(node.data + " ");
        recursion(node.right);
    }

}
