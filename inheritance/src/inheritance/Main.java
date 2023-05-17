package inheritance;

public class Main {

	public static void main(String[] args) {
//		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//		ogretmenKrediManager.Hesapla();
//
//		BaseKrediManager baseKrediManager = new BaseKrediManager();
//		baseKrediManager.Hesapla();
//
//		TarimKrediManager tarimKrediManager = new TarimKrediManager();
//		tarimKrediManager.Hesapla();

// yani her 3 classten veri alabiliyoruz.Basekredımanager bizim ana class
// ımız.çünkü diğer iki kredi classına extends yaptık
// sonra mainden bu 3 class ı da çağırıp aynı fonksiyonu tetikledik.
        
		
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(  new AskerKrediManager());
		
		// burada new lemek yerine direkt KrediHesapla fonk unun içindeki paranteze new [class ismi] yazabiliriz
		//Yani new AskerKrediManager yerine mesela new OgretmenKrediManager de yazabilirdik.
	}

}
