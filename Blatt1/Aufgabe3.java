
public class Aufgabe3 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Eingabe: ");
		int k = sc.nextInt(); // liest eine Ganzzahl (int) ein
		System.out.println(++k); // Ausgabe a)
		System.out.println(k); // Ausgabe b)
		System.out.println(k++); // Ausgabe c)
		int k2 = 5;
		double result = k2 / 2; // Stelle 1
		System.out.println("5 / 2 = " + result); // Ausgabe d)
		boolean b = false;

		System.out.println((!b) ? "b ist falsch." : "b ist wahr.");

	}

}

// a) bei ausgabe a) wird zahl +1 gerechnet aund ausgegeben, bei b) wird zahl
// nur ausgegeben uns schliesslich bei c) wird zahl ausgegeben und dann +1
// gerechnet
// b)double result = (double) k2 / 2; mit einem cast wird die Gleitkomadiviion
// ezrwingt.
// c) System.out.println((!b) ? "b ist falsch." : "b ist wahr.");
