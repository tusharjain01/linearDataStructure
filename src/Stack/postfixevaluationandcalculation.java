package Stack;

import java.util.Scanner;
import java.util.Stack;

public class postfixevaluationandcalculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Integer> value = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(isCharacter(ch)){
                infix.push(ch+"");
                prefix.push(ch+"");
                value.push(ch - 48);
            }
            else{
                String v2 = infix.pop();
                String v1 = infix.pop();
                infix.push(inopt(v1, v2, ch));
                String s2 = prefix.pop();
                String s1 = prefix.pop();
                prefix.push(preopt(s1, s2, ch));
                int val2 = value.pop();
                int val1 = value.pop();
                value.push(opt(val1, val2, ch));
            }
        }
        System.out.println(infix.peek());
        System.out.println(prefix.peek());
        System.out.println(value.peek());
    }
    public static boolean isCharacter(char ch){
        if(ch >= 48 && ch <=57){
            return true;
        }
        return false;
    }
    public static int opt(int val1,int val2,char op){
        if(op == '+'){
            return val1+val2;
        }
        else if(op == '-'){
            return val1-val2;
        }
        else if(op == '*'){
            return val1*val2;
        }
        else{
            return val1/val2;
        }
    }
    public static String inopt(String v1,String v2,char op){
        return (v1+op+v2);
    }
    public static String preopt(String v1,String v2,char op){
        return (op+v1+v2);
    }
}
