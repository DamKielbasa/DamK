import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbe zjedzonych ciastek: ");
        double ciastka;
        ciastka = klawiatura.nextInt();

        int porcja=40/10;
        double jedno_ciastko=300/porcja;
        double ilosc_kcal=ciastka* jedno_ciastko;

        System.out.println("Zjadłeś łącznie: "+ilosc_kcal+" kcal");

    }
}
