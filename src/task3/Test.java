package task3;

public class Test {
    public static void main(String[] args) {
        Consumer.consume(2);
        System.out.println(Consumer.avg());
        Consumer.consume(2);
        Consumer.consume(7);
        System.out.println(Consumer.avg());
    }
}
