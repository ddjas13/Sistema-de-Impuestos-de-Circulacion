public class ReporteVehiculosRegistrados{

  public static RVehiculos regVehiculos[];

  public static void buscar(){
    if(regVehiculos[i].getPlaca.equals < 0){
      for (int i = 0; i<regVehiculos.length; i++){
        System.out.println("   No. Placa   |      propietario      |     NIT      |    Marca    |    Modelo    |  Tipo vehiculo  |    Color    |");
        System.out.println(regVehiculos[i].getPlaca+" | "+regVehiculos[i].getPropietario+" | "+regVehiculos[i].getNit+" | "+regVehiculos[i].getMarca+" | "+regVehiculos[i].getModelo+" | "+regVehiculos[i].gettVehiculo+" | "+regVehiculos[i].getColor);
        break;
      }
    } else {
      System.out.println("Aun no hay Vehiculos registrados");
    }
  }
}
