import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
        public int evalRPN(String[] tokens) {
            int a,b;
            Stack<Integer> St = new Stack<Integer>();
            for (String s : tokens) {
                if(s.equals("+")) {
                    St.add(St.pop()+St.pop());
                }
                else if(s.equals("/")) {
                    b = St.pop();
                    a = St.pop();
                    St.add(a / b);
                }
                else if(s.equals("*")) {
                    St.add(St.pop() * St.pop());
                }
                else if(s.equals("-")) {
                    b = St.pop();
                    a = St.pop();
                    St.add(a - b);
                }
                else {
                    St.add(Integer.parseInt(s));
                }
            }
            return St.pop();
        }
    }
