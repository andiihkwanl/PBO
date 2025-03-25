package posttest2;

import java.util.ArrayList;
import java.util.Scanner;

public class RumahSakitAirlangga {
    private static ArrayList<Pasien> daftarPasien = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\nMenu CRUD Layanan Rawat Inap:");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Lihat Semua Pasien");
            System.out.println("3. Perbarui Data Pasien");
            System.out.println("4. Hapus Data Pasien");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1:
                    tambahPasien();
                    break;
                case 2:
                    lihatPasien();
                    break;
                case 3:
                    perbaruiPasien();
                    break;
                case 4:
                    hapusPasien();
                    break;
                case 5:
                    running = false;
                    System.out.println("Terima kasih! Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi!");
            }
        }
    }

    private static void tambahPasien() {
        System.out.print("Masukkan ID Pasien: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Pasien: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Umur Pasien: ");
        int umur = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan Ruang Rawat: ");
        String ruang = scanner.nextLine();

        daftarPasien.add(new Pasien(id, nama, umur, ruang));
        System.out.println("Pasien berhasil ditambahkan!");
    }

    private static void lihatPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada data pasien.");
        } else {
            System.out.println("\nDaftar Pasien:");
            for (Pasien pasien : daftarPasien) {
                System.out.println(pasien);
            }
        }
    }

    private static void perbaruiPasien() {
        System.out.print("Masukkan ID Pasien yang ingin diperbarui: ");
        String id = scanner.nextLine();
        for (Pasien pasien : daftarPasien) {
            if (pasien.getId().equals(id)) {
                System.out.print("Masukkan Nama Baru: ");
                pasien.setNama(scanner.nextLine());
                System.out.print("Masukkan Umur Baru: ");
                pasien.setUmur(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Masukkan Ruang Baru: ");
                pasien.setRuang(scanner.nextLine());
                System.out.println("Data pasien berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Pasien dengan ID tersebut tidak ditemukan.");
    }

    private static void hapusPasien() {
        System.out.print("Masukkan ID Pasien yang ingin dihapus: ");
        String id = scanner.nextLine();
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getId().equals(id)) {
                daftarPasien.remove(i);
                System.out.println("Pasien berhasil dihapus!");
                return;
            }
        }
        System.out.println("Pasien dengan ID tersebut tidak ditemukan.");
    }
}