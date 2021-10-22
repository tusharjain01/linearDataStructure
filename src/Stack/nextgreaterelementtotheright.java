package Stack;

// // "Next greater element on the right" of an element x is defined as
//  the first element to the right of x having value greater than x. 
//  Note -> If an element does not have any element on its right side
//  greater than it, consider -1 as it's "next greater element on right"
// Example ->
// for the array [2 5 9 3 1 12 6 8 7]
// Next greater for 2 is 5
// Next greater for 5 is 9
// Next greater for 9 is 12
// Next greater for 3 is 12
// Next greater for 1 is 12
// Next greater for 12 is -1
// Next greater for 6 is 8
// Next greater for 8 is -1
// Next greater for 7 is -1
import java.util.Scanner;
import java.util.Stack;

public class nextgreaterelementtotheright {
    public static int[] sol(int []arr) {
        int []nge = new int[arr.length];// nge - next greatest element
        Stack<Integer> st= new Stack<>();
        st.push(0);
        for (int i = 1; i < nge.length; i++) {
            while(st.size() > 0 && arr[i] > arr[st.peek()]){
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size() > 0){
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }
    public static void statement(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int []a = sol(arr);
        statement(a);
        scn.close();
    }
}
