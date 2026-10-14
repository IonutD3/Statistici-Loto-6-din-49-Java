# Statistici și Simulare Loterie 6/49 în Java

## 🇷🇴 Română

### Descriere

Utilizatorul introduce numărul de extrageri care trebuie generate. Pentru fiecare extragere, aplicația selectează aleatoriu 6 numere distincte din intervalul 1–49.

După generarea extragerilor, aplicația calculează frecvența fiecărui număr, identifică cele mai frecvente 6 numere și determină probabilitățile empirice pe baza rezultatelor simulate.

Proiectul urmărește exersarea programării orientate pe obiecte, a colecțiilor din Java, a Stream API și a conceptelor statistice de bază.

## 2. Funcționalități

- Citirea numărului de extrageri de la utilizator.
- Validarea datelor introduse.
- Generarea a 6 numere distincte pentru fiecare extragere, din intervalul 1–49.
- Afișarea extragerilor în ordine crescătoare.
- Calcularea frecvenței fiecărui număr de la 1 la 49.
- Identificarea și afișarea celor mai frecvente 6 numere.
- Calcularea probabilităților empirice pentru toate cele 49 de numere.
- Ordonarea numerelor după frecvență descrescătoare și, în caz de egalitate, după valoarea numerică crescătoare.
- Tratarea situației în care numărul de extrageri este zero, pentru a evita împărțirea la zero.

## 3. Tehnologii utilizate

- **Java** – limbajul de programare.
- **Programare orientată pe obiecte (OOP)** – separarea responsabilităților între clase.
- **Java Collections Framework** – gestionarea extragerilor și a frecvențelor.
- **`List` și `ArrayList`** – stocarea extragerilor.
- **`TreeSet`** – selectarea numerelor distincte și păstrarea ordinii crescătoare.
- **`Map` și `TreeMap`** – organizarea frecvențelor numerelor.
- **`Random`** – generarea numerelor pseudoaleatorii.
- **Stream API** – sortarea și selectarea celor mai frecvente numere.
- **`Scanner`** – citirea datelor introduse de utilizator.

## 4. Structura proiectului

```text
Statistici-Loto-6-din-49-Java/
├── src/
│   ├── Main.java
│   └── StatisticiLoterie.java
└── README.md
```

### `Main.java`

Clasa principală a aplicației. Responsabilitățile sale sunt:
- citirea și validarea numărului de extrageri;
- crearea obiectului `StatisticiLoterie`;
- apelarea metodelor pentru generarea și analiza extragerilor;
- afișarea rezultatelor în consolă.

### `StatisticiLoterie.java`

Clasa care implementează logica aplicației:
- generarea extragerilor;
- calcularea frecvențelor numerelor;
- identificarea celor mai frecvente 6 numere;
- calcularea probabilităților empirice;
- afișarea extragerilor și a statisticilor.

## 5. Algoritmi și calcule statistice

### Generarea extragerilor

Fiecare extragere conține 6 numere distincte din intervalul 1–49. Colecția `TreeSet` previne duplicatele și păstrează numerele în ordine crescătoare.

### Calcularea frecvențelor

Aplicația inițializează frecvența fiecărui număr de la 1 la 49 cu valoarea zero. Pentru fiecare extragere, frecvența numerelor selectate este incrementată.

### Identificarea celor mai frecvente numere

Numerele sunt sortate după frecvență, în ordine descrescătoare. Dacă două sau mai multe numere au aceeași frecvență, acestea sunt ordonate crescător după valoarea numerică. Aplicația afișează primele 6 numere din clasament.

### Calcularea probabilităților empirice

Probabilitatea empirică a unui număr este calculată folosind formula:

\[
P_{\mathrm{emp}}(n)=\frac{f(n)}{D \times 6}
\]

Unde:
- \(f(n)\) reprezintă frecvența numărului analizat;
- \(D\) reprezintă numărul total de extrageri;
- \(6\) reprezintă numărul de numere din fiecare extragere.

Această valoare reprezintă proporția aparițiilor unui număr din totalul numerelor generate. Dacă nu există extrageri, aplicația gestionează cazul fără a efectua o împărțire la zero.

## 6. Cerințe de sistem

- Java Development Kit (JDK).
- Un editor de cod sau un mediu de dezvoltare integrat (IDE), precum IntelliJ IDEA, Eclipse ori Visual Studio Code.
- Nu sunt necesare biblioteci externe.

## 7. Instalare și rulare

### Pasul 1 – Descărcarea proiectului

Clonează repository-ul sau descarcă proiectul pe calculator.

### Pasul 2 – Deschiderea proiectului

Deschide directorul proiectului în IDE-ul preferat sau într-un terminal.

### Pasul 3 – Compilarea

Din directorul principal al proiectului, execută:

```bash
javac -d out src/Main.java src/StatisticiLoterie.java
```

Această comandă compilează fișierele Java și plasează fișierele `.class` generate în directorul `out/`.

### Pasul 4 – Rularea aplicației

Execută:

```bash
java -cp out Main
```

### Pasul 5 – Utilizarea aplicației

Introdu un număr întreg pozitiv pentru a stabili câte extrageri trebuie generate. Aplicația va afișa extragerile și statisticile calculate.

## 8. Exemplu de utilizare

Exemplu ilustrativ al interacțiunii cu aplicația:

