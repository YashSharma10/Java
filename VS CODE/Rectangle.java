public class Rectangle {
    private double width;
    private double height;
    public Rectangle() {
      this.width = 0;
      this.height = 0;
    }
    public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
    }
    public double calculateArea() {
      return width * height;
    }
    public static void main(String[] args) {
      Rectangle r1 = new Rectangle();
      System.out.println("Area of rectangle with width " + r1.width + " and height " + r1.height + " is " + r1.calculateArea());

      Rectangle r2 = new Rectangle(5, 10);
      System.out.println("Area of rectangle with width " + r2.width + " and height " + r2.height + " is " + r2.calculateArea());
    }
  }