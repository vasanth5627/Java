package HashMap.Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class HashMapImpPrac {
   static class HashMap<K,V>{
        private class Node{
            private K key;
            private V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }

            @Override
            public String toString() {
                return "key=" + key +
                        ", value=" + value;
            }
        }

       private LinkedList<Node> list[];

       private int N; //size of list
       private int n; // no of values


        public HashMap() {
            this.N =4;
            this.n=0;
            this.list = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.list[i] = new LinkedList<>();
            }

        }
        private <K> int calculateHash(K key) {
           return  Math.abs(key.hashCode())%this.N;
        }
        private int searchInLL(int idx, K key){
            LinkedList<Node> ll = this.list[idx];
            for (int i = 0; i < ll.size(); i++) {
                if(ll.get(i).key == key) return i;
            }
            return -1;
        }
        private void rehash(){
            this.N = N*2;
            LinkedList<Node> oldLL[] = this.list;
            this.list = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                list[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldLL.length; i++) {
                LinkedList<Node> ll = oldLL[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key , V value){
            int idx = calculateHash(key);
            int dxi = searchInLL(idx,key);
            if(dxi==-1){
                this.list[idx].add(new Node(key,value));
                n++;
            }
            else{
               Node node =  this.list[idx].get(dxi);
               node.value = value;

            }

            double lamda = (double) n/N;
            if(lamda>2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){
            int idx = calculateHash(key);
            LinkedList<Node> ll = this.list[idx];
             return ll.contains(key);
        }

        public ArrayList<K> keySet(){
            ArrayList<K> arrayList = new ArrayList<>();
            for (int i = 0; i < this.list.length; i++) {
                for (int j = 0; j < this.list[i].size(); j++) {
                    arrayList.add(this.list[i].get(j).key);
                }
            }
            return arrayList;
        }

        public V remove(K key){
            int idx = calculateHash(key);
            int dxi = searchInLL(idx,key);
            if(idx!=-1){
                Node n = this.list[idx].remove(dxi);
                return n.value;
            }
            return null;
        }

       @Override
       public String toString() {
           return Arrays.toString(this.list);
       }
   }

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        HashMap<String,Integer> hm1 = new HashMap<>();
        hm.put("abc",20);
        hm1.put("deg",10);
        System.out.println(hm);
        System.out.println(hm1);
        hm.put("abc",30);
        hm1.put("deg",70);
        hm.put("abd",20);
        hm1.put("ddg",10);
        System.out.println(hm);
        System.out.println(hm1);
        hm.put("ac",30);
        hm1.put("dg",70);
        hm.put("ab",20);
        hm1.put("dg",10);
        hm.put("acq",30);
        hm1.put("dgq",70);
        hm.put("abq",20);
        hm1.put("dgo",10);
        System.out.println(hm);
        System.out.println(hm1);
        hm.put("awq",30);
        hm.put("ayq",30);
        hm.put("apq",30);
        hm.put("azq",30);
        System.out.println(hm);
        hm.remove("abc");
        System.out.println(hm);
    }




}
