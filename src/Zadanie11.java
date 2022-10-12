import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbe przejechanych kilometrów: ");
        int kilometr;
        kilometr = klawiatura.nextInt();

        System.out.println("Podaj ile litrów paliwa zużyłeś? : ");
        double paliwo = klawiatura.nextDouble();

        double kilometry_na_litrze= kilometr/paliwo;
        System.out.println("Liczba kilometrów przejechanych na litrze paliwa wynosi: "+kilometry_na_litrze );
    }
}
