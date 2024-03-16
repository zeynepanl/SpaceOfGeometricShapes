
public class UcgenPrizma implements IShape3D{
	
	private double tabanAlanı;
	private double yukseklik;
	
	public UcgenPrizma(double tabanAlanı, double yukseklik) {
		this.tabanAlanı = tabanAlanı;
		this.yukseklik = yukseklik;
	}

	public void hacimHesapla() {
		
		System.out.println("Üçgen prizmanın hacmi:"+tabanAlanı*yukseklik);
	}
	
	
	

}
