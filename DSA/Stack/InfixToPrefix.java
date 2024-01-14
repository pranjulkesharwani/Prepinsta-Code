import java.util.Stack;

public class InfixToPrefix {
    static int precedence(char c) {
        switch (c) {
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

    static StringBuilder infixToPrefix(String exp) {
        StringBuilder result = new StringBuilder();
        StringBuilder input = new StringBuilder(exp);
        input.reverse();
        Stack<Character> stack = new Stack<Character>();

        char[] charExp = new String(input).toCharArray();
        for (int i = 0; i < charExp.length; i++) {
            if (charExp[i] == '(') {
                charExp[i] = ')';
                i++;
            } else if (charExp[i] == ')') {
                charExp[i] = '(';
                i++;
            }
        }

        for (int i = 0; i < charExp.length; i++) {
            char c = charExp[i];

            if (precedence(c) > 0) {
                while (stack.isEmpty() == false && precedence(stack.peek()) >= precedence(c)) {
                    result.append(stack.pop());
                }
                stack.push(c);

            } else if (c == ')') {
                char x = stack.pop();
                while (x != '(') {
                    result.append(x);
                    x = stack.pop();

                }
            } else if (c == '(') {
                stack.push(c);
            } else {
                result.append(c);
            }
        }
        for (int i = 0; i <= stack.size(); i++) {
            result.append(stack.pop());
        }
        return result.reverse();
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g^h)-i";
        System.out.println("Infix Expression: " + exp);
        System.out.println("Prefix Expression: " + infixToPrefix(exp));
    }
}
