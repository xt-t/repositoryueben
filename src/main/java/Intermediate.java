import java.util.Scanner;
import java.util.ArrayList;

public class Intermediate {


    //Fülle einen String-Array mit den Zahlenwörtern "Eins" bis "Zehn"
    public static String[] zahlenwoerter = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
    public static String[] eingabe;
    public static void main(String[] args) {
        System.out.println(zahlenwoerter);
        zahlenausgabe(3);
        zahlenausgabe(7);
        hundert();
        einlesen();
    }

    //Schreibe eine Methode die zu einer einstelligen Zahl das entsprechende Zahlenwort ausgibt.
    public static void zahlenausgabe(int a) {
        System.out.println(zahlenwoerter[a - 1]);
    }

    /*Schreibe ein Programm das die Zahlen 1-100 ausgibt, aber:
    Vor Zahlen die durch 3 teilbar sind (modulo) soll ein # stehen
    Vor Zahlen die durch 5 teilbar sind soll ein $ stehen*/

    public static void hundert() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 5 == 0) {
                System.out.print("$ ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    //Schreibe ein Programm die Wörter vom Benutzer einliest (Scanner) und diese in einem Array speichert.
    //Gib vor jeder Eingabe jeweils die eingegebenen Wörter noch mal aus.

    public static void einlesen () {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Bitte gib etwas ein.");
        Scanner scanner = new Scanner(System.in);

        do {
            String s = scanner.next();
            list.add(s);
            if (!list.isEmpty()) {
                System.out.println(list);
            }
        } while (scanner.hasNext());
        scanner.close();
    }
}
