package lv.rvt;

public class ChangeHistory {
    private List<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        double max = Double.MIN_VALUE;
        for (double value : history) {
            max = Math.max(max, value);
        }
        return max;
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }
        double min = Double.MAX_VALUE;
        for (double value : history) {
            min = Math.min(min, value);
        }
        return min;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double value : history) {
            sum += value;
        }
        return sum / history.size();
    }
}