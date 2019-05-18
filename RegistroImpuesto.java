import java.util.*;

public class RegistroImpuesto{

  //Variables Globales
  String nPlaca = " ";
  String masImp = " ";
  String tipo = " ";
  int anioPaga = 0;
  int contadorImpuestosPagados = 0;
  double montoPaga = 0;
  double saldo = 0;
  boolean validandoFecha = false;

  //CostoCirculacion cc[] = new CostoCirculacion[3];
  ImpCirculacion impu[] = new ImpCirculacion[200];
  MontoPagar costo[]= new MontoPagar[3];
  RegistroVehiculos vehiculoReg = new RegistroVehiculos();
  RVehiculos tipoVehiculo[]= new RVehiculos[vehiculoReg.contadorVehiculosRegistrados];

  public void ingresarImpuestoVehiculos(){

    boolean masImpI = true;
    boolean validandoPlaca = false;

    //Arreglo para ingreso de impuesto

    //RegistroImpuesto impuestoPago = new RegistroImpuesto();

    Scanner sc = new Scanner(System.in);

    System.out.println("****** Pago del impuesto anual de circulacion ******" );

    do{ // ciclo para pedir la informacion n cantidad de veces hasta que el usuario decida que ya no ingresara mas datos

      do{ // para validar que el usuario ingrese la informacion necesaria para la placa
        sc = new Scanner(System.in);//declaramos nuevamente el scanner para reiniciar el buffer
        System.out.println("Ingresa el numero de placa a pagar");
        nPlaca= sc.nextLine();
        if (nPlaca.length() == 6){
          if(Character.isDigit(nPlaca.charAt(0)) && Character.isDigit(nPlaca.charAt(1)) && Character.isDigit(nPlaca.charAt(2))){
            if(Character.isLetter(nPlaca.charAt(3)) && Character.isLetter(nPlaca.charAt(4)) && Character.isLetter(nPlaca.charAt(5))){
              validandoPlaca = true;
            } else {
              System.out.println("Recuerda los ultimos 3 deben ser letras");
            }
          } else {
            System.out.println("Recueda los primeros 3 deben ser numeros");
          }
        } else {
          System.out.println("Recuerda que el numero de placa contiene solamente 6 caracteres");
        }
      } while (validandoPlaca == false); // Termina el ciclo que valida que el usuario ingreso la placa de manera correcta


    /*  for(int c = 0; c < vehiculoReg.contadorVehiculosRegistrados; c++){
        System.out.println(nPlaca);
        if(nPlaca.equalsIgnoreCase (tipoVehiculo[c].getPlaca())){
          tipo = tipoVehiculo[c].gettVehiculo();
        }
      }

      for (int i =0; i < costo.length; i++){
        System.out.println(tipo);
        //if(costo[i].getTipo().equalsIgnoreCase (tipo)){
          //System.out.println("\nPlaca: "+nPlaca+" debe cancelar: Q"+costo[i].getMonto());
          //System.out.println(" ------------------------------------------------------");
        //}
      }*/

      try{
        System.out.println("Ingresa el monto a pagar");
        montoPaga = sc.nextDouble();

        do{
          System.out.println("Ingrese el modelo");
          anioPaga = sc.nextInt();

          if(anioPaga > 1949){
            if(anioPaga < 2021){
              validandoFecha = true;
            }
            System.out.println("Fecha validada");
          } else {
            System.out.println("Verifica el anio que ingresaste recueda que el rango debe ser de 1950 a 2020");
          }
        }while (validandoFecha == false);

        sc = new Scanner(System.in);//reinstaciamos el scanner para limpiar el buffer

        System.out.println("Desea pagar otro vehiculo S/N: ");
        masImp = sc.nextLine();

      }catch (InputMismatchException ri) {
        System.out.println(" --------------------------------------------------------------------------- ");
        System.err.println("Error Por favor verifica que ingresaste los datos correctos");
        System.out.println(" --------------------------------------------------------------------------- ");
      }

        masImpI = (masImp.equalsIgnoreCase ("S"));
        contadorImpuestosPagados = contadorImpuestosPagados++;

        impu[contadorImpuestosPagados] = new ImpCirculacion(nPlaca, anioPaga, montoPaga);
    } while ( masImp.equalsIgnoreCase ("S"));
  }

  /*public void PagoCirculacion(RVehiculos tipoVehiculo[], int tamReal, String placa){

    for(int c = 0; c < tamReal; c++){
      if(nPlaca.equalsIgnoreCase (tipoVehiculo[c].getPlaca())){
        tipo= tipoVehiculo[c].gettVehiculo();
      }
    }

    for (int i =0; i < costo.length; i++){
      if(costo[i].getTipo().equalsIgnoreCase (tipo)){
        System.out.println("\nPlaca: "+placa+" debe cancelar: Q"+costo[i].getMonto());
        System.out.println(" ------------------------------------------------------");
      }
    }
  }*/
}
