
public class Main3 {

	public static void main(String[] args) {
		
		Articolo articolo1 = new Articolo("12345", "Iphone", 999.00, 500);
		Articolo articolo2 = new Articolo("67890", "Samsung",599.00, 1000);
		
		articolo1.stampaDatiArticolo();
		articolo2.stampaDatiArticolo();
		
		Articolo[] listaArticoli = {articolo1,articolo2};
		
		Cliente cliente1 = new Cliente("as2313","Mario","Rossi","mariorossi@gmail.com");
		Cliente cliente2 = new Cliente("as1213","Giuseppe","Verdi","giuseppeverdi@gmail.com");
		
		cliente1.stampaDatiCliente();
		cliente2.stampaDatiCliente();
		
		Carrello carrello1 = new Carrello(cliente1,listaArticoli);
		
		carrello1.stampaDatiCliente();
	}

}
