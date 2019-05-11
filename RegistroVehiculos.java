import java.util.Scanner;

public class RegistroVehiculos{

//Metodo para pedir datos al ususario
  public void ingresarRegistroVehiculos(){

    //Declaracion de variables
    String placa = " ";
    String propietario= " ";
    String marca= " ";
    String color= " ";
    String tVehiculo= " ";
    int nit = 0;
    int modelo= 0;
    String mas = " ";
    boolean masR = true;
    int contadorVehiculosRegistrados = 0;

    //Arreglo para registro de vehiculos
    RVehiculos rv[] = new RVehiculos[200];

    Scanner sc = new Scanner(System.in);//Scanner para String
    Scanner sc1 = new Scanner(System.in); //Scanner para Int

    System.out.println("********Registrando Vehiculos********");

    // ciclo do para pedir al usuario ingresar los datos necesarios
    do {
      for (int i = 0; i <rv.length; i++) {

        System.out.println("Ingrese el numero de placa");
        placa = sc.nextLine();
        System.out.println("Ingrese el nombre del propietario");
        propietario = sc.nextLine();
        System.out.println("ingrese el NIT del propietario");
        nit = sc1.nextInt();
        System.out.println("Ingrese la marca del vehiculo");
        marca = sc.nextLine();
        System.out.println("Ingrese el modelo");
        modelo = sc1.nextInt();
        System.out.println("Ingrese el tipo de vehiculo");
        tVehiculo = sc.nextLine();
        System.out.println("Ingrese el color del vehiculo");
        color = sc.nextLine();
        System.out.println("Desea ingresesar mas resgistros S/N: ");
        mas = sc.nextLine();
        masR = (mas.equalsIgnoreCase ("S"));
        contadorVehiculosRegistrados = contadorVehiculosRegistrados+1;

        rv[i] = new RVehiculos(placa, propietario, marca, color, tVehiculo, nit, modelo);
        break;
      }
    } while( masR == true );
  }
}
