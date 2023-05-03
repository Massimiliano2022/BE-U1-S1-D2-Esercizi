
public class Main3 {

	public static void main(String[] args) {
		
		Articolo articolo1 = new Articolo("12345", "Iphone", 999.00, 500);
		Articolo articolo2 = new Articolo("67890", "Samsung",599.00, 1000);
		
		Articolo articolo3 = new Articolo("45432", "TV", 1200.00, 1500);
		Articolo articolo4 = new Articolo("48303", "Tablet",499.00, 4000);
		
		articolo1.stampaDatiArticolo();
		articolo2.stampaDatiArticolo();
		
		articolo3.stampaDatiArticolo();
		articolo4.stampaDatiArticolo();
		
		Articolo[] listaArticoliCliente1 = {articolo1,articolo2};
		Articolo[] listaArticoliCliente2 = {articolo3,articolo4};
				
		Cliente cliente1 = new Cliente("as2313","Mario","Rossi","mariorossi@gmail.com");
		Cliente cliente2 = new Cliente("as1213","Giuseppe","Verdi","giuseppeverdi@gmail.com");
		
		cliente1.stampaDatiCliente();
		cliente2.stampaDatiCliente();
		
		Carrello carrello1 = new Carrello(cliente1,listaArticoliCliente1);
		Carrello carrello2 = new Carrello(cliente2,listaArticoliCliente2);
		
		carrello1.stampaDatiCliente();
		carrello2.stampaDatiCliente();
	}

}
