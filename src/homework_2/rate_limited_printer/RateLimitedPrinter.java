package homework_2.rate_limited_printer;

public class RateLimitedPrinter {
    private final int interval;
    private long startTime = 0;

    public RateLimitedPrinter(int interval) {
        this.interval = interval;
    }

    public void print(String message) {
        long count = System.currentTimeMillis();

        if (count - startTime > interval) {
            System.out.println(message);
            startTime = System.currentTimeMillis();

            //Проверка интервала в миллисекундах между выводами message в консоль
            System.out.println("Это startTime: " + startTime);
        }
    }
}
