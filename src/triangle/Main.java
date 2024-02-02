package triangle;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
  static boolean connInternet = true;

  private static void logTriangle(String uo, String side1, String side2, String side3, String output, String goldenOutput) throws Exception {
    URL url = null;
    InetAddress ip = null;
    String ipString = "NoIPadress";
    if (connInternet) {
      Date date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd+HH:mm:ss");
      String nowString = sdf.format(date);
      try {
        ip = InetAddress.getLocalHost();
      } catch (UnknownHostException e1) {
        connInternet = false;
      }
      if (ip != null)
        ipString = ip.getHostAddress();
      try {
        String urlString = "https://clin.lsi.uniovi.es/~fanjul/logTriangle.php?UO=" + uo + "&time=" + nowString + "&inputs=" + side1 + ";" + side2 + ";" + side3 + "&output=" + output + "&golden=" + goldenOutput + "&IP=" + ipString;
        url = new URL(urlString);
      } catch (MalformedURLException malformedURLException) {}
      try {
        InputStream inputStream = url.openStream();
      } catch (IOException e) {
        connInternet = false;
      }
    }
  }

  public static void main(String[] args) throws Exception {
    CheckDatesToRun dateChecker = new CheckDatesToRun(2024, 0, 26, 2024, 1, 25);
    if (dateChecker.canIRun()) {
      JTextField uoField = new JTextField(8);
      JTextField side1Field = new JTextField(8);
      JTextField side2Field = new JTextField(8);
      JTextField side3Field = new JTextField(8);
      String nombreJAR = System.getProperty("java.class.path");
      String jarName = nombreJAR.substring(nombreJAR.lastIndexOf("\\") + 1);
      jarName = jarName.substring(0, jarName.lastIndexOf("."));
      JPanel myPanel = new JPanel();
      myPanel.add(new JLabel("UO:"));
      myPanel.add(uoField);
      if (jarName.length() < 10)
        uoField.setText(jarName);
      myPanel.add(new JLabel("Primer lado:"));
      myPanel.add(side1Field);
      myPanel.add(Box.createHorizontalStrut(15));
      myPanel.add(new JLabel("Segundo lado:"));
      myPanel.add(side2Field);
      myPanel.add(Box.createHorizontalStrut(15));
      myPanel.add(new JLabel("Tercer lado:"));
      myPanel.add(side3Field);
      int result = JOptionPane.showConfirmDialog(null, myPanel,
          "Introduzca los valores de los lados del triángulo o 'Cancelar' para salir.", 2);
      while (result == 0) {
        boolean DEFECT_convertir_coma_a_punto = false;
        boolean DEFECT_CIERRA_SI_alfabeticos = true;
        String tipoTriangulo = "";
        boolean poseeLetras = false;
        String lado1 = side1Field.getText();
        String lado2 = side2Field.getText();
        String lado3 = side3Field.getText();
        if (DEFECT_convertir_coma_a_punto) {
          lado1 = lado1.replace(",", ".");
          lado2 = lado2.replace(",", ".");

		  Ç
      JOpt
	  onPane.showMessageDialog(null, "El programa no se puede ejecutar.");
    }
  }
}


/* Location:              /home/mier/uo/y4t2/Pruebas/PL/pruebas-entrega1/src/UO283319.jar!/triangle/Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
