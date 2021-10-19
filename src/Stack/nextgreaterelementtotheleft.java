// Problem statement same as nextgreatestelementtotheleft.java but here it is asking about 
// the element on the left side.
import java.util.Scanner;
import java.util.Stack;

public class nextgreaterelementtotheleft {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int []nge = new int[arr.length]; // nge - next greatest element
        Stack<Integer> st = new Stack<>();
       for (int i = 0; i < nge.length; i++) {
           while(st.size() > 0 && arr[st.peek()] > arr[i]){
               st.pop();
           }
           if(st.size() == 0){
               nge[i] = -1;
               st.push(i);
           }
           else{
               nge[i] = arr[st.peek()];
               st.push(i);
           }
           
       }
        for (int i = 0; i < nge.length; i++) {
            System.out.print(nge[i] + " ");
        }
        scn.close();
    }
}
