package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueuetostackAdapterpopefficient {
    public static class Solution{
        Queue<Integer> MainQ;
        Queue<Integer> HelperQ;
        int size = 0;
        Solution(){
            MainQ = new ArrayDeque<>();
            HelperQ = new ArrayDeque<>();
        }
        public void push(int num){
            while(MainQ.size() > 0){
                HelperQ.add(MainQ.remove());
            }
            MainQ.add(num);
            while(HelperQ.size() > 0){
                MainQ.add(HelperQ.remove());
            }
        }
        public int pop(){
            if(size == 0){
                System.out.println("Stack UnderFlow");
                return -1;
            }
            else{
                return MainQ.remove();
            }
        }
        public int top(){
            if(size == 0){
                System.out.println("Stack UnderFlow");
                return -1;
            }
            else{
                int val = MainQ.peek();
                return val;
            }
        }
        public int size(){
            return MainQ.size();
        }
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.push(50);
        s1.push(40);
        s1.push(30);
        System.out.println(s1.size());
        System.out.println(s1.pop());
        System.out.println(s1.top());
    }
}
