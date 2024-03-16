
public class DikdortgenPrizma implements IShape3D{
	
	private double tabanUzunluk;
	private double tabanGenislik;
	private double yukseklik;
	
	
	public DikdortgenPrizma(double tabanUzunluk, double tabanGenislik, double yukseklik) {
		this.tabanUzunluk = tabanUzunluk;
		this.tabanGenislik = tabanGenislik;
		this.yukseklik = yukseklik;
	}



	public void hacimHesapla() {
		System.out.println("Dikdörtgen Prizmanın hacmi:"+tabanUzunluk*tabanGenislik*yukseklik);
	}
	
	
	
	

}
