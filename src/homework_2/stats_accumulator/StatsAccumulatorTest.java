package homework_2.stats_accumulator;

public class StatsAccumulatorTest {
    public static void main(String[] args) {
        StatsAccumulator s = new StatsAccumulatorImpl();

        s.add(1);
        s.add(2);
        System.out.println(s.getAvg()); // 1.5 - среднее арифметическое элементов
        s.add(0);
        System.out.println(s.getMin()); // 0 - минимальное из переданных значений
        s.add(3);
        s.add(8);
        System.out.println(s.getMax()); // 8 - максимальный из переданных
        System.out.println(s.getCount()); // 5 - количество переданных элементов
        s.add(-7);
        s.add(21);
        System.out.println(s.getMin()); // -7 - минимальное значение изменилось
        System.out.println(s.getMax()); // 21 - максимальное значение изменилось
        System.out.println(s.getCount()); // 7 - количество переданных изменилось
        System.out.println(s.getAvg()); // 4.0 - среднее арифметическое изменилось
    }
}
