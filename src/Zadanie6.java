public class Zadanie6 {
    public static void main(String[] args) {
        int pomieszczenie1= 3 * 4;
        int pomieszczenie2= 3 * 4;
        int pomieszczenie3= 2 * 3;
        int pomieszczenie4= 2 * 2;
        System.out.println("Powierzchnia pomieszczenia1: "+pomieszczenie1);
        System.out.println("Powierzchnia pomieszczenia2: "+pomieszczenie2);
        System.out.println("Powierzchnia pomieszczenia3: "+pomieszczenie3);
        System.out.println("Powierzchnia pomieszczenia4: "+pomieszczenie4);
        int suma=pomieszczenie1+pomieszczenie2+pomieszczenie3+pomieszczenie4;
        System.out.println("Powierzchnia całego mieszkanai to: "+suma );
        int osoba=4;
        double PownaOsobe;
        PownaOsobe= (double)suma/osoba;

        System.out.println("Powierzchnia przypadająca na jedna osobe to: " +PownaOsobe    );
    }
}
