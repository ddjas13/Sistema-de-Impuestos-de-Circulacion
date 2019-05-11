import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal{

  public static void main(String[] args) {
    boolean menuP;
    int opcionMenu = 0 ;

    RegistroVehiculos ingresoReg = new RegistroVehiculos();
    RegistroImpuesto impReg = new RegistroImpuesto();
    ReporteVehiculosRegistrados reporteV = new ReporteVehiculosRegistrados();
    Scanner sc = new Scanner(System.in);


    do {
	try {

      System.out.println("\n*** Bienvenido al Control de Calcomania de Vehiculos ***");
      System.out.println("\n seleccione que desea hacer hoy.");
      System.out.println("\n 1 - Registrar un vehiculo");
      System.out.println("\n 2 - Registrar impuesto de circulacion");
      System.out.println("\n 3 - Reporte de vehiculos registrados");
      System.out.println("\n 4 - Reporte de vehiculos pendientes de pago por anio");
      System.out.println("\n 5 - Reporte de vehiculos solventes por anio");
      System.out.println("\n 6 - Salir");
      System.out.println("\n Recuerda ingresar el numero solamente.");
      opcionMenu = sc.nextInt();
	} catch (InputMismatchException e) {
	System.err.println("Lo lamento no reconoci lo que solicitaste recuerda ingresar numeros solamente");
	}

      switch (opcionMenu){
        case 1:
          ingresoReg.ingresarRegistroVehiculos();
        break;

        case 2:
          impReg.ingresarImpuestoVehiculos();
        break;

        case 3:
          reporteV.buscar();
        break;

        case 4:

        break;

        case 5:

        break;
      }
    } while (opcionMenu != 6);
  }
}
