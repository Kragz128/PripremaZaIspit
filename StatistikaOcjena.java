package vezbaPredIspit;

import java.util.Scanner;

public class StatistikaOcjena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ocjene = new int[5];
        int suma = 0;
        int brojDesetica = 0;
        int najveca = 0;

        System.out.println("Unesite 5 ocjena (od 6 do 10):");

        for (int i = 0; i < ocjene.length; i++) {
            ocjene[i] = sc.nextInt();

            if (ocjene[i] < 6 || ocjene[i] > 10) {
                System.out.println("Ocjena mora biti između 6 i 10!");
                i--; 
                continue;
            }

            suma += ocjene[i];

            if (ocjene[i] == 10) {
                brojDesetica++;
            }

            if (ocjene[i] > najveca) {
                najveca = ocjene[i];
            }
        }

        double prosjek = suma / 5.0;

        System.out.println("Prosjek: " + prosjek);
        System.out.println("Broj desetica: " + brojDesetica);
        System.out.println("Najveca ocjena: " + najveca);

        if (prosjek >= 9.5) {
            System.out.println("Status: Odlican");
        } else if (prosjek >= 8.5) {
            System.out.println("Status: Vrlo dobar");
        } else if (prosjek >= 7.0) {
            System.out.println("Status: Dobar");
        } else if (prosjek >= 6.0) {
            System.out.println("Status: Dovoljan");
        } else {
            System.out.println("Status: Nije prosao");
        }
    }
}