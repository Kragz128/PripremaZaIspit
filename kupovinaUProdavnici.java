package vezbaPredIspit;

import java.util.Scanner;

public class kupovinaUProdavnici {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Unesite cenu proizvoda: ");
        
        double [] cena = new double[5];
        double popust = 0.1;
        double ukupnaCena = 0;
        double ukupnaCenaPrePopusta = 0;
        int preko100 = 0;
        
        for (int i  = 0; i < cena.length; i++) {
        	cena[i] = sc.nextDouble();
        	
			ukupnaCena += cena[i];
			ukupnaCenaPrePopusta += cena[i];
			
			if (cena[i] > 100) {
				preko100++;
			}
		}
        if (ukupnaCena > 500) {
			ukupnaCena = ukupnaCena - (ukupnaCena * popust);
			System.out.println("Ukupna cena sa popustom je: " + ukupnaCena);
		}
        
        System.out.println("Ukupna cena pre popusta je: " + ukupnaCenaPrePopusta);
        System.out.println("Broj proizvoda koji su skuplji od 100 je: " + preko100);     
    }
}