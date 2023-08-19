package Trees.GenericTrees;

import java.util.*;

public class GT1 {
    private class Node{
        private int data;
        private ArrayList<Node> arrayList = new ArrayList<>();

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "data=" + data +
                    ", arrayList=" + arrayList;
        }
    }

    public Node buildTree(int[] arr){
        if(arr.length==0) return null;
        Stack<Node> st = new Stack<>();
        Node n = new Node(arr[0]);
        st.add(n);
        Node root = n;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==-1){
                st.pop();
            }
            else{
                Node  newNode = new Node(arr[i]);
                Node p = st.peek();
                p.arrayList.add(newNode);
                st.push(newNode);
            }
        }
        return root;

     }

     public void display(Node node){
       String str = node.data+" -> ";
         for (int i = 0; i < node.arrayList.size(); i++) {
             str+= node.arrayList.get(i).data+", ";
         }
         str+=".";
         System.out.println(str);
         for (int i = 0; i < node.arrayList.size(); i++) {
             display(node.arrayList.get(i));
         }
     }

     public int size(Node node){
        int s = 0;
        if(node.arrayList.size()==0){
            return 1;
        }

         for (int i = 0; i < node.arrayList.size(); i++) {
             int ch = size(node.arrayList.get(i));
              s = s+ch;
         }
         return s+1;

     }

     public int max(Node node){
        int max = Integer.MIN_VALUE;
        if(node.arrayList.size()==0){
            return node.data;
        }
         for (int i = 0; i < node.arrayList.size(); i++) {
                int curMax =  max(node.arrayList.get(i));
                max= Math.max(curMax, max);
         }
         return max;
     }

     public int height(Node node){
        int h = 0;
        if(node.arrayList.size()==0){
            return 0;
        }
         for (int i = 0; i < node.arrayList.size(); i++) {
             int level = height(node.arrayList.get(i))+1;
             h  = Math.max(h,level);
         }
         return h;
     }

     public void traversal(Node node){
         System.out.println("Node Pre: "+node.data);
         for (int i = 0; i < node.arrayList.size(); i++) {
             System.out.println("Edge Pre: "+node.data+" ->"+node.arrayList.get(i).data);
             traversal(node.arrayList.get(i));
             System.out.println("Edge Post: "+node.data+" ->"+node.arrayList.get(i).data);
         }
         System.out.println("Node Post: "+node.data);
     }

     //wfh in writing, tax regime is new tax , health insurance applicable

    public void levelOrder(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
       while(queue.size()>0) {
           Node n = queue.poll();
               if (n.arrayList.size() > 0) {
                   for (Node n1 : n.arrayList) {
                       queue.add(n1);
                   }


           }
           System.out.print(n.data + " ");
       }


    }

    public void levelOrderLineWise(Node node){
        Queue<Node> parent = new LinkedList<>();
        Queue<Node> children = new LinkedList<>();
        parent.add(node);
        while(parent.size()>0){
            for (Node nodec: parent) {
                System.out.print(nodec.data+" ");
                for(int i=0;i<nodec.arrayList.size();i++){
                    children.add(nodec.arrayList.get(i));
                }
            }
            System.out.println();
            parent = children;
            children = new LinkedList<>();

        }
    }

    public void levelOrderZigZag(Node node) {
        Queue<Node> parent = new LinkedList<>();
        Queue<Node> children = new LinkedList<>();
        parent.add(node);
        int k = 0;
        while (parent.size() > 0) {
            for (Node nodec : parent) {
                for (int i = 0; i < nodec.arrayList.size(); i++) {
                    children.add(nodec.arrayList.get(i));
                }
            }
            if(k%2==0){
                while(parent.size()>0){
                    System.out.print(parent.poll().data+" ");
                }
            }
            else{

                Stack<Node> temp = new Stack<>();
                while(parent.size()>0){
                    temp.push(parent.poll());
                }

                while(temp.size()>0){
                    System.out.print(temp.pop().data+" ");
                }

            }
            System.out.println();
            k++;
            parent = children;
            children = new LinkedList<>();

        }
    }

    public void mirror(Node node){
        for (int i = 0; i < node.arrayList.size(); i++) {
            mirror(node.arrayList.get(i));
        }
        Collections.reverse(node.arrayList);

    }

    public void removeLeaves(Node node){
        for (int i = node.arrayList.size()-1; i >=0; i--) {
            if(node.arrayList.get(i).arrayList.size()==0){
                node.arrayList.remove(node.arrayList.get(i));
            }
        }

        for (int i = 0; i < node.arrayList.size(); i++) {
            removeLeaves(node.arrayList.get(i));
        }




    }










    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
      //  int[] arr  = {10, 20 ,-1 ,30 ,50 ,-1 ,60 ,-1 ,-1 ,40, -1 ,-1};
        GT1 t = new GT1();
        Node root = t.buildTree(arr);
        System.out.println(root);
        t.display(root);
        System.out.println(t.size(root));
        System.out.println("Max "+t.max(root));
        System.out.println("Height "+t.height(root));
        t.traversal(root);
        t.levelOrder(root);
        System.out.println();
        t.levelOrderLineWise(root);
        System.out.println();
        t.levelOrderZigZag(root);
        System.out.println();
      //  t.mirror(root);
    //    t.levelOrderLineWise(root);
     //   t.mirror(root);
    //    System.out.println();
      //  t.removeLeaves(root);
     //   t.levelOrderLineWise(root);
    }
}
