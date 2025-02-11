import java.util.Scanner;
public class SistemPerpustakaan {
static Scanner scanner = new Scanner(System.in);
    static String[] buku = {"Pemrograman Java", "Struktur Data", "Desain Algoritma"};
    static boolean[] bukuTersedia = {true, true, true};
    static String[] anggota = {"Daffa", "Khairi", "Kanz"};
    static String[] bukuDipinjam = new String[anggota.length];

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Sistem Perpustakaan ===");
            System.out.println("1. Lihat Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1 -> tampilkanBuku();
                case 2 -> pinjamBuku();
                case 3 -> kembalikanBuku();
                case 4 -> System.out.println("Terima kasih telah menggunakan sistem perpustakaan!");
                default -> System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihan != 4);
    }

    static void tampilkanBuku() {
        System.out.println("\nDaftar Buku:");
        for (int i = 0; i < buku.length; i++) {
            System.out.println((i + 1) + ". " + buku[i] + (bukuTersedia[i] ? " (Tersedia)" : " (Dipinjam)"));
        }
    }

    static void pinjamBuku() {
        System.out.print("Masukkan nama anggota: ");
        String namaAnggota = scanner.nextLine();
        int indeksAnggota = cariAnggota(namaAnggota);
        if (indeksAnggota == -1) {
            System.out.println("Anggota tidak ditemukan.");
            return;
        }
        
        if (bukuDipinjam[indeksAnggota] != null) {
            System.out.println("Anda sudah meminjam buku. Kembalikan terlebih dahulu!");
            return;
        }
        
        tampilkanBuku();
        System.out.print("Pilih nomor buku yang ingin dipinjam: ");
        int indeksBuku = scanner.nextInt() - 1;
        scanner.nextLine();
        
        if (indeksBuku >= 0 && indeksBuku < buku.length && bukuTersedia[indeksBuku]) {
            bukuTersedia[indeksBuku] = false;
            bukuDipinjam[indeksAnggota] = buku[indeksBuku];
            System.out.println("Buku " + buku[indeksBuku] + " berhasil dipinjam.");
        } else {
            System.out.println("Buku tidak tersedia atau pilihan tidak valid.");
        }
    }

    static void kembalikanBuku() {
        System.out.print("Masukkan nama anggota: ");
        String namaAnggota = scanner.nextLine();
        int indeksAnggota = cariAnggota(namaAnggota);
        if (indeksAnggota == -1) {
            System.out.println("Anggota tidak ditemukan.");
            return;
        }

        if (bukuDipinjam[indeksAnggota] == null) {
            System.out.println("Anda tidak memiliki buku yang dipinjam.");
            return;
        }
        
        for (int i = 0; i < buku.length; i++) {
            if (buku[i].equals(bukuDipinjam[indeksAnggota])) {
                bukuTersedia[i] = true;
                System.out.println("Buku " + bukuDipinjam[indeksAnggota] + " telah dikembalikan.");
                bukuDipinjam[indeksAnggota] = null;
                return;
            }
        }
    }

    static int cariAnggota(String nama) {
        for (int i = 0; i < anggota.length; i++) {
            if (anggota[i].equalsIgnoreCase(nama)) {
                return i;
            }
        }
        return -1;
    }
}
