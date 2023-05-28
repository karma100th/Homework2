package task3;

public class Consumer {
    private static int counter = 0;
    private static int sum = 0;
    private static int[] arrayNumbers = {0, 0, 0, 0, 0};
    ;

    public static int[] getArrayNumbers() {
        return arrayNumbers;
    }

    public static void consume(int number) {
        arrayNumbers[counter] = number;
        sum += arrayNumbers[counter];
        counter++;
    }

    public static double avg() {
        return (double) sum / counter;
    }
}
