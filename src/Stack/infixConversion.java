package Stack;
import java.util.Scanner;
import java.util.Stack;
public class infixConversion {
    public static int precedence(char ch){
        if(ch == '+' || ch == '-'){
            return 1;
        }
        else{
            return 2;
        }
    }
    public static String postoperation(String c1,String c2,char op){
        String ans = c1 + c2 + op;
        return ans;
    }
    public static String preoperation(String c1,String c2,char op){
        String ans = op + c1 + c2;
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        Stack<String> preInfix = new Stack<>();
        Stack<String> postInfix = new Stack<>();
        Stack<Character> optr = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if(ch == '('){
                optr.push(ch);
            }
            else if(ch == ')'){ 
                while(optr.peek() != '('){
                    String prest2 = preInfix.pop();
                    String prest1 = preInfix.pop();
                    String post2 = postInfix.pop();
                    String post1 = postInfix.pop();
                    char op = optr.pop();
                    preInfix.push(preoperation(prest1,prest2, op));
                    postInfix.push(postoperation(post1,post2, op));
                }
                optr.pop();
            }   
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(optr.size() > 0 && optr.peek()!='(' && precedence(optr.peek()) >= precedence(ch)){
                    String prest2 = preInfix.pop();
                    String prest1 = preInfix.pop();
                    String post2 = postInfix.pop();
                    String post1 = postInfix.pop();
                    char op = optr.pop();
                    preInfix.push(preoperation(prest1,prest2, op));
                    postInfix.push(postoperation(post1,post2, op));
                }
                optr.push(ch);
            }
            else{
                preInfix.push(ch+"");
                postInfix.push(ch+"");
            }
        }
        while(optr.size() > 0){
            String prest2 = preInfix.pop();
            String prest1 = preInfix.pop();
            String post2 = postInfix.pop();
            String post1 = postInfix.pop();
            char op = optr.pop();
            preInfix.push(preoperation(prest1,prest2, op));
            postInfix.push(postoperation(post1,post2, op));
        }
        System.out.println("Prefix : " + preInfix.peek());
        System.out.println("PostFix : " + postInfix.peek());
        scn.close();
    }
}
