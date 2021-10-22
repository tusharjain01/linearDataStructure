package Stack;
//Question
// You are given a number n,representing the size of
// array n.
//You are given n number,representing the height of 
// bars is bars charrt.
//You are required to find and print the area of the 
//largest rectangle in the histogram.


import java.util.*;
public class largestareainnhistogram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int []nstr = new int[n];//Next smallest element to the right.
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        nstr[n-1] = arr.length;
        for (int i = n-2; i >=0; i--) {
            while(st.size() > 0 && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                nstr[i] = arr.length;
            }
            else{
                nstr[i] = st.peek();
            }
            st.push(i);
        }
        System.out.println("The bars can be expanded to the right side : ");
        for (int i = 0; i < nstr.length; i++) {
            System.out.print(nstr[i] + " ");
        }
        
        int []nstl = new int[n];//Next smallest element to the left.
        Stack<Integer> st2 = new Stack<>();
        nstl[0] = -1;
        st2.push(0);
        for (int i = 1; i < nstl.length; i++) {
            while(st2.size() > 0 && arr[st2.peek()] > arr[i]){
                st2.pop();
            }
            if(st2.size() == 0){
                nstl[i] = 0;
            }
            else{
                nstl[i] = st2.peek();
            }
            st2.push(i);
        }
        System.out.println();
        System.out.println("The bars can be expanded to the left side : ");
        for (int i = 0; i < nstl.length; i++) {
            System.out.print(nstl[i] + " ");
        }
        
        System.out.println();
        int []area = new int[n];
        int max = 0; 
        System.out.println("The required bar area is: ");
        for (int i = 0; i < area.length; i++) {
            area[i] = (nstr[i] - nstl[i] -1)*arr[i];
            System.out.print(area[i] + " ");
            if(max < area[i]){
                max = area[i];
            }
        }
        System.out.println();
        System.out.println("Maximum area is : " + max);
    }
}
