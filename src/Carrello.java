
public class Carrello {
	
	Cliente clienteAssociato;
	Articolo[] listaArticoli = new Articolo[2];
	int totaleSpesa;
	
	public Carrello(Cliente clienteAssociato, Articolo[] listaArticoli) {
		this.clienteAssociato=clienteAssociato;
		this.listaArticoli=listaArticoli;
	}
	
	public void stampaDatiCliente() {
		System.out.println("CARRELLO:");
		System.out.println("CLIENTE: " +clienteAssociato.codiceCliente+ " " +clienteAssociato.nomeCliente+ " "+clienteAssociato.cognomeCliente);
		
		System.out.println("Lista Articoli:");
		
		for(int i=0;i<listaArticoli.length;i++) {
			Articolo articolo = listaArticoli[i];
			System.out.println(articolo.toString());
			totaleSpesa+=articolo.prezzoArticolo;
		}
	
		System.out.println("TOTALE SPESA: "+totaleSpesa);
	}
	

}
