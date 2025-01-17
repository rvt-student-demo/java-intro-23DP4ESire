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

  public Box(Box oldBox) {
      this.width = oldBox.width;
      this.height = oldBox.height;
      this.length = oldBox.length;
  }

  public double volume() {
      return width * height * length;
  }

  public double area() {
      return 2 * (width * height + width * length + height * length);
  }

  public Box biggerBox() {
      return new Box(1.25 * width, 1.25 * height, 1.25 * length);
  }

  public Box smallerBox() {
      return new Box(0.75 * width, 0.75 * height, 0.75 * length);
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