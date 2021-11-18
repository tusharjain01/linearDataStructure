package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueuetostackAdapterpushefficient {
    public static class QueueToStackAdapter{
        Queue< Integer> mainQ;
        Queue< Integer> helperQ;

    public QueueToStackAdapter() {
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        int size() {
            return mainQ.size();
        }

        void push(int val) {
            mainQ.add(val);
        }

        int pop() {
            if (size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                while (mainQ.size() > 1) {
                    helperQ.add(mainQ.remove());
                }

                int val = mainQ.remove();

                while (helperQ.size() > 0) {
                    mainQ.add(helperQ.remove());
                }

                return val;
            }
        }

        int top() {
            if (size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                while(mainQ.size()>1){
                    helperQ.add(mainQ.remove());
                }
                int val = helperQ.remove();
                helperQ.add(val);
                while (helperQ.size() > 0) {
                    mainQ.add(helperQ.remove());
                }

                return val;
            }
        }
    }
    public static void main(String[] args) {
        QueueToStackAdapter q1 = new QueueToStackAdapter();
        q1.push(50);
        q1.push(40);
        q1.push(30);
        System.out.println(q1.top());
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        System.out.println(q1.top());
        System.out.println(q1.size());
        q1.pop();
    }
}
