//In this problem it is given that you will be provided with an infix expression and you are required 
//to evaluate and print it's value.You don't need to worry about input; it is already managed for you...
// Infix Expression - >
//An infix expression is a single letter, or an operator, proceeded by one infix string and followed by another infix string.
//x + y
//(x + y) * (a - b) Basically it's just a fancy word for an algebraic expression which we have been studying since sixth or seventh grade.
package Stack;
import java.util.Stack;

public class infixEvaluation{
    public static int precedence(char optr){
        if(optr == '+' || optr == '-'){
            return 1;
        }
        else if(optr == '/' || optr == '*'){
            return 2;
        }
        return 0;
    }
    public static int operation(int val1,int val2,char optr){
        if(optr == '+'){
            return (val1+val2);
        }
        else if(optr == '-'){
            return (val1 - val2);
        }
        else if(optr == '*'){
            return (val1 * val2);
        }
        else{
            return (val1/val2);
        }
    }
    public static void main(String[] args) {
        String str = System.console().readLine("Enter the String : ");
        Stack<Integer> oprnds = new Stack<>();
        Stack<Character> optrs = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '('){
                optrs.push(ch);
            }
            else if(isCharacterDigit(ch)){
                oprnds.push(ch - '0');
            }
            else if(ch == ')'){
                while(optrs.peek() != ')'){
                    int val1 = oprnds.pop();
                    int val2 = oprnds.pop();
                    char op = optrs.pop();
                    int ans = operation(val1, val2, op);
                    oprnds.push(ans);
                }
                optrs.pop();
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(optrs.size()>0 && optrs.peek() != '(' && precedence(optrs.peek()) >= precedence(ch)){
                    int val2 = oprnds.pop();
                    int val1 = oprnds.pop();
                    char op = optrs.pop();
                    int ans = operation(val1, val2, op);
                    oprnds.push(ans);
                }
                optrs.push(ch);
            }
        }
        while(optrs.size() > 0){
            int val2 = oprnds.pop();
            int val1 = oprnds.pop();
            char op = optrs.pop();
            int ans = operation(val1, val2, op);
            oprnds.push(ans);
        }
        System.out.println(oprnds.peek());
    }
    public static boolean isCharacterDigit(char ch){
        int ans = ch;
        if(ans >= 48 && ans < 58){
            return true;
        }
        return false;
    }
}
