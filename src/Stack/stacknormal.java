package Stack;

import java.util.Scanner;
import java.util.Stack;

public class stacknormal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(30);
        st.push(40);
        System.out.println(st.peek());
        System.out.println(st.pop());
        int n = scn.nextInt();
        System.out.println(n);
    }
}
