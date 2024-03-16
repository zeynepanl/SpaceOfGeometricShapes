
public class Main {

	public static void main(String[] args) {
		
		IShape2D sekil2D;
		IShape3D sekil3D;
		
		sekil2D = new Ucgen(12,5);
		sekil2D.alanHesapla();
		
		sekil2D = new Kare(5);
		sekil2D.alanHesapla();
		
		sekil2D = new Daire(3);
		sekil2D.alanHesapla();
		
		sekil2D = new Dikdortgen(15,10);
		sekil2D.alanHesapla();
		
		sekil3D = new UcgenPrizma(40,12);
		sekil3D.hacimHesapla();
		
		sekil3D = new Kure(6);
		sekil3D.hacimHesapla();
		
		sekil3D = new Kup(4);
		sekil3D.hacimHesapla();
		
		sekil3D = new DikdortgenPrizma(6,8,9);
		sekil3D.hacimHesapla();
		
		
		

	}

}
