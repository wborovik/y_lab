package homework_2.rate_limited_printer;

public class RateLimitedPrinterTest {
    public static void main(String[] args) {
        RateLimitedPrinter rateLimitedPrinter = new RateLimitedPrinter(1000);
        for (int i = 0; i < 100_000_000; i++) {
            rateLimitedPrinter.print(String.valueOf(i));
        }
    }
}
