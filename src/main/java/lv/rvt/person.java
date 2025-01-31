package lv.rvt;

public class person {
    private String name;
    private String address;

    public person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "\n  " + address;
    }
}
