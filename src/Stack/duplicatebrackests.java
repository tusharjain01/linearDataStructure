package Stack;

// You are given a string exp representing an expression.
// Assume that the expression is balanced i.e. the opening and closing brackets match with each other. There is always a closing bracket for each opening bracket.
// But, some of the pairs of brackets may be extra/needless. You are required to print true if you detect extra brackets and false otherwise.
// Example

// ((a + b) + (c + d)) -> false: There is no redundant or duplicate braces found
// (a + b) + ((c + d)) -> true: There is a pair of redundant or duplicate braces around c+d.
import java.util.Scanner;
import java.util.Stack;

public class duplicatebrackests {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character>  st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println(true);
                    return;
                }
                else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        System.out.println(false);
        scn.close();

    }
}
