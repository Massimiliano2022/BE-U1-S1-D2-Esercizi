
public class Rettangolo {

	double altezza;
	double larghezza;
	
	public Rettangolo(double altezza, double larghezza) {
		this.altezza=altezza;
		this.larghezza=larghezza;
	}
	
	public double calcolaPerimetro() {
		return (larghezza + altezza) * 2;
	}
	
	public double calcolaArea() {
		return larghezza * altezza;
	}
	
	public static void stampaRettangolo(Rettangolo rettangolo) {

		System.out.println("Il perimetro del rettangolo è: " + rettangolo.calcolaPerimetro());
		System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());
	}

	public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {

		System.out.println("Il perimetro del rettangolo è: " + r1.calcolaPerimetro());
		System.out.println("L'area del rettangolo è: " + r1.calcolaArea());
		
		System.out.println("Il perimetro del rettangolo è: " + r2.calcolaPerimetro());
		System.out.println("L'area del rettangolo è: " + r2.calcolaArea());
		
		System.out.println("La somma dei perimetri dei due rettangoli è: " +r1.calcolaPerimetro()+r2.calcolaPerimetro());
		System.out.println("La somma delle aree dei due rettangoli è: " +r1.calcolaArea()+r2.calcolaArea());
		
	}
}
