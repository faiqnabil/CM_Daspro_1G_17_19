package Case_Method;

import java.util.Scanner;

public class CMKafe_17_19 {
    static String pelanggan[] = new String[50];
    static int noMeja[] = new int[50];
    static int jumlahPesanan = 0;
    static int totalHarga[] = new int[50];
    static int pesanan[] = new int[50];
    static int item, pilihMenu;
    static int totalAkhir; 
    static int hargaMenu[] = {15000, 22000, 12000, 18000};
    static String namaMenu[] = {"Kopi Hitam", "Latte", "Teh Tarik", "Mie goreng"};
    
    
        static void Menu(){
            System.out.println("=====Menu Utama======");
            System.out.println("1. Tambahkan pesanan");
            System.out.println("2. Tampilkan Daftar Pesanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu : ");
           
        }
    
        static void TambahkanPesanan(){
            Scanner input = new Scanner(System.in);

            System.out.print("\nmasukkan nama Pelanggan : ");
            pelanggan[jumlahPesanan] = input.nextLine();
            System.out.print("Masukkan nomor meja : ");
            noMeja[jumlahPesanan] = input.nextInt();
            System.out.println("\n====== MENU KAFE ====");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println((i+1) + ". " + namaMenu[i] + " - Rp " + hargaMenu[i]);
        }

        do {
        
        System.out.print("pilih menu (masukkan nomor menu, atau 0 untuk selesai) : ");
        pilihMenu = input.nextInt();

            if (pilihMenu != 0 && pilihMenu <= namaMenu.length) {
                System.out.print("Masukkan jumlah item untuk " + namaMenu[pilihMenu-1] + ": ");
                item = input.nextInt();

                totalHarga[jumlahPesanan] += item * hargaMenu[pilihMenu-1];
            } else {
                System.out.println("\nPesanan berhasil ditambahkan.");
                System.out.println("Total harga pesanan: Rp " + totalHarga[jumlahPesanan] + "\n");
            }
        } while (pilihMenu != 0);
                jumlahPesanan++;
    }

    
    static void TampilkanDaftar(){
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\n===== DAFTAR PESANAN =====");
            System.out.println("Nama Pelanggan: " + pelanggan[i]);
            System.out.println("Nomor Meja: " + noMeja[i]);
            System.out.println("Detail Pesanan :");
            for (int index = 0; index < namaMenu.length; index++) {
                System.out.println(namaMenu[pilihMenu] + " X " + " = ");
            }
            System.out.println("Total Harga Pesanan : " + totalHarga[i]);
            System.out.println("-----------------------------");

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int PilihanMenu;
        
        do {
        Menu();
        PilihanMenu = input.nextInt();
            switch (PilihanMenu) {
                case 1:
                    TambahkanPesanan();
                    break;
            
                case 2:
                    TampilkanDaftar();
                    break;
        
                default:
                    break;
            }
        } while (PilihanMenu != 3);
        
}
}



