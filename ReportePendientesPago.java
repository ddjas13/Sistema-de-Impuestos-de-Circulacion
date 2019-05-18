import java.util.*;
public class ReportePendientesPago{

  RegistroImpuesto imp = new RegistroImpuesto();
  //ImpCirculacion rv[] = new ImpCirculacion[imp.contadorImpuestosPagados];

  int anio = 0;

  public void pago(RVehiculos carros[],ImpCirculacion rv[], int tamReal){

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa el anio a consultar");
    anio = sc.nextInt();
    System.out.println("*-*-*-*-*-*-*-* Reporte de Vehiculos que cancelaron el anio "+anio+" *-*-*-*-*-*-*-*");
    //System.out.println("antes del ciclo "+tamReal);
    System.out.print("");
    for (int i = 0; i <tamReal; i++){
//      for (int j = 0; j <tamReal; j++){
//        System.out.println("ciclo "+anio);
        if(anio == (rv[i].getAnioPaga() )){
          System.out.println(rv[i].getNPlaca()+" "+carros[i].getPropietario()+" "+carros[i].getModelo()+" "+carros[i].gettVehiculo());
        }
      //}
    }
  }
}
