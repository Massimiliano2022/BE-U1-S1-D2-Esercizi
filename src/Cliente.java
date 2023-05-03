import java.util.Date;

public class Cliente {
	
	String codiceCliente;
	String nomeCliente;
	String cognomeCliente;
	String emailCliente;
	Date dataIscrizione;
	
	public Cliente(String codiceCliente, String nomeCliente, String cognomeCliente, String emailCliente){
		
		this.codiceCliente=codiceCliente;
		this.nomeCliente=nomeCliente;
		this.cognomeCliente=cognomeCliente;
		this.emailCliente=emailCliente;
		dataIscrizione=new Date();
		
	}
	
	public void stampaDatiCliente() {
		System.out.println("DATI CLIENTE:");
		System.out.println("CODICE CLIENTE: " +codiceCliente);
		System.out.println("NOME CLIENTE: " +nomeCliente);
		System.out.println("COGNOME CLIENTE: " +cognomeCliente);
		System.out.println("E-MAIL CLIENTE: " +emailCliente);
		System.out.println("DATA ISCRIZIONE: "+dataIscrizione);
	}

}
