package triangle;

public class Triangle
{
  double side1;
  double side2;
  double side3;
  int iSide1;
  int iSide2;
  int iSide3;
  static final boolean DEFECT1 = false;
  static final boolean DEFECT2 = false;
  static final boolean DEFECT3 = false;
  static final boolean DEFECT4 = false;
  static final boolean DEFECT5 = false;
  static final boolean DEFECT6 = false;
  static final boolean DEFECT7 = false;
  static final boolean DEFECT8 = false;
  static final boolean DEFECT9 = false;
  static final boolean DEFECT10 = true;
  static final boolean DEFECT11 = true;
  static final boolean DEFECT12 = true;
  static final boolean DEFECT_RECTANGLE = true;

  public Triangle(double a, double b, double c) {
    this.side1 = a;
    this.side2 = b;
    this.side3 = c;
    this.iSide1 = (int) this.side1;
    this.iSide2 = (int) this.side2;
    this.iSide3 = (int) this.side3;
  }

  private boolean isTriangle() {
    if (this.side1 == 0.0D && this.side2 == 0.0D && this.side3 == 0.0D)
      return true;
    if (this.side1 < 0.0D || this.side2 < 0.0D || this.side3 < 0.0D) {
      return false;
    }
    if (this.side1 + this.side2 <= this.side3 || this.side1 + this.side3 <= this.side2 || this.side2 + this.side3 == this.side1) {
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
    if (!isTriangle()) {
      return "Inválido";
    }
    if (this.iSide1 == this.iSide2 && this.iSide2 == this.iSide3)
      return "Equilátero";
    if (this.iSide1 == this.iSide2 || this.iSide2 == this.iSide3 || this.iSide1 == this.iSide3)
      return "Isósceles";
    if (isRightTriangle()) {
      return "Rectángulo";
    }
    return "Escaleno";
  }
}
