public class ImpCirculacion{

	//Variables
	private String nPlaca;
	private int anioPaga;
	private double montoPaga;

	//inicializacion de Variables
	public ImpCirculacion(){
		nPlaca = " ";
		anioPaga = 0;
		montoPaga = 0;
	}

	//constructor
	public ImpCirculacion(String np, int ap, double mp){
		nPlaca = np;
		anioPaga = ap;
		montoPaga = mp;
	}

	public void setNPlaca(String nPlaca){
		this.nPlaca = nPlaca;
	}

	String getNPlaca(){
		return this.nPlaca;
	}

	public void setAnioPaga(int anioPaga){
		this.anioPaga = anioPaga;
	}

	int getAnioPaga(){
		return this.anioPaga;
	}

	public void setMontoPaga(double montoPaga){
		this.montoPaga = montoPaga;
	}

	double getMontoPaga(){
		return this.montoPaga;
	}


}
