import java.awt.*;
import java.net.SocketOption;
import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj wartość kupowanego produktu: ");
        int cena;
        cena = klawiatura.nextInt();
        double podatek_stanowy= 0.04;
        double podanek_lokalny=0.02;
        double war_pod_stanowego= cena * podatek_stanowy;
        double war_pod_lokalnego= cena * podanek_lokalny;
        double cena_sprzedazy= cena+ war_pod_lokalnego+ war_pod_stanowego;

        System.out.println("Wartość produktu to: " +cena);
        System.out.println("Wartośc podaktu stanowego to: "+war_pod_stanowego);
        System.out.println("Wartośc podaktu lokalnego to: "+war_pod_lokalnego);
        System.out.println("Łączna cena sprzedazy to: "+cena_sprzedazy);

    }
}
