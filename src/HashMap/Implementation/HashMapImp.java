package HashMap.Implementation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.LinkedList;

public class HashMapImp { // it is implemented by using Array of linkedLists
    static class HashMapEx<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }

            @Override
            public String toString() {
                return "key=" + key +
                        ", value=" + value +
                        '}';
            }
        }
        private int n; //number of nodes (total key value pairs)
        private int N; //number of buckets (length of the array)
        private LinkedList<Node> ll[]; // array of linkedlists

        public HashMapEx() {
            this.N = 4;
            this.n = 0;
            this.ll = new LinkedList[N];
            for (int i = 0; i < ll.length; i++) {
                ll[i] = new LinkedList<>();
            }
        }

        public void put(K key, V value){
            int idx = hashing(key);
            int dix = searchInLL(key,idx);
            if(dix==-1){
               this.ll[idx].add(new Node(key,value));
               n++;
            }
            else{
                Node n = ll[idx].get(dix);
                n.value = value;

            }

            double lamda = (double) n/N;
            if(lamda>2.0){
                this.N = N*2;
                reHash();
            }
        }

        public V remove(K key){
            int idx = hashing(key);
            int dxi = searchInLL(key,idx);

            if(dxi==-1){
                return null;
            }
            else{
               Node node =  this.ll[idx].remove(dxi);
               n--;
               return node.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < ll.length; i++) {
                LinkedList<Node> newLL = ll[i];
                for (int j = 0; j < newLL.size(); j++) {
                    Node node = newLL.get(j);
                    keys.add(node.key);

                }

            }
            return keys;
        }





        private void reHash() {
            LinkedList<Node> oldLL[] = this.ll;
            this.ll = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                this.ll[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldLL.length; i++) {
                LinkedList<Node> newLL = oldLL[i];
                for (int j = 0; j < newLL.size(); j++) {
                    Node node  = newLL.get(j);
                    put(node.key,node.value);

                }

            }

        }

        private int searchInLL(K key, int idx) {
            LinkedList<Node> llk = ll[idx];
            for (int i = 0; i < llk.size(); i++) {
                if(llk.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }

        private int hashing(K key) {
            int idx = key.hashCode();
            return Math.abs(idx)%this.N; //to return hashcode with the range of N
        }

        @Override
        public String toString() {
           return Arrays.toString(ll);
        }
    }

    public static void main(String[] args) {
        HashMapEx<String, Integer> hm  = new HashMapEx<>();
        hm.put("abc",1);
        System.out.println(hm);
        hm.put("abc",2);
        System.out.println(hm);
        hm.put("adc",3);
        hm.put("afd",4);
        System.out.println(hm);
        hm.put("obi",5);
        hm.put("koi",6);
        hm.put("oiu",7);
        System.out.println(hm);
        hm.put("obr",5);
        hm.put("kou",6);
        hm.put("oip",7);
        System.out.println(hm);
        hm.remove("obr");
        System.out.println(hm.keySet());




    }

}

