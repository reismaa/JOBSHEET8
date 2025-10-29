package TugasJobsheet8;
import java.util.Scanner;

public class PersegiAngka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal 3!");
            return;
        }

        // cetak baris demi baris
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // baris pertama dan terakhir -> cetak semua angka 
                // kolom pertama dan terakhir -> cetak angka juga
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  "); // bagian tengah kosong
                }
            }
            System.out.println();
        }

        sc.close();
    }
    
}
