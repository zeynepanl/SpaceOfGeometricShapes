
public class Dikdortgen implements IShape2D{
	
	private double kenar1;
	private double kenar2;
	
	public Dikdortgen(double kenar1, double kenar2) {
		this.kenar1 = kenar1;
		this.kenar2 = kenar2;
	}

	public void alanHesapla() {
		
		System.out.println("Dikdörtgenin alanı:"+ kenar1*kenar2);
	}
	
	
	
	

}
