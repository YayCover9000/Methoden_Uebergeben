import java.util.Scanner;
public class Main_Rueckgabe {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Teiler eingeben");
        int teiler = sc.nextInt();
        final int uebergeben = 1000;
        System.out.println("bitte wählen true false");
        boolean choose = sc.nextBoolean();
        int rueckgabe;
        if (choose) {
            int zahl1 = 2;
            rueckgabe = Testtreiber_Rueckgabe.zurueck(zahl1, uebergeben, teiler);
            System.out.println("true wurde gewählt mit Zahl: " + zahl1 + " uebergeben: " + uebergeben + " || " + rueckgabe);
        } else {
            int zahl2 = 5;
            rueckgabe = Testtreiber_Rueckgabe.zurueck(zahl2, uebergeben, teiler);
            System.out.println("false wurde gewählt mit Zahl: " + zahl2 + " uebergeben: " + uebergeben + " || " + rueckgabe);
        }
    }
}