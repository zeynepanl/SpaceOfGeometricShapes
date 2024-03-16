
public class Kup implements IShape3D {
	
	private double kenar;

	public Kup(double kenar) {
		this.kenar = kenar;
	}

	public void hacimHesapla() {
		
		System.out.println("Küpün hacmi:"+kenar*kenar*kenar);
	}
	
	
	
	

}
