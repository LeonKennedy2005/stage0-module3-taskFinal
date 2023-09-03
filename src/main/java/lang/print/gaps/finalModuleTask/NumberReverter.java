package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args){
        NumberReverter reverter= new NumberReverter();
        int number = 489;
        reverter.revert(number);
    }
}

