
public class Sim {

	
	String numeroTelefono;
	double credito;
	Chiamata[] listaChiamate;
	
	public Sim(String numeroTelefono){
		this.numeroTelefono=numeroTelefono;
		credito=0.0;
		listaChiamate = new Chiamata[5];
	}
	
	public void stampaDatiSim() {
		System.out.println("DATI SIM:");
		System.out.println("Numero di telefono: " +numeroTelefono);
		System.out.println("Credito: " +credito);
		System.out.println("Lista chiamate: " +listaChiamate.toString());
	}
	
	@Override
	public String toString() {
		
		String dettagliChiamate="";
		
		for(int i=0;i<listaChiamate.length;i++) {
			
			dettagliChiamate+=listaChiamate[i].numeroChiamato+" "+listaChiamate[i].durataMinuti;
			
		}

		return dettagliChiamate;
	}
}
