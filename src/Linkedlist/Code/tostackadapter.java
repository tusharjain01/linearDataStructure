package LinkedList.code;

import java.util.LinkedList;

public class tostackadapter {
    public static class lltostack{
        LinkedList<Integer> list;
        lltostack(){
            list = new LinkedList<>();
        }
        void push(int val){
            list.addFirst(val);
        }
        int pop(){
            return list.removeFirst();
        }
        int top(){
            return list.getFirst();
        }
        int size(){
            return list.size();
        }
    }
    public static void main(String[] args) {
        lltostack ll = new lltostack();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);
        System.out.println(ll.size());
        System.out.println(ll.pop());
        System.out.println(ll.pop());
        System.out.println(ll.size());
    }
}