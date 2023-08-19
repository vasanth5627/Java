package Trees.GenericTrees;

import OOPS.InterfaceDemo.NiceCar;

import java.util.ArrayList;

public class GT<T> {
    private int size;

    private Node root;
    private class Node{
        T data;
        ArrayList<Node> children;

        public Node() {
            data = null;
            children = new ArrayList<>();
        }
        public Node(T data){
           this.data =data;
           children = new ArrayList<>();

        }

        @Override
        public String toString() {
            return "data=" + data +
                    ", children=" + children;
        }
    }

    public GT() {
        this.size = 0;
    }

    public void addChild(Node n , T data){
        if(size==0){
            Node node = new Node(data);
            root = node;
        }
        else{
           n.children.add(new Node(data));
        }
    }



    public void print(){
        System.out.println(root.children);
    }


    public static void main(String[] args) {
        GT<Integer> gt = new GT<>();
        gt.addChild(null,10);
        System.out.println(gt.root);

    }
}
