public class Main_Rueckgabe {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        final int uebergeben = 10;
        boolean choose;
        if (choose) {
            int rueckgabe;
            int zahl = 2;
            rueckgabe = Testtreiber_Rueckgabe.zurueck(zahl, uebergeben);
            System.out.println("zahl: " + zahl + " uebergeben: " + uebergeben + " || " + rueckgabe);
        } else {
            int rueckgabe;
            int zahl = 5;
            rueckgabe = Testtreiber_Rueckgabe.zurueck(zahl, uebergeben);
            System.out.println("zahl: " + zahl + " uebergeben: " + uebergeben + " || " + rueckgabe);
        }
    }
}