import java.util.Scanner;

public class TiketBioskop19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket, totalTiket = 0;
        int hargaBayar, totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Masukkan ulang jumlah tiket!");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }

            hargaBayar = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                hargaBayar = hargaBayar * 85 / 100;
                System.out.println("Diskon 15%");
            } else if (jumlahTiket > 4) {
                hargaBayar = hargaBayar * 90 / 100;
                System.out.println("Diskon 10%");
            }

            System.out.println("Total bayar pelanggan: Rp " + hargaBayar);

            totalTiket += jumlahTiket;
            totalPenjualan += hargaBayar;
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
    }
}