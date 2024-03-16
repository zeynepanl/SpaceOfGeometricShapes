
public class Ucgen implements IShape2D{
	
	private double taban;
	private double yukseklik;
	
	public Ucgen(double taban, double yukseklik) {
		this.taban = taban;
		this.yukseklik = yukseklik;
	}

	public void alanHesapla() {
		
		System.out.println("Üçgenin alanı:" +(taban*yukseklik)/2);
	}
	
	

}
