import java.util.Scanner;

public class NilaiKelompok24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilai;
        float totalNilai, rataNilai;

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
            i++;

        }
    }
    
}
