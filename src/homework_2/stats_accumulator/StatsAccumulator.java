package homework_2.stats_accumulator;

public interface StatsAccumulator {
    void add(int value);

    int getMin();

    int getMax();

    int getCount();

    Double getAvg();
}
