
public class Main1 {

	public static void main(String[] args) {

		Rettangolo r1 = new Rettangolo(145.5, 304);

		Rettangolo r2 = new Rettangolo(20.0, 30.0);

		Rettangolo.stampaRettangolo(r1);
		Rettangolo.stampaRettangolo(r2);
		
		Rettangolo.stampaDueRettangoli(r1, r2);

	}
}
