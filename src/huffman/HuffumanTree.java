package huffman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffumanTree {
    public static void main(String[] args) {
        int arr [] ={13,7,8,3,29,6,1};
        createhuffmanTree(arr);


    }

    public static Node createhuffmanTree(int [] arr){
        List<Node> list =new ArrayList();
        for (int value :arr){
            list.add(new Node(value));
        }
        while(list.size()>1){
            Collections.sort(list);
            Node left =list.get(0);
            Node right =list.get(1);
            Node parent =new Node(left.getValue()+right.getValue());
            parent.setLeft(left);
            parent.setRight(right);
            list.remove(left);
            list.remove(right);
            list.add(parent);
        }
        list.get(0).preOrder(list.get(0));
        return list.get(0);

    }

}

class Node implements Comparable<Node>{
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public Node() {


    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(Node o) {
        return this.value-o.value;
    }

    public void preOrder(Node node){
        if (node==null){
            return;
        }
        System.out.println(node);
        if (node.left!=null)
            preOrder(node.left);
        if (node.right!=null)
            preOrder(node.right);
    }
}