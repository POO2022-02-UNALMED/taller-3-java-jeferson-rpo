package taller3.televisores;

public class Control {
	TV tv;
	
	
	public void turnOn() {
		tv.turnOn();		
	}
	public void turnOff() {

		tv.turnOff();
	}
	public void canalUp() {

		tv.canalUp();
	}
	public void canalDown() {

		tv.canalDown();
	}
	public void volumenUp() {

		tv.volumenUp();
	}
	public void volumenDown() {
		
		tv.volumenDown();
	}
	public TV getTv() {
		return tv;

	}
	
	public void setTv(TV tele) {
		this.tv = tele;

	}
	public void setCanal(int can) {
		tv.setCanal(can);

	}
	public int getCanal() {
		return tv.canal;

	}
	
	public void enlazar(TV tele) {
		this.tv = tele;
		tv.setControl(this);
	}			
}
