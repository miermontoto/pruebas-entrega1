package test;

import junit.framework.TestCase;
import triangle.Triangle;

public class TriangleTest extends TestCase {
  public void testEquilatero() {
    Triangle t = new Triangle(3.0D, 3.0D, 3.0D);
    assertEquals("Equilátero", t.getTriangleType());
  }

  public void testIsosceles() {
    Triangle t = new Triangle(3.0D, 1.0D, 3.0D);
    assertEquals("Isósceles", t.getTriangleType());
  }

  public void testIsoscelesPermut1() {
    Triangle t = new Triangle(1.0D, 3.0D, 3.0D);
    assertEquals("Isósceles", t.getTriangleType());
  }

  public void testIsoscelesPermut2() {
    Triangle t = new Triangle(3.0D, 3.0D, 1.0D);
    assertEquals("Isósceles", t.getTriangleType());
  }

  public void testIsoscelesDecimales() {
    Triangle t = new Triangle(3.0D, 3.0D, 3.5D);
    assertEquals("Isósceles", t.getTriangleType());
  }

  public void testSinDecimalesNoEsTriangulo() {
    Triangle t = new Triangle(5.0D, 2.9D, 2.8D);
    assertEquals("Escaleno", t.getTriangleType());
  }

  public void testEscaleno() {
    Triangle t = new Triangle(4.0D, 5.0D, 6.0D);
    assertEquals("Escaleno", t.getTriangleType());
  }

  public void testInvalidoEscaleno() {
    Triangle t = new Triangle(4.0D, 5.0D, 16.0D);
    assertEquals("Inválido", t.getTriangleType());
  }

  public void testInvalidoEscalenoPermut1() {
    Triangle t = new Triangle(16.0D, 4.0D, 5.0D);
    assertEquals("Inválido", t.getTriangleType());
  }

  public void testInvalidoEscalenoPermut2() {
    Triangle t = new Triangle(4.0D, 16.0D, 5.0D);
    assertEquals("Inválido", t.getTriangleType());
  }

  public void testInvalidoEscalenoLimite() {
    Triangle t = new Triangle(4.0D, 5.0D, 9.0D);
    assertEquals("Inválido", t.getTriangleType());
  }

  public void testInvalidoEscalenoLimitePermut1() {
    Triangle t = new Triangle(4.0D, 9.0D, 5.0D);
    assertEquals("Inválido", t.getTriangleType());
  }

  public void testInvalidoEscalenoLimitePermut2() {
    Triangle t = new Triangle(9.0D, 4.0D, 5.0D);
    assertEquals("Inválido", t.getTriangleType());
  }
  public void testInvalidoIsosceles() {
    Triangle t = new Triangle(4.0D, 4.0D, 16.0D);
    assertEquals("Inválido", t.getTriangleType());
  }

  public void testInvalidoIsoscelesLimite() {
    Triangle t = new Triangle(4.0D, 4.0D, 8.0D);
    assertEquals("Inválido", t.getTriangleType());
  }

  public void testInvalidoLadoCero() {
    Triangle t = new Triangle(4.0D, 4.0D, 0.0D);
    assertEquals("Inválido", t.getTriangleType());
  }

  public void testInvalidoTodosCero() {
    Triangle t = new Triangle(0.0D, 0.0D, 0.0D);
    assertEquals("Inválido", t.getTriangleType());
  }

  public void testInvalidoNegativo() {
    Triangle t = new Triangle(4.0D, 3.0D, -1.0D);
    assertEquals("Inválido", t.getTriangleType());
  }
}
