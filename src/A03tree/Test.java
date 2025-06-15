package A03tree;

public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        //1 添加一个元素
        binaryTree.addLast(10);
        binaryTree.treeTraverBfs();

        //添加多个元素
        for (int i = 0; i < 7; i++) {
            binaryTree.addLast(i);
        }
        binaryTree.treeTraverBfs();

        //2 中序遍历
        binaryTree.treeTraverDfs();


    }
}
