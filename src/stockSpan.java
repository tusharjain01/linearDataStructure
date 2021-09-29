import java.util.Scanner;
import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int []span = new int[n];
        Stack <Integer> st = new Stack<>();
        for (int i = 0; i < span.length; i++) {
            while(st.size() > 0 && arr[st.peek()] < arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                span[i] = i+1;
            }
            else{
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
        scn.close();
    }
}
