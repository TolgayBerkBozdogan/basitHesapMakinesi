import java.util.Scanner;

public class basitHesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2;
        int select;

        System.out.print("Birinci Sayıyı Giriniz:");
        n1 = input.nextDouble();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextDouble();
        System.out.println("Yapmak istediğiniz işlemi seçiniz.\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz:");
        select = input.nextInt();

        /* if (select == 1) {
            System.out.print("Toplama Sonucu: " + (n1 + n2));
        } else if (select == 2) {
            System.out.print("Çıkarma Sonucu: " + (n1 - n2));
        } else if (select == 3) {
            System.out.print("Çarpma Sonucu: " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.print("Bölme Sonucu: " + (n1 / n2));
            } else {
                System.out.print("Bir Sayı Sıfıra  Bölünemez");
            }


        }else {
            System.out.print("Yanlış Seçim Yaptınız. Tekrar Deneyiniz.");
        } */

        switch (select) {
            case 1:
                System.out.print("Toplama Sonucu: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma Sonucu: " + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma Sonucu: " + (n1 * n2));
                break;
            case 4:
                System.out.print("Bölme Sonucu: " + (n1 / n2));
                break;
            default:
                System.out.print("Yanlış Seçim Yaptınız. Tekrar Deneyiniz.");
        }

    }
}
