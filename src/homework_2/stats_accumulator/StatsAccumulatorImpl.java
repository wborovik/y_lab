package homework_2.stats_accumulator;

public class StatsAccumulatorImpl implements StatsAccumulator {
    private int min;
    private int max;
    private int count;
    private Double avg;
    private double sum;

    @Override
    public void add(int value) {
        if (count == 0) {
            min = value;
            max = value;
        }
        count++;
        sum += value;
        avg = sum / count;

        if (value > max) {
            max = value;
        }

        if (value < min) {
            min = value;
        }
    }

    @Override
    public int getMin() {
        return min;
    }

    @Override
    public int getMax() {
        return max;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Double getAvg() {
        return avg;
    }
}
