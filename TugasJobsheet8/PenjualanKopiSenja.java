package TugasJobsheet8;
import java.util.Scanner;

public class PenjualanKopiSenja {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===\n");

        int totalPelangganSemua = 0;
        int totalItemSemua = 0;

        // perulangan cabang
        for (int c = 1; c <= jumlahCabang; c++) {
            System.out.println("--- Cabang " + c + " ---");
            System.out.print("Jumlah pelanggan: ");
            int pelanggan = sc.nextInt();

            int totalItemCabang = 0;

            // perulangan pelanggan di tiap cabang
            int p = 1;
            while (p <= pelanggan) {
                System.out.print("- Pelanggan " + p + " memesan berapa item? ");
                totalItemCabang += sc.nextInt();
                p++;
            }

            // tampilkan hasil cabang
            System.out.println("Cabang " + c + ":");
            System.out.println("- Pelanggan: " + pelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);
            System.out.println();

            // total keseluruhan 
            totalPelangganSemua += pelanggan;
            totalItemSemua += totalItemCabang;
        }

        // total akhir semua cabang
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelangganSemua + " orang");
        System.out.println("Item terjual: " + totalItemSemua + " item");
    }
}
