
public class Main2 {

	public static void main(String[] args) {
		
		Sim sim1 = new Sim("3493222100");
		
		sim1.credito=10.0;
			
		Chiamata chiamata1 = new Chiamata(3.05,"1234567890");
		Chiamata chiamata2 = new Chiamata(0.55,"0987654321");
		Chiamata chiamata3 = new Chiamata(1.02,"6546564745");
		Chiamata chiamata4 = new Chiamata(0.05,"8754434563");
		Chiamata chiamata5 = new Chiamata(6.45,"4343546788");
		
		Chiamata [] listaChiamate = {chiamata1,chiamata2,chiamata3,chiamata4,chiamata5};
		
		sim1.listaChiamate=listaChiamate;
		
		sim1.stampaDatiSim();
	}

}
