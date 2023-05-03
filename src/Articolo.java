
public class Articolo {

	String codiceArticolo;
	String descrizioneArticolo;
	double prezzoArticolo;
	int disponibilita;
	
	public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzoArticolo, int disponibilita) {
		
		this.codiceArticolo=codiceArticolo;
		this.descrizioneArticolo=descrizioneArticolo;
		this.prezzoArticolo=prezzoArticolo;
		this.disponibilita=disponibilita;
	}
	
	public void stampaDatiArticolo() {
		System.out.println("DATI ARTICOLO:");
		System.out.println("CODICE ARTICOLO: " +codiceArticolo);
		System.out.println("DESCRIZIONE ARTICOLO: " +descrizioneArticolo);
		System.out.println("PREZZO ARTICOLO: " +prezzoArticolo);
		System.out.println("DISPONIBILITA': " +disponibilita);
	}
	
	@Override
	public String toString() {
		return "CODICE ARTICOLO:" +codiceArticolo;
	}
	
}
