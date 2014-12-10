
public class KrugKoristenjeKlase {

	public static void main(String[] args) {
		KrugProperties maliKrug=new KrugProperties();
		maliKrug.poluprecnik = 1.0;
		maliKrug.povrsina=KrugTollBox.izracunajObim(maliKrug.poluprecnik);
		
	}

}
