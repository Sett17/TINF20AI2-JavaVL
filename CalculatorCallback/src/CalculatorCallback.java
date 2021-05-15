public class CalculatorCallback {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // region Lambdas
        // das hier sind Lambdas in Java
        calc.calculate(5, 17, Calculator.Operation.MUL, (result) -> System.out.println("5 mal 17 is: " + result));
        calc.calculate(5, 17, Calculator.Operation.DIV, result -> System.out.println("5 durch 17 is: " + result));
        calc.calculate(5, 17, Calculator.Operation.PLUS, result -> System.out.println("5 plus 17 is: " + result));
        calc.calculate(5, 17, Calculator.Operation.MINUS, result -> System.out.println("5 minus 17 is: " + result));
        // endregion

        // region ohne Lambdas
        // weil ja extra hiernach gefragt wurde hier ohne lambdas
        calc.calculate(5, 17, Calculator.Operation.MUL, new ResultCallback() {
            @Override
            public void showResult(double result) {
                System.out.println("5 mal 17 is: " + result);
            }
        });
        calc.calculate(5, 17, Calculator.Operation.DIV, new ResultCallback() {
            @Override
            public void showResult(double result) {
                System.out.println("5 durch 17 is: " + result);
            }
        });
        calc.calculate(5, 17, Calculator.Operation.PLUS, new ResultCallback() {
            @Override
            public void showResult(double result) {
                System.out.println("5 plus 17 is: " + result);
            }
        });
        calc.calculate(5, 17, Calculator.Operation.MINUS, new ResultCallback() {
            @Override
            public void showResult(double result) {
                System.out.println("5 minus 17 is: " + result);
            }
        });
        // endregion
    }

    interface ResultCallback {
        void showResult(double result);
    }
}

