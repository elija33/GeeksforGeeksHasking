package Chaining.ChainingImplementation;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining{
 // set up a bucket for the hash 
    int Bucket;
 // Creta arraylist of linked list
    ArrayList<LinkedList<Integer>> table;

    public Chaining(int b){
        Bucket = b;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i = 0; i < b; i++){
            table.add(new LinkedList<Integer>());
        }
    }

    public void insert(Integer k){
        int i = k % Bucket;
        table.get(i).add(k);
    }

    public boolean search(Integer k){
        int i = k % Bucket;
        return table.get(i).contains(k);
    }
    public void delete(Integer k){
        int i = k % Bucket;
        table.get(i).remove(k);
    }

    public static void main(String[] args) {
        Chaining cha = new Chaining(7);
        cha.insert(10);
        cha.insert(6);
        cha.insert(4);
        cha.insert(9);
        cha.insert(5);
        cha.insert(7);
        cha.insert(1);
        cha.insert(3);
        cha.insert(8);
        cha.insert(2);
        System.out.println(cha);
        System.out.println(cha.search(5));
        cha.delete(7);
        System.out.println(cha.search(6));
        System.out.println(cha.search(11));
    }
}