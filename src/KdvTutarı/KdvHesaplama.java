package KdvTutarı;
import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz: ");

        double kdvszfyt;
        kdvszfyt=input.nextDouble();

        System.out.print("KDV'siz Fiyat: ");
        System.out.println(kdvszfyt);

        double kdvlfyt1,kdlfyt2;
        kdvlfyt1=kdvszfyt+(0.18*kdvszfyt);
        kdlfyt2=kdvszfyt+(0.08*kdvszfyt);
        System.out.print("KDV'li Fiyat: ");
        boolean a= kdvszfyt<1000;
        System.out.println(a ? kdvlfyt1:kdlfyt2);

        double kdvtut1, kdvtut2;
        kdvtut1=kdvszfyt*0.18;
        kdvtut2=kdvszfyt*0.08;
        System.out.print("KDV Tutarı:");
        System.out.println(a? kdvtut1:kdvtut2);

        double kdvo1,kdvo2;
        kdvo1= 0.18;
        kdvo2=0.08;
        System.out.print("KDV oranı: ");
        System.out.println(a ? kdvo1: kdvo2);




    }
}
