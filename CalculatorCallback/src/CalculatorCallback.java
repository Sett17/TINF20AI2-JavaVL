public class CalculatorCallback {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calculate(5, 17, Calculator.Operation.MUL, (result) -> System.out.println("5 mal 17 is: " + result));
        calc.calculate(5, 17, Calculator.Operation.PLUS, result -> System.out.println("5 durch 17 is: " + result));
        calc.calculate(5, 17, Calculator.Operation.MINUS, result -> System.out.println("5 plus 17 is: " + result));
        calc.calculate(5, 17, Calculator.Operation.DIV, result -> System.out.println("5 minus 17 is: " + result));
    }

    interface ResultCallback {
        void showResult(double result);
    }
}

