package TugasJobsheet8;

public class JumlahKuadrat {

    public static void main(String[] args) {
        int batas = 5; // batas nilai n (1 s.d 5)

        for (int n = 1; n <= batas; n++) {
            int jumlahKuadrat = 0;
            String deret = "";

            // perulangan dalam untuk menghitung jumlah kuadrat dari 1 sampai n
            for (int i = 1; i <= n; i++) {
                int kuadrat = i * i;
                jumlahKuadrat += kuadrat;
                deret += kuadrat;

                // tambah tanda + kecuali di akhir
                if (i < n) {
                    deret += " + ";
                }
            }

            // tampilkan hasil
            if (n == 1) {
                // khusus untuk n = 1 agar tampil "n = 1 -> jumlah kuadrat = 1"
            System.out.println("n = " + n + " -> jumlah kuadrat = " + deret);
            } else {
                System.out.println("n = " + n + " -> jumlah kuadrat = " + deret + " = " + jumlahKuadrat);
            }
        }
    }
    
}
