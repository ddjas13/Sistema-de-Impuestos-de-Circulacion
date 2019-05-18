public class CostoCirculacion{

  MontoPagar costo[]= new MontoPagar[3];

  public void CostoCirculacion(RVehiculos tipoVehiculo[], int tamReal, String placa){

    costo[0] = new MontoPagar("Camioneta", 300.0);
    costo[1] = new MontoPagar("Sedan", 200.0);
    costo[2] = new MontoPagar("Motocicleta", 100.0);

    String tipo = " ";

    for (int j =0; j < tamReal; j++){
      if(placa.equalsIgnoreCase (tipoVehiculo[j].getPlaca())){
        tipo=tipoVehiculo[j].gettVehiculo();
      }
    }

    for (int i =0; i < costo.length; i++){
      if(costo[i].getTipo().equalsIgnoreCase (tipo)){
          System.out.println("Placa: "+placa+" debe cancelar: Q"+costo[i].getMonto());
        }
    }
  }
}
