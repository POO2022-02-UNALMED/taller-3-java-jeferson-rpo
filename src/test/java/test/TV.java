package taller3.televisores;

public class TV {
	Marca marca;	
	int canal;
	int precio;
	boolean estado;
	int volumen;
	Control control;
	static int numTV =0;
	
	
	public TV(Marca marca,boolean estado ) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		numTV++;
								
	}
	public Marca getMarca () {
		return marca;
	}
	
	public void setmarca(Marca marca ) {
		this.marca = marca;
	}
	public Control getcontrol (Control control) {
		return control;
	}
	
	public void setControl (Control control) {
		this.control = control;
	}
	public int getPrecio () {
		return precio;
	}
	
	public void setPrecio (int precio ) {
		this.precio = precio;
	}
	public int getVolumen () {
		return volumen;
	}
	
	public void setVolumen (int volumen) {
		this.volumen = volumen;
	}
	public int getCanal () {
		return canal;
	}
	
	public void setCanal (int canal	 ) {
		this.canal = canal;
	}
	
	public static int getNumTV (int numTV) {
		return numTV;
	}
	public boolean getEstado() {
		return estado;
	}
	
	public void volumenUp(){
		if (volumen < 7 && estado==true){
			this.volumen++;			
		}
        
    }
    public void volumenDown(){
    	if (volumen > -1 && estado==true) {
    		this.volumen--;	
    	}
        
    }
    public void canalUp(){
		if ( canal < 120 && estado==true){
			this.canal++;			
		}
        
    }
    public void canalDown(){
    	if (canal > 0 && estado==true ) {
    		this.canal--;
    	}
	
    }
    public void turnOn(){
    	if (estado == false) {
    		this.estado= true;
    	}
	
    }
    public void turnOff(){
    	if (estado== true) {
    		this.estado= false;
    	}
	
    }
	
	
    
    
    

}
	
	
        
	 


