import java.util.Scanner;

public class RegistroImpuesto{

  public void ingresarImpuestoVehiculos(){
    String nPlaca = " ";
    int anioPaga = 0;
    double montoPaga = 0;
    String masImp = " ";
    boolean masImpI = true;
    int contadorImpuestosPagados = 0;

    //Arreglo para ingreso de impuesto
    ImpCirculacion impu[] = new ImpCirculacion[2];

    Scanner sc = new Scanner(System.in);//Scanner para String
    Scanner sc1 = new Scanner(System.in); //Scanner para numeros

    System.out.println("****** Pago del impuesto anual de circulacion ******" );

    do{
      for (int i = 0; i < impu.length; i++) {
        System.out.println("Ingresa el numero de placa a pagar");
        nPlaca= sc.nextLine();
        System.out.println("Ingresa el anio que se paga de circulacion");
        anioPaga = sc1.nextInt();
        System.out.println("Ingresa el monto a pagar");
        montoPaga = sc1.nextDouble();
        System.out.println("Desea pagar otro vehiculo S/N: ");
        masImp = sc.nextLine();
        masImpI = (masImp.equalsIgnoreCase ("S"));
        contadorImpuestosPagados = contadorImpuestosPagados+1;

        impu[i] = new ImpCirculacion(nPlaca, anioPaga, montoPaga);
        break;
      }
    } while ( masImp.equalsIgnoreCase ("S"));
  }
}
