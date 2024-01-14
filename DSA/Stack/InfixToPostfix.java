import java.util.Stack;

public class InfixToPostfix {
    static boolean checkIfOperand(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;

        }
        return -1;
    }

    static void convertInfixToPostfix(String exp) {
        int i, j;
        Stack<Character> s = new Stack<>();
        StringBuilder result = new StringBuilder(new String(""));

        for (i = 0, j = -1; i < exp.length(); ++i) {
            if (checkIfOperand(exp.charAt(i))) {
                result.append(exp.charAt(i));
            } else if (exp.charAt(i) == '(') {
                s.push(exp.charAt(i));
            } else if (exp.charAt(i) == ')') {
                while (!s.empty() && s.peek() != '(') {
                    result.append(s.peek());
                    s.pop();
                }
                if (!s.empty() && s.peek() != '(') {
                    return;
                } else {
                    s.pop();
                }
            } else {
                while (!s.empty() && precedence(exp.charAt(i)) <= precedence(s.peek())) {
                    result.append(s.peek());
                    s.pop();
                }
                s.push(exp.charAt(i));
            }
        }

        while (!s.empty()) {
            result.append(s.peek());
            s.pop();
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        convertInfixToPostfix(exp);
    }
}
