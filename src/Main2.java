
public class Main2 {

	public static void main(String[] args) {
		
		Sim sim1 = new Sim("3493222100");
		
		sim1.credito=10.0;
			
		Chiamata chiamata1 = new Chiamata(3.05,"0000000000");
		Chiamata chiamata2 = new Chiamata(3.05,"0000000000");
		Chiamata chiamata3 = new Chiamata(3.05,"0000000000");
		Chiamata chiamata4 = new Chiamata(3.05,"0000000000");
		Chiamata chiamata5 = new Chiamata(3.05,"0000000000");
		
		sim1.listaChiamate[0]=chiamata1;
		sim1.listaChiamate[1]=chiamata2;
		sim1.listaChiamate[2]=chiamata3;
		sim1.listaChiamate[3]=chiamata4;
		sim1.listaChiamate[4]=chiamata5;
		
		sim1.stampaDatiSim();
	}

}
