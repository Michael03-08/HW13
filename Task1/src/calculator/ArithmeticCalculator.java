package calculator;
public class ArithmeticCalculator {
    private double num1;
    private double num2;

    public ArithmeticCalculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void calculator(Operation operation){
        if (operation == Operation.ADD){
            System.out.println(num1 + num2);
        } else if (operation == Operation.SUBTRACT) {
            System.out.println(num1 - num2);
        } else if (operation == Operation.MULTIPLY) {
            System.out.println(num1 * num2);
        }else {
            System.out.println("Водите верную команду");
        }
    }
}

