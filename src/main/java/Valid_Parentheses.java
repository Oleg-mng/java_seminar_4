import java.util.Stack;

import static jdk.internal.org.jline.utils.Colors.s;

public class Valid_Parentheses {
        public static boolean main(String[] args) {
                public boolean isValid(String s) {
                    Stack<Character> stack = new Stack<Character>();
                    for (char r : s.toCharArray()) {
                        if (r == '(') {
                            stack.push(')');
                        } else if (r == '{') {
                            stack.push('}');
                        } else if (r == '[') {
                            stack.push(']');
                        } else if (stack.isEmpty() || stack.pop() != r) {
                            return false;
                        }
                    }
                    return stack.isEmpty();
                }
            }
        }
}
