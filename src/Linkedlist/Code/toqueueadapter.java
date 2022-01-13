package LinkedList.code;

import java.util.LinkedList;

public class toqueueadapter {
    public static class lltoqueue{
        LinkedList<Integer> list;
        lltoqueue(){
            list = new LinkedList<>();
        }
        void enqueue(int val){
            list.addLast(val);
        }
        int dequeue(){
            return list.removeFirst();
        }
        int size(){
            return list.size();
        }
    }

    public static void main(String[] args) {
        lltoqueue li = new lltoqueue();
        li.enqueue(10);
        li.enqueue(20);
        li.enqueue(30);
        li.enqueue(40);
        li.enqueue(50);
        System.out.println(li.dequeue());
        System.out.println(li.dequeue());
        System.out.println(li.dequeue());
        System.out.println(li.size());
    }
}
