package week2_4.laba18;

public class Parser {
    public static void main(String[] args) {
        System.out.println(">> 123 = " + Parser.eval("123"));
        System.out.println(">> 2*3 = " + Parser.eval("2*3"));
        System.out.println(">> (1+3)*2 = " + Parser.eval("(1+3)*2"));
        System.out.println(">> ((13/6)*2-5)+1 = " + Parser.eval("((13/6)*2-5)+1"));
    }

    public static int eval(String expr) {
        return eval(expr, 0, expr.length()-1);
    }

    private static int eval(String expr, int from, int to) {
        if (expr.charAt(to) == ')') {
            return eval(expr, from + 1, to - 1);
        } else {
            int pos = to;
            while (pos > from) {
                if (Character.isDigit(expr.charAt(pos))) {
                    pos--;
                } else {
                    String subStr = expr.substring(pos +1, to + 1);
                    int rightOperand = Integer.valueOf(subStr);
                    char operation = expr.charAt(pos);
                    int leftOperand = eval(expr, from, pos - 1);
                    switch (operation) {
                        case '+':
                            return leftOperand + rightOperand;
                        case '-':
                            return leftOperand - rightOperand;
                        case '*':
                            return leftOperand * rightOperand;
                        case '/':
                            return leftOperand / rightOperand;
                    }
                }
            }
            String subStr2 = expr.substring(from , to + 1);
            return Integer.valueOf(subStr2);
        }
    }
}
