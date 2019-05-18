public class MontoPagar{

  String tipo;
  double monto;

  public MontoPagar(){
    tipo = " ";
    monto = 0;
  }

  public MontoPagar(String t, double m){
    tipo = t;
    monto = m;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public String getTipo(){
    return this.tipo;
  }

  public void setMonto(double monto){
    this.monto = monto;
  }

  public double getMonto(){
    return this.monto;
  }
}
