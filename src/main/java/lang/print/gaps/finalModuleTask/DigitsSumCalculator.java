package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public int calculateSum(int number) {

        if (number < 1000 || number > 9999) {
            throw new IllegalArgumentException("Input must be a four-digit number.");
        }


        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        DigitsSumCalculator calculator = new DigitsSumCalculator();
        int number = 1984;
        int sum = calculator.calculateSum(number);
        System.out.println(sum);
    }
}
