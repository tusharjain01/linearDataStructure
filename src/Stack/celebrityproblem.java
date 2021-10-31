package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
// You are given a number n, representing the number of people in a party.
// You are given n strings of n length containing 0's and 1's. If there is a '1' in ith row and jth spot, then person i knows about person j.
// A celebrity is defined as somebody who knows no other person but everybody else knows him.
public class celebrityproblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][]arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            String line = br.readLine();
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = line.charAt((i) - '0');
            }
        }
        findcelb(arr);
    }
    public static void findcelb(int [][]arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }
        while(st.size()>=2){
            int val1 = st.pop();
            int val2 = st.pop();
            if(arr[val1][val2] == 1){
                st.push(val2);
            }
            else{
                st.push(val1);
            }
        }
        int pot = st.pop();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][pot] == 0 || arr[pot][i] == 1){
                System.out.println("None");
                return;
            }
        }
        System.out.println("Pot");
    }
}
