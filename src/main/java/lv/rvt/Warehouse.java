package lv.rvt;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity <= 0) {
            this.capacity = 0;
            this.balance = 0;
        } else {
            this.capacity = capacity;
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchSpaceLeft() {
        return capacity - balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        balance += amount;
        if (balance > capacity) {
            balance = capacity;
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0;
        }
        double takenAmount = Math.min(amount, balance);
        balance -= takenAmount;
        return takenAmount;
    }

    @Override
    public String toString() {
        return "balance = " + balance + ", space left " + howMuchSpaceLeft();
    }
}