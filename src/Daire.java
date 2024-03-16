
public class Daire implements IShape2D {
	
	private double yarıcap;
	
	public Daire(double yarıcap) {
		this.yarıcap = yarıcap;
	}


	public void alanHesapla() {
		
		System.out.println("Dairenin alanı:"+(3.14)*yarıcap*yarıcap);
	}
	
	
}
