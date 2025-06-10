import java.text.NumberFormat;
import java.util.Locale;

class CVLabkomdas {

    // Konstanta final untuk harga jaket
    public static final int HARGA_JAKET_A = 100000;
    public static final int HARGA_JAKET_B = 125000;
    public static final int HARGA_JAKET_C = 175000;

    public static void main(String[] args) {
        // Contoh penggunaan
        int jumlahJaketA = 120;
        int jumlahJaketB = 80;
        int jumlahJaketC = 150;

        // Format mata uang Rupiah
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        // Hitung harga jaket A
        double hargaTotalJaketA;
        if (jumlahJaketA > 100) {
            hargaTotalJaketA = jumlahJaketA * 95000;
        } else {
            hargaTotalJaketA = jumlahJaketA * HARGA_JAKET_A;
        }

        // Hitung harga jaket B
        double hargaTotalJaketB;
        if (jumlahJaketB > 100) {
            hargaTotalJaketB = jumlahJaketB * 120000;
        } else {
            hargaTotalJaketB = jumlahJaketB * HARGA_JAKET_B;
        }

        // Hitung harga jaket C
        double hargaTotalJaketC;
        if (jumlahJaketC > 100) {
            hargaTotalJaketC = jumlahJaketC * 160000;
        } else {
            hargaTotalJaketC = jumlahJaketC * HARGA_JAKET_C;
        }

        // Hitung total harga keseluruhan
        double totalHargaKeseluruhan = hargaTotalJaketA + hargaTotalJaketB + hargaTotalJaketC;

        // Tampilkan hasil dengan format Rupiah
        System.out.println("Harga Total Jaket A: " + formatter.format(hargaTotalJaketA));
        System.out.println("Harga Total Jaket B: " + formatter.format(hargaTotalJaketB));
        System.out.println("Harga Total Jaket C: " + formatter.format(hargaTotalJaketC));
        System.out.println("Total Harga Keseluruhan: " + formatter.format(totalHargaKeseluruhan));
    }
}
