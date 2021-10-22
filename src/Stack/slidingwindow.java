package Stack;

// Question:-
//1. You are given a number n,representing th size of 
// array a.
//2. You are given n number ,representing the elements of 
// array a.
//3. You are given a number k,representing the size of windows.
//4. You are required to find and print the maximum element 
// in every window of size k.

import java.util.Scanner;
import java.util.Stack;
public class slidingwindow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int []nge = new int[n];
        Stack<Integer> st = new Stack<>();
        nge[arr.length - 1] = arr.length;
        st.push(n-1);
        for (int i = n-2; i >= 0; i--) {
            while(st.size() > 0 && arr[st.peek()] < arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = arr.length;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(i);
        }

        int j = 0;
        for (int i = 0; i <= nge.length - k; i++) {
            if(j < i){
                j = i;
            }
            while(nge[j] < i + k){
                j = nge[j];
            }
            System.out.print(arr[j] + " ");
        }

    }
}
