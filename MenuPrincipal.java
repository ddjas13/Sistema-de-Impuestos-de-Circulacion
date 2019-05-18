import java.util.*;

public class MenuPrincipal{

  public static void main(String[] args) {
    boolean menuP;
    int opcionMenu = 0 ;

    RegistroVehiculos ingresoReg = new RegistroVehiculos();
    CostoCirculacion cost = new CostoCirculacion();
    RegistroImpuesto impReg = new RegistroImpuesto();
    ReporteVehiculosRegistrados reporteV = new ReporteVehiculosRegistrados();
    ReportePendientesPago ppp = new ReportePendientesPago();
    Scanner sc = new Scanner(System.in);


    do {//ciclo para repetir el menu en caso no se ingrese el numero correcto

      System.out.println("\n*** Bienvenido al Control de Calcomania de Vehiculos ***");
      System.out.println("\n* seleccione que desea hacer hoy *");
      System.out.println("-----------------------------------");
      System.out.println("\n 1 - Registrar un vehiculo");
      System.out.println("\n 2 - Registrar impuesto de circulacion");
      System.out.println("\n 3 - Reporte de vehiculos registrados");
      System.out.println("\n 4 - Reporte de vehiculos pendientes de pago por anio");
      System.out.println("\n 5 - Reporte de vehiculos solventes por anio");
      System.out.println("\n 6 - Salir");
      System.out.println();
      System.out.println(" |--------------------------------------|");
      System.out.println(" | Recuerda ingresar el numero solamente|");
      System.out.println(" |--------------------------------------|");

      //metodo try para asegurarnos que se ingresa un numero valido
      try{
        sc = new Scanner(System.in);
        opcionMenu = sc.nextInt();
	    } catch (InputMismatchException e) {
        System.out.println(" --------------------------------------------------------------------------- ");
        System.out.println();
	      System.err.println("Lo lamento no reconoci lo que solicitaste recuerda ingresar numeros solamente");
        System.out.println();
        System.out.println(" --------------------------------------------------------------------------- ");
	    }

      switch (opcionMenu){
        case 1:
          ingresoReg.ingresarRegistroVehiculos();
        break;

        case 2:
          impReg.ingresarImpuestoVehiculos();
          cost.CostoCirculacion(ingresoReg.rv, ingresoReg.contadorVehiculosRegistrados, ingresoReg.placa);
        break;

        case 3:
          reporteV.buscar(ingresoReg.rv, ingresoReg.contadorVehiculosRegistrados);
        break;

        case 4:
          ppp.pago(ingresoReg.rv, impReg.impu, impReg.contadorImpuestosPagados);
        break;

        case 5:
          ppp.pago(ingresoReg.rv, impReg.impu, impReg.contadorImpuestosPagados);
        break;
      }
    } while (opcionMenu != 6);
  }
}
