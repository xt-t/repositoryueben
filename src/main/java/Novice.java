import java.util.Scanner;

public class Novice {
    public static void main(String[] args) {
        meinName();
        namemalfuenf();
        zahlgroessernull(3);
        zahlquadrat(5);
        nameeinlesen();
    }

    public static void meinName() {
        System.out.println("Mein Name ist Thuy.");
    }

    public static void namemalfuenf() {
        for (int i = 0; i < 5; i++) {
            meinName();
        }
    }

    public static boolean zahlgroessernull(int a) {
        System.out.println(a > 0);
        return (a > 0);
    }

    public static int zahlquadrat(int a) {
        System.out.println(a * a);
        return (a * a);
    }

    public static void nameeinlesen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib deinen Namen ein.");
        String s = scanner.next();
        System.out.println("Hallo " + s);
    }

}