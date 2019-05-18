public class ReporteVehiculosRegistrados{


  public void buscar(RVehiculos rv[], int tamReal){

    System.out.println("*-*-*-*-*-*-*-* Reporte de Vehiculos registrados *-*-*-*-*-*-*-*");
    System.out.println(tamReal);
    System.out.println("\n   No. Placa   |      propietario      |     NIT      |    Marca    |    Modelo    |  Tipo vehiculo  |    Color    |");
    for (int i = 0; i <tamReal; i++){
      System.out.println("   "rv[i].getPlaca()+"        |"+rv[i].getPropietario()+" "+rv[i].getMarca()+" "+rv[i].getColor()+" "+rv[i].gettVehiculo()+" "+rv[i].getNit()+" "+rv[i].getModelo());
      System.out.println("---------------------------------------------------------------");
    }

  }
}
