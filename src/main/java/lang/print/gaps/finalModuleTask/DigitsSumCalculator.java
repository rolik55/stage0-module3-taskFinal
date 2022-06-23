package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int digit1, digit2, digit3, digit4, result;
        digit1 = number / 1000;
        digit2 = number / 100 % 10;
        digit3 = number / 10 % 10;
        digit4 = number % 1000;
        result = digit1 + digit2 + digit3 + digit4;
        System.out.println(result);
    }
}