```text
Introdu numarul de extrageri: 100

EXTRAGERI GENERATE
Extragerea 1: [3, 11, 18, 27, 35, 46]
Extragerea 2: [5, 11, 19, 24, 35, 42]
...

TOP 6 NUMERE
...

PROBABILITATI EMPIRICE
...

Nota: Rezultatele statistice nu prezic
extragerile viitoare ale jocului Loto 6/49.
```

Valorile prezentate sunt orientative. Rezultatele reale diferă de la o rulare la alta.

## 9. Concepte demonstrate

- Programare orientată pe obiecte (OOP).

- Separarea responsabilităților între clase.

- Utilizarea colecțiilor și a tablourilor.

- Generarea numerelor aleatorii și eliminarea duplicatelor.

- Sortarea datelor și calcularea frecvențelor.

- Validarea intrărilor utilizatorului.

- Calcularea probabilităților empirice.

---

# Lotto 6/49 Statistics

## 🇬🇧 English

### Description

**Lotto 6/49 Statistics** is a Java console application that simulates Lotto 6/49 draws and analyzes the generated results.

The user enters the number of draws to generate. For each draw, the application randomly selects 6 distinct numbers from the range 1–49.

After generating the draws, the application calculates the frequency of each number, identifies the 6 most frequent numbers, and computes empirical probabilities based on the simulated results.

The project provides practical experience with object-oriented programming, Java Collections, the Stream API, and basic statistical concepts.

## 2. Features

- Reading the number of draws from user input.
- Validating user input.
- Generating 6 distinct numbers per draw from the range 1–49.
- Displaying each draw in ascending order.
- Calculating the frequency of every number from 1 to 49.
- Identifying and displaying the 6 most frequent numbers.
- Calculating empirical probabilities for all 49 numbers.
- Sorting numbers by descending frequency and, in case of a tie, by ascending numerical value.
- Handling zero draws to prevent division by zero.

## 3. Technologies Used

- **Java** – the programming language.
- **Object-Oriented Programming (OOP)** – separating responsibilities between classes.
- **Java Collections Framework** – managing draws and number frequencies.
- **`List` and `ArrayList`** – storing generated draws.
- **`TreeSet`** – selecting distinct numbers and maintaining ascending order.
- **`Map` and `TreeMap`** – organizing number frequencies.
- **`Random`** – generating pseudorandom numbers.
- **Stream API** – sorting and selecting the most frequent numbers.
- **`Scanner`** – reading user input.

## 4. Project Structure

```text
Statistici-Loto-6-din-49-Java/
├── src/
│   ├── Main.java
│   └── StatisticiLoterie.java
└── README.md
```

### `Main.java`

The main application class. Its responsibilities include:
- reading and validating the number of draws;
- creating a `StatisticiLoterie` object;
- calling the methods required to generate and analyze the draws;
- displaying the results in the console.

### `StatisticiLoterie.java`

The class that implements the application's core logic:
- generating draws;
- calculating number frequencies;
- identifying the 6 most frequent numbers;
- calculating empirical probabilities;
- displaying draws and statistical results.

## 5. Algorithms and Statistical Calculations

### Draw Generation

Each draw contains 6 distinct numbers from the range 1–49. The `TreeSet` collection prevents duplicates and keeps the numbers sorted in ascending order.

### Frequency Calculation

The application initializes the frequency of every number from 1 to 49 to zero. For each draw, the frequencies of the selected numbers are incremented.

### Identifying the Most Frequent Numbers

Numbers are sorted by frequency in descending order. If two or more numbers have the same frequency, they are sorted by ascending numerical value. The application displays the first 6 numbers in the ranking.

### Empirical Probability Calculation

The empirical probability of a number is calculated using the following formula:

\[
P_{\mathrm{emp}}(n)=\frac{f(n)}{D \times 6}
\]

Where:
- \(f(n)\) is the frequency of the number being analyzed;
- \(D\) is the total number of draws;
- \(6\) is the number of numbers in each draw.

This value represents the proportion of occurrences of a number among all generated numbers. If no draws are generated, the application handles the case without dividing by zero.

## 6. System Requirements

- Java Development Kit (JDK).
- A code editor or integrated development environment (IDE), such as IntelliJ IDEA, Eclipse, or Visual Studio Code.
- No external libraries are required.

## 7. Installation and Execution

### Step 1 – Download the Project

Clone the repository or download the project to your computer.

### Step 2 – Open the Project

Open the project directory in your preferred IDE or terminal.

### Step 3 – Compile the Application

From the project's root directory, run:

```bash
javac -d out src/Main.java src/StatisticiLoterie.java
```

This command compiles the Java files and places the generated `.class` files in the `out/` directory.

### Step 4 – Run the Application

Execute:

```bash
java -cp out Main
```

### Step 5 – Use the Application

Enter a positive integer to specify how many draws should be generated. The application will display the draws and the calculated statistics.

## 8. Usage Example

The following is an illustrative example of how the application works:

```text
Enter the number of draws: 100

GENERATED DRAWS
Draw 1: [3, 11, 18, 27, 35, 46]
Draw 2: [5, 11, 19, 24, 35, 42]
...

TOP 6 NUMBERS
...

EMPIRICAL PROBABILITIES
...

Note: These statistics do not predict future
Lotto 6/49 draws.
```

The values shown are illustrative. Actual results vary between runs.

## 9. Concepts Demonstrated

- Object-oriented programming (OOP).

- Separation of responsibilities between classes.

- Java collections and arrays.

- Random number generation and duplicate prevention.

- Data sorting and frequency analysis.

- User input validation.

- Empirical probability calculations.

---

## 👤 Autor / Author

**IonutD**
