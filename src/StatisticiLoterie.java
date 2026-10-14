
import java.util.*;

/**
 * Gestionează simularea extragerilor Loto 6/49
 * și calcularea statisticilor pentru numerele generate.
 */
public class StatisticiLoterie {

    // Numărul total de extrageri.
    private final int numarExtrageri;

    // Numărul de numere din fiecare extragere.
    private final int numerePeExtragere;

    // Valoarea maximă posibilă a unui număr extras.
    private final int valoareMaxima;

    // Generator pentru numere aleatorii.
    private final Random generatorAleator = new Random();

    /**
     * Inițializează parametrii simulării.
     */
    public StatisticiLoterie(
            int numarExtrageri,
            int numerePeExtragere,
            int valoareMaxima) {

        if (numarExtrageri < 0) {
            throw new IllegalArgumentException(
                    "Numărul de extrageri nu poate fi negativ.");
        }

        if (valoareMaxima < 1
                || numerePeExtragere < 1
                || numerePeExtragere > valoareMaxima) {
            throw new IllegalArgumentException(
                    "Parametrii extragerii nu sunt valizi.");
        }

        this.numarExtrageri = numarExtrageri;
        this.numerePeExtragere = numerePeExtragere;
        this.valoareMaxima = valoareMaxima;
    }

    /**
     * Generează extrageri cu numere distincte,
     * ordonate crescător.
     */
    public List<int[]> genereazaExtrageri() {

        List<int[]> extrageri = new ArrayList<>();

        // Se generează numărul de extrageri ales de utilizator.
        for (int i = 0; i < numarExtrageri; i++) {

            // TreeSet elimină duplicatele și sortează numerele.
            TreeSet<Integer> numere = new TreeSet<>();

            while (numere.size() < numerePeExtragere) {
                int numar =
                        generatorAleator.nextInt(valoareMaxima) + 1;
                numere.add(numar);
            }

            // Se transformă setul într-un tablou de numere întregi.
            int[] extragere = new int[numerePeExtragere];
            int index = 0;

            for (int numar : numere) {
                extragere[index++] = numar;
            }

            extrageri.add(extragere);
        }

        return extrageri;
    }

    /**
     * Calculează frecvența de apariție a fiecărui număr.
     */
    public Map<Integer, Integer> calculeazaFrecvente(
            List<int[]> extrageri) {

        // Toate numerele pornesc cu frecvența zero.
        Map<Integer, Integer> frecvente = new TreeMap<>();

        for (int numar = 1; numar <= valoareMaxima; numar++) {
            frecvente.put(numar, 0);
        }

        // Se numără aparițiile numerelor în toate extragerile.
        for (int[] extragere : extrageri) {
            for (int numar : extragere) {
                frecvente.put(
                        numar,
                        frecvente.get(numar) + 1
                );
            }
        }

        return frecvente;
    }

    /**
     * Afișează toate extragerile generate.
     */
    public void afiseazaExtrageri(List<int[]> extrageri) {

        for (int i = 0; i < extrageri.size(); i++) {
            System.out.printf(
                    "Extragerea %3d: %s%n",
                    i + 1,
                    Arrays.toString(extrageri.get(i))
            );
        }
    }

    /**
     * Afișează cele mai frecvente șase numere.
     * La egalitate, numărul mai mic are prioritate.
     */
    public void afiseazaTop6(Map<Integer, Integer> frecvente) {

        System.out.println("\n=== TOP 6 NUMERE ===");

        frecvente.entrySet()
                .stream()
                .sorted(
                        Map.Entry.<Integer, Integer>comparingByValue(
                                Comparator.reverseOrder()
                        ).thenComparing(Map.Entry.comparingByKey())
                )
                .limit(6)
                .forEach(inregistrare ->
                        System.out.printf(
                                "Numărul %d -> %d apariții%n",
                                inregistrare.getKey(),
                                inregistrare.getValue()
                        )
                );
    }

    /**
     * Calculează și afișează probabilitatea empirică
     * pentru fiecare număr.
     */
    public void afiseazaProbabilitati(
            Map<Integer, Integer> frecvente) {

        // Numărul total de valori generate în simulare.
        int totalNumereExtrase =
                numarExtrageri * numerePeExtragere;

        System.out.println("\n=== PROBABILITĂȚI EMPIRICE ===");

        for (Map.Entry<Integer, Integer> inregistrare
                : frecvente.entrySet()) {

            // Probabilitatea empirică este frecvența
            // împărțită la numărul total de valori extrase.
            double probabilitate = totalNumereExtrase == 0
                    ? 0.0
                    : (double) inregistrare.getValue()
                    / totalNumereExtrase;

            System.out.printf(
                    "Numărul %2d -> %.4f%n",
                    inregistrare.getKey(),
                    probabilitate
            );
        }
    }
}
