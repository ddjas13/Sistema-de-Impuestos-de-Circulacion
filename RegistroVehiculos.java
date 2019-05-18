import java.util.*;

public class RegistroVehiculos{

    //Declaracion de variables globales
  String placa = " ";
  String propietario= " ";
  String marca= " ";
  String color= " ";
  String tVehiculo= " ";
  int nit = 0;
  int modelo= 0;
  int contadorVehiculosRegistrados = 0;
  RVehiculos rv[] = new RVehiculos[200];

  //Metodo para pedir datos al ususario
  public void ingresarRegistroVehiculos(){

    //Declaracion de variables
    String mas = " ";
    boolean masR = true;
    boolean validandoPlaca = false;
    boolean validandoFecha = false;
    boolean validandoVehiculo = false;

    //Arreglo para registro de vehiculos


    Scanner sc = new Scanner(System.in);//Scanner para String
    Scanner sc1 = new Scanner(System.in); //Scanner para Int

    System.out.println("********Registrando Vehiculos********");

    // ciclo do para pedir al usuario ingresar los datos necesarios
    do {
        do{
          System.out.println("Ingrese el numero de placa");
          placa = sc.nextLine();

          if (placa.length() == 6){
            if(Character.isDigit(placa.charAt(0)) && Character.isDigit(placa.charAt(1)) && Character.isDigit(placa.charAt(2))){
              if(Character.isLetter(placa.charAt(3)) && Character.isLetter(placa.charAt(4)) && Character.isLetter(placa.charAt(5))){
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
        } while (validandoPlaca == false);

        try{
        System.out.println("Ingrese el nombre del propietario");
        propietario = sc.nextLine();
        System.out.println("ingrese el NIT del propietario");
        nit = sc1.nextInt();
        System.out.println("Ingrese la marca del vehiculo");
        marca = sc.nextLine();

        do{
          System.out.println("Ingrese el modelo");
          modelo = sc1.nextInt();

          if(modelo > 1949){
            if(modelo < 2021){
              validandoFecha = true;
            }
            System.out.println("Fecha validada");
          } else {
            System.out.println("Verifica el anio que ingresaste recueda que el rango debe ser de 1950 a 2020");
          }
        }while (validandoFecha == false);

        do{

          System.out.println("Ingrese el tipo de vehiculo");
          tVehiculo = sc.nextLine();

          if (tVehiculo.equalsIgnoreCase("sedan")){
            validandoVehiculo = true;
            System.out.println("sedan "+validandoFecha);
          } else if (tVehiculo.equalsIgnoreCase("camioneta")){
            validandoVehiculo = true;
            System.out.println("camioneta "+validandoFecha);
          }else if (tVehiculo.equalsIgnoreCase("motocicleta")){
            validandoVehiculo = true;
            System.out.println("moto "+validandoFecha);
          }else {
            System.out.println("Recueda ingresar solo senda, camioneta o motocicleta");
          }
          /*if(Camioneta){
            validandoVehiculo = true;
            if (tVehiculo.equalsIgnoreCase("sedan")){
              validandoVehiculo = true;
              if (tVehiculo.equalsIgnoreCase("sedan")){
                validandoVehiculo = true;
              }
            }
          }*/
        }while(validandoVehiculo == false);

        System.out.println("Ingrese el color del vehiculo");
        color = sc.nextLine();
        System.out.println("Desea ingresesar mas resgistros S/N: ");
        mas = sc.nextLine();

        } catch (InputMismatchException ex) {
          System.out.println(" --------------------------------------------------------------------------- ");
          System.err.println("Error Por favor verifica que ingresaste los datos correctos");
          System.out.println(" --------------------------------------------------------------------------- ");
        }

        masR = (mas.equalsIgnoreCase ("S"));

        rv[contadorVehiculosRegistrados] = new RVehiculos(placa, propietario, marca, color, tVehiculo, nit, modelo);
        contadorVehiculosRegistrados++;

    } while( masR == true );

    for (int i = 0; i <contadorVehiculosRegistrados; i++){
      System.out.println(rv[i].getPlaca()+" "+rv[i].getPropietario()+" "+rv[i].getMarca()+" "+rv[i].getColor()+" "+rv[i].gettVehiculo()+" "+rv[i].getNit()+" "+rv[i].getModelo());
    }

  }
}
