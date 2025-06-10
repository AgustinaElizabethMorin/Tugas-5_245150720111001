import java.util.Scanner;

class Kalkulator {

    // Static methods untuk penjumlahan dan pengurangan
    public static double penjumlahan(double a, double b) {
        return a + b;
    }

    public static double pengurangan(double a, double b) {
        return a - b;
    }

    // Non-static methods untuk perkalian dan pembagian
    public double perkalian(double a, double b) {
        return a * b;
    }

    public int pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol!");
        }
        return a / b;
    }

    // Method non-static untuk menyederhanakan pecahan
    public String Sederhana(int pembilang, int penyebut) {
        if (penyebut == 0) {
            return "Error: Penyebut tidak boleh nol!";
        }

        int faktorPersekutuanTerbesar = fpb(pembilang, penyebut);
        int pembilangSederhana = pembilang / faktorPersekutuanTerbesar;
        int penyebutSederhana = penyebut / faktorPersekutuanTerbesar;

        return pembilangSederhana + "/" + penyebutSederhana;
    }

    // Helper method untuk mencari FPB (Faktor Persekutuan Terbesar)
    private int fpb(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator calc = new Kalkulator();

        while (true) {
            System.out.println("\nPilih operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Sederhanakan Pecahan");
            System.out.println("0. Keluar");

            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                System.out.println("Terima kasih!");
                break;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    double angka1 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double angka2 = scanner.nextDouble();
                    System.out.println("Hasil penjumlahan: " + Kalkulator.penjumlahan(angka1, angka2));
                    break;
                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    double angka3 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double angka4 = scanner.nextDouble();
                    System.out.println("Hasil pengurangan: " + Kalkulator.pengurangan(angka3, angka4));
                    break;
                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    double angka5 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double angka6 = scanner.nextDouble();
                    System.out.println("Hasil perkalian: " + calc.perkalian(angka5, angka6));
                    break;
                case 4:
                    System.out.print("Masukkan pembilang: ");
                    int angka7 = scanner.nextInt();
                    System.out.print("Masukkan penyebut: ");
                    int angka8 = scanner.nextInt();
                    try {
                        System.out.println("Hasil pembagian: " + calc.pembagian(angka7, angka8));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Masukkan pembilang: ");
                    int pembilang = scanner.nextInt();
                    System.out.print("Masukkan penyebut: ");
                    int penyebut = scanner.nextInt();
                    System.out.println("Hasil penyederhanaan: " + calc.Sederhana(pembilang, penyebut));
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
