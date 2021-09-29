// "Next smallest element on the right" of an element x is defined as
//  the first element to the right of x having value smaller than x. 
//  Note -> If an element does not have any element on its right side
//  smaller than it, consider -1 as it's "next smaller element on right"
// Example ->
// for the array [2 5 9 3 1 12 6 8 7]
// Next smaller for 2 is 1
// Next smaller for 5 is 3
// Next smaller for 9 is 3
// Next smaller for 3 is 3
// Next smaller for 1 is -1
// Next smaller for 12 is 6
// Next smaller for 6 is -1
// Next smaller for 8 is 7
// Next smaller for 7 is -1
import java.util.Scanner;
import java.util.Stack;

public class nextsmallestelementtotheright {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int []nse = new int[arr.length]; // nse - next smallest element
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while(st.size() > 0 && arr[st.peek()] > arr[i]){
                int pos = st.peek();
                nse[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size() > 0){
            int pos = st.peek();
            nse[pos] = -1;
            st.pop();
        }
        for (int i = 0; i < nse.length; i++) {
            System.out.print(nse[i] + " ");
        }
        scn.close();

    }
}
