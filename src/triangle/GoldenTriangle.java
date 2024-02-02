package triangle;

public class GoldenTriangle
{
  double side1;
  double side2;
  double side3;

  public GoldenTriangle(double a, double b, double c) {
    this.side1 = a;
    this.side2 = b;
    this.side3 = c;
  }

  private boolean isTriangle() {
    if (this.side1 <= 0.0D || this.side2 <= 0.0D || this.side3 <= 0.0D) {
      return false;
    }
    if (this.side1 + this.side2 <= this.side3 || this.side1 + this.side3 <= this.side2 || this.side3 + this.side2 <= this.side1) {
      return false;
    }
    return true;
  }

  private boolean isRightTriangle() {
    if (this.side1 * this.side1 + this.side2 * this.side2 == this.side3 * this.side3 || this.side1 * this.side1 + this.side3 * this.side3 == this.side2 * this.side2 || this.side3 * this.side3 + this.side2 * this.side2 == this.side1 * this.side1)
      return true;
    return false;
  }

  public String getTriangleType() {
    if (!isTriangle())
      return "Inválido";
    if (this.side1 == this.side2 && this.side2 == this.side3)
      return "Equilátero";
    if (this.side1 == this.side2 || this.side2 == this.side3 || this.side1 == this.side3)
      return "Isósceles";
    if (isRightTriangle()) {
      return "Rectángulo";
    }
    return "Escaleno";
  }
}
