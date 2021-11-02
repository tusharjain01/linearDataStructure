package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class queueintro {
    public static void main(String[] args) {
        System.out.println("This is the introduction of Queue");
        Queue<Integer> st = new ArrayDeque<>();
        System.out.println(st);
        st.add(10);
        System.out.println(st);
        st.add(20);
        System.out.println(st);
        st.add(30);
        System.out.println(st);
        System.out.println("This is the peek of Queue : "+st.peek());
        System.out.println("This is the size of Queue : "+st.size());
        System.out.println("This is the how we remove a element :"  +st.remove());
    }
}
