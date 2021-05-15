public class Calculator {

    enum Operation {
        PLUS {
            @Override
            public double calc(int num1, int num2) {
                return num1 + num2;
            }
        },
        MINUS {
            @Override
            public double calc(int num1, int num2) {
                return num1 - num2;
            }
        },
        MUL {
            @Override
            public double calc(int num1, int num2) {
                return num1 * num2;
            }
        },
        DIV {
            @Override
            public double calc(int num1, int num2) {
                return num1 / num2;
            }
        };

        public abstract double calc(int num1, int num2);
    }

    public void calculate(int num1, int num2, Operation operation, CalculatorCallback.ResultCallback callback) {
        callback.showResult(operation.calc(num1, num2));
    }
}
