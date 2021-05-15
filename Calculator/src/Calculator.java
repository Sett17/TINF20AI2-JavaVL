import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }

    private static final Scanner scanner = new Scanner(System.in);

    private void start() {
        int number1 = getNumberInput();
        String operation = getArithmeticOperation();
        int number2 = getNumberInput();
        double calculate = calculate(number1, number2, operation);
        printResult(number1, operation, number2, calculate);
        askForAnotherRound();
    }

    private void printResult(int number1, String operation, int number2, double result) {
        System.out.println("Das Ergebnis von " + number1 + operation + number2 + " ist: " + result);
    }

    private double calculate(double number1, double number2, String operator) {
        return switch (operator) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            case "/" -> number1 / number2;
            default -> 0;
        };
    }

    private int getNumberInput() {
        System.out.print("Bitte geben Sie eine Ganzzahl ein:\t");
        return scanner.nextInt();
    }

    private String getArithmeticOperation() {
        System.out.print("Bitte geben Sie eine der 4 Grundrechenarten (+,-,*,/) ein: ");
        String input = scanner.next();
        if (isValidArithmeticOperation(input)) {
            return input;
        } else {
            System.out.println("Kein valides Rechenzeichen.");
            return getArithmeticOperation();
        }
    }

    private boolean isValidArithmeticOperation(String input) {
        return input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/");
    }

    private void askForAnotherRound() {
        System.out.print("Another calculation? y/N -> ");
        String input = scanner.next();
        if (input.equalsIgnoreCase("y")) {
            System.out.println("===================================================");
            start();
        } else if (input.equalsIgnoreCase("n")) {
            scanner.close();
            System.exit(0);
        } else {
            scanner.close();
            System.exit(0);
        }
    }
}
