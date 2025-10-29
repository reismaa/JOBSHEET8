import java.util.Scanner;

public class NilaiKelompok24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilai;
        float totalNilai, rataNilai;
        float rataTertinggi = 0; // untuk menyimpan nilai rata-rata tertinggi
        int kelompokTertinggi = 0; // untuk menyimpan nomor kelompok dengan rata-rata tertinggi

        //  struktur perulangan untuk outer loop
        i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (j=1; j<=5; j++) {   //  struktur perulangan untuk inner loop
                System.out.print("  Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + " nilai rata-rata = " + rataNilai);

            // cek apakah rata-rata saat ini lebih tinggi dari sebelumnya
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

            i++;

        }

        System.out.println("\n Kelompok dengan rata-rata tertinggi adalah Kelompok " + kelompokTertinggi + " dengan nilai rata-rata " + rataTertinggi);
    }
    
}
