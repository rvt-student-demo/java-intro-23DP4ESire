package lv.rvt;

public class Box {
  private final double width;
  private final double height;
  private final double length;

  public Box(double width, double height, double length) {
      this.width = width;
      this.height = height;
      this.length = length;
  }

  public Box(double side) {
      this(side, side, side);
  }

  public double volume() {
      return width * height * length;
  }

  public double area() {
      return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
  }

  private double faceArea() {
      return width * height;
  }

  private double topArea() {
      return width * length;
  }

  private double sideArea() {
      return height * length;
  }

  public double getWidth() {
      return width;
  }

  public double getHeight() {
      return height;
  }

  public double getLength() {
      return length;
  }
}