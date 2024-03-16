
public class Kare implements IShape2D {
	
	private double kenar;

	public Kare(double kenar) {
		this.kenar = kenar;
	}

	public void alanHesapla() {
		
		System.out.println("Karenin alanı:"+kenar*kenar);
		
	}
	
	

}
