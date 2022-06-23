package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int digit1, digit2, digit3, result;
        digit1 = number / 100;
        digit2 = number / 10 % 10;
        digit3 = number % 10;
        result = digit3 * 100 + digit2 * 10 + digit1;
        System.out.println(result);
    }
}
