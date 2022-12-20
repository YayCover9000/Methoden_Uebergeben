public class Testtreiber_Rueckgabe {
    public static int zurueck(int zahl, int uebergeben, int teiler){
        System.out.println("uebergeben: " + uebergeben);
        System.out.println("teiler: " + teiler);
        int uundt = uebergeben / teiler;
        System.out.println("uundt: " + uundt);
        int back = uundt + zahl;
        System.out.println("back: " + back);
        zahl = uundt - back;
        System.out.println("zahl aus Testtreiber: " + zahl + " !§$%&/%$!");


        return zahl;
            }
        }


