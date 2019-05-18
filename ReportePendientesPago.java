import java.util.*;
public class ReportePendientesPago{
  RegistroImpuesto imp = new RegistroImpuesto();
  ImpCirculacion rv[] = new ImpCirculacion[imp.contadorImpuestosPagados];
  int anio = 0;

  public void pago(RVehiculos carros[], int tamReal){

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa el anio a consultar");
    anio = sc.nextInt();

    System.out.println(anio);
    System.out.println(tamReal);
    for (int i = 0; i <tamReal; i++){
      System.out.println("ciclo "+anio);
      if(anio == (rv[i].getAnioPaga() )){
      System.out.println(rv[i].getNPlaca()+" "+carros[i].getPropietario()+" "+carros[i].getModelo()+" "+carros[i].gettVehiculo());
      }
    }
  }
}
