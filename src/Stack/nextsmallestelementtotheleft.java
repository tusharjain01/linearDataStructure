package Stack;
// Problem statement same as nextsmallesttotheright.java but here it is asking you about the element
// on the left side.
import java.util.Scanner;
import java.util.Stack;

public class nextsmallestelementtotheleft {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int []nse = new int[arr.length]; // nse - next smallest element
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0 ; i--) {
            while (st.size() > 0 && arr[st.peek()] > arr[i]) {
                int pos = st.peek();
                nse[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0){
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
