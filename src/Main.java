
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Clasa principală a aplicației de simulare Loto 6/49.
 */
public class Main {

    public static void main(String[] args) {

        // Se creează un obiect pentru citirea datelor de la tastatură.
        Scanner scanner = new Scanner(System.in);

        int numarExtrageri;

        // Se solicită numărul de extrageri până când este introdus
        // un număr întreg pozitiv.
        while (true) {
            System.out.print("Introdu numărul de extrageri: ");

            String raspuns = scanner.nextLine().trim();

            try {
                numarExtrageri = Integer.parseInt(raspuns);

                if (numarExtrageri > 0) {
                    break;
                }

                System.out.println(
                        "Eroare: introdu un număr mai mare decât zero."
                );

            } catch (NumberFormatException e) {
                System.out.println(
                        "Eroare: trebuie să introduci un număr întreg."
                );
            }
        }

        // Se creează simulatorul Loto 6/49 folosind
        // numărul de extrageri ales de utilizator.
        StatisticiLoterie loterie =
                new StatisticiLoterie(numarExtrageri, 6, 49);

        // Se generează extragerile.
        List<int[]> extrageri = loterie.genereazaExtrageri();

        // Se calculează frecvențele numerelor.
        Map<Integer, Integer> frecvente =
                loterie.calculeazaFrecvente(extrageri);

        // Se afișează toate extragerile generate.
        System.out.println(
                "\n=== " + numarExtrageri + " EXTRAGERI ==="
        );
        loterie.afiseazaExtrageri(extrageri);

        // Se afișează cele mai frecvente șase numere.
        loterie.afiseazaTop6(frecvente);

        // Se afișează probabilitățile empirice.
        loterie.afiseazaProbabilitati(frecvente);

        // Rezultatele statistice nu prezic extragerile viitoare.
        System.out.println(
                "\nNotă: rezultatele sunt statistice "
                + "și nu prezic următoarea extragere."
        );

        scanner.close();
    }
}
