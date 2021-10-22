package Stack;

import java.util.Stack;

public class basicofstack {

    public static void main(String[] args) throws Exception {
        // There are three function in stack : - 
        // 1. push(element) - to add a new element in a stack.
        // 2. peek() - to see last element added to the stack.
        // 3. pop() - to remove last element present in the stack
        // 4. size() - to check how many elements are there in the stack.
        Stack<Integer> st = new Stack<>(); // this intiates the stack.
        // Added a element to the stack 'st'.
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);// -> [20,30,40]
        System.out.println(st.peek() + " " + st.size());// output -> 40 3
        st.pop();// Here 40 is removed .
        System.out.println(st + " " + st.peek() + " " + st.size()); // output -> 30 2 
        st.pop();// Here 30 is removed .
        System.out.println(st + " " + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st);

    }
}
