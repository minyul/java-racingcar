package calc;

public class Calculator {

    public static final String PLUS = "+";

    public static final String MINUS = "-";

    public static final String TIMES = "*";

    public static final String OBELUS = "/";

    protected Calculator() {}

    public static int add(int pre, int post) {
        return pre + post;
    }

    public static int subtract(int pre, int post) {
        return pre - post;
    }

    public static int multiply(int pre, int post) {
        return pre * post;
    }

    public static int divide(int pre, int post) {

        // pre 를 0 으로 나눌 경우 ArithmeticException 발생
        // 0 으로 나눌 경우 0 을 리턴
        if (post == 0) {
            return 0;
        }

        return pre / post;
    }

    public static int operate(int pre, int post, String operator) {
        switch (operator) {
            case PLUS:
                return add(pre, post);
            case MINUS:
                return subtract(pre, post);
            case TIMES:
                return multiply(pre, post);
            case OBELUS:
                return divide(pre, post);
            default:
                return 0;
        }
    }
}