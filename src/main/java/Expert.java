import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Expert {
    public static void main(String[] args) {
        rueckwaerts("Hallo Thuy");
        sortieren();
        strtoarray("Ich bin müde.");
        quersumme(678);
        IntToRom(234);
    }

    //Schreibe eine Methode die einen Eingabestring rückwärts ausgibt.
    public static void rueckwaerts (String a) {
        char [] b = new char [a.length()];
        for (int i = 0; i < (a.length()); i++) {
            b[i] = a.charAt((a.length()-1) - i);
            System.out.print(b[i]);
        }
        System.out.println();
    }

    //Gibt den folgenden Array aufsteigend sortiert aus: {6, 2, 8, 3, 9, 6}
    public static void sortieren () {
        int [] a = {6, 2, 8, 3, 9, 6};
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (a[j] > a[i]) {
                    int b = a[j];
                    a[j] = a[i];
                    a[i] = b;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    //Schreibe eine Methode die einen String nach , separiert und als Array zurückgibt.
    public static void strtoarray (String a) {
        char [] b = new char[a.length()];

        for (int i=0; i < a.length(); i++) {
            b [i] = a.charAt(i);
            System.out.print(b[i] + ",");
        }
    }
    //Schreibe eine Methode die Quersumme einer Ganzzahl berechnet.
    public static void quersumme (int a) {
        int quer = 0;
        String b = Integer.toString(a);
        char[] c = new char[b.length()];
        for (int i = 0; i <= (b.length()-1); i++) {
            c[i] = b.charAt(i);
            quer += c[i] - '0';
        }
        System.out.println();
        System.out.println("Quersumme: " +quer);
    }

    //Gib eine Ganzzahl (1-100) als römische Zahl aus (12 = XII)
    public static void IntToRom(int a) {
        String b = IntegerToRomanNumeral(a);
        System.out.println(b);
    }

    public static String IntegerToRomanNumeral(int input) {
        if (input < 1 || input > 3999)
            return "Invalid Roman Number Value";
        String s = "";
        while (input >= 1000) {
            s += "M";
            input -= 1000;        }
        while (input >= 900) {
            s += "CM";
            input -= 900;
        }
        while (input >= 500) {
            s += "D";
            input -= 500;
        }
        while (input >= 400) {
            s += "CD";
            input -= 400;
        }
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }
}