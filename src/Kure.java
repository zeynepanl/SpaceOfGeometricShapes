
public class Kure implements IShape3D {
	
	private double yarıcap;

	public Kure(double yarıcap) {
		this.yarıcap = yarıcap;
	}

	public void hacimHesapla() {
		
		System.out.println("Kürenin hacmi:"+(4*(3.14)*yarıcap*yarıcap*yarıcap)/3);
	}
	
	

}
