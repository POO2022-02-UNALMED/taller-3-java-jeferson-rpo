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
	public TV setTv() {
		return tv;

	}
	
	public void getTv(TV tv) {
		this.tv = tv;

	}
	public int setCanal(int canal ) {
		return tv.canal;

	}
	
	void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	
}
