package lv.rvt;

import java.util.ArrayList;
import java.util.List;

public class Box implements Packable {
    private double capacity;
    private List<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.capacity) {
            this.items.add(item);
        } else {
            System.out.println("The box is full. Cannot add " + item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : this.items) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Box: ");
        for (Packable item : this.items) {
            sb.append(item.toString()).append("\n");
        }
        sb.append("Total weight: ").append(this.weight()).append(" kg");
        return sb.toString();
    }
}