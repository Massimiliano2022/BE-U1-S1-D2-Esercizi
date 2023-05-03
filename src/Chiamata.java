
public class Chiamata {
	
	double durataMinuti;
	String numeroChiamato;
	
	public Chiamata(double durataMinuti,String numeroChiamato) {
		this.durataMinuti=durataMinuti;
		this.numeroChiamato=numeroChiamato;
	}
	
	@Override
	public String toString() {
		
		return "Numero Chiamato: "+this.numeroChiamato +" "+"Durata chiamata: "+this.durataMinuti;
	}
	
}
