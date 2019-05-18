class RVehiculos{

	//Variables
	private String placa;
	private String propietario;
	private String marca;
	private String color;
	private String tVehiculo;
	private int nit;
	private int modelo;

	//creacion del constructor

	public RVehiculos(){
		placa = " ";
		propietario = " ";
		marca = " ";
		color = " ";
		tVehiculo = " ";
		nit = 0;
		modelo = 0;
	}

	//creacion del constructor # 2 para la sobrecarga de metodos
	public RVehiculos(String p,String prop, String m, String c, String tv, int n, int mod){
		placa = p;
		propietario = prop;
		marca = m;
		color = c;
		tVehiculo = tv;
		nit = n;
		modelo = mod;
	}

	// Creacion de metodos getter & Setters
	public void setPlaca(String placa){
		this.placa = placa;
	}

	public String getPlaca(){
		return this.placa;
	}

	public void setPropietario(String propietario){
		this.propietario = propietario;
	}

	public String getPropietario(){
		return this.propietario;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public String getMarca(){
		return this.marca;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return this.color;
	}

	public void settVehiculo(String tVehiculo){
		this.tVehiculo = tVehiculo;
	}

	public String gettVehiculo(){
		return this.tVehiculo;
	}

	public void setNit(int nit){
		this.nit = nit;
	}

	public int getNit(){
		return this.nit;
	}

	public void setModelo(int modelo){
		this.modelo = modelo;
	}

	public int getModelo(){
		return this.modelo;
	}
}
