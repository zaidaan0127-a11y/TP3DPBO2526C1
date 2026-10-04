import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    // Menampilkan semua data
    public static void lihatData(
        ArrayList<Kendaraan> kendaraan,
        ArrayList<Pelanggan> pelanggan,
        ArrayList<Rental> rental
    ) {
        System.out.println("\n===== DATA KENDARAAN =====");

        for (Kendaraan k : kendaraan) {
            k.tampilkanData();
            System.out.println("-------------------------");
        }

        System.out.println("\n===== DATA PELANGGAN =====");

        for (Pelanggan p : pelanggan) {
            p.tampilkanData();
            System.out.println("-------------------------");
        }

        System.out.println("\n===== DATA RENTAL =====");

        for (Rental r : rental) {
            r.tampilkanData();
            System.out.println("-------------------------");
        }
    }

    // Menambah mobil
    public static void tambahMobil(ArrayList<Kendaraan> kendaraan) {
        System.out.println("\n--- Tambah Mobil ---");

        System.out.print("ID       : ");
        String id = input.nextLine();

        System.out.print("Merk     : ");
        String merk = input.nextLine();

        System.out.print("Tahun    : ");
        int tahun = input.nextInt();

        System.out.print("Harga    : ");
        int harga = input.nextInt();

        System.out.print("Kursi    : ");
        int kursi = input.nextInt();

        input.nextLine();

        kendaraan.add(
            new Mobil(id, merk, tahun, harga, kursi)
        );
    }

    // Menambah motor
    public static void tambahMotor(ArrayList<Kendaraan> kendaraan) {
        System.out.println("\n--- Tambah Motor ---");

        System.out.print("ID       : ");
        String id = input.nextLine();

        System.out.print("Merk     : ");
        String merk = input.nextLine();

        System.out.print("Tahun    : ");
        int tahun = input.nextInt();

        System.out.print("Harga    : ");
        int harga = input.nextInt();

        System.out.print("Mesin    : ");
        int mesin = input.nextInt();

        input.nextLine();

        kendaraan.add(
            new Motor(id, merk, tahun, harga, mesin)
        );
    }

    // Menambah pelanggan
    public static void tambahPelanggan(
        ArrayList<Pelanggan> pelanggan
    ) {
        System.out.println("\n--- Tambah Pelanggan ---");

        System.out.print("ID       : ");
        String id = input.nextLine();

        System.out.print("Nama     : ");
        String nama = input.nextLine();

        System.out.print("Telepon  : ");
        String telepon = input.nextLine();

        System.out.print("Alamat   : ");
        String alamat = input.nextLine();

        pelanggan.add(
            new Pelanggan(id, nama, telepon, alamat)
        );
    }

    // Menambah rental
    public static void tambahRental(
        ArrayList<Pelanggan> pelanggan,
        ArrayList<Kendaraan> kendaraan,
        ArrayList<Rental> rental
    ) {
        if (pelanggan.isEmpty() || kendaraan.isEmpty()) {
            System.out.println(
                "\nPelanggan dan kendaraan harus tersedia!"
            );
            return;
        }

        System.out.println("\n--- Tambah Rental ---");

        System.out.print("ID Rental : ");
        String id = input.nextLine();

        System.out.println("\nPelanggan:");

        for (int i = 0; i < pelanggan.size(); i++) {
            System.out.println(
                (i + 1) + ". " + pelanggan.get(i).getNama()
            );
        }

        System.out.print("Pilih : ");
        int p = input.nextInt();

        System.out.println("\nKendaraan:");

        for (int i = 0; i < kendaraan.size(); i++) {
            System.out.println(
                (i + 1) + ". " + kendaraan.get(i).getMerk()
            );
        }

        System.out.print("Pilih : ");
        int k = input.nextInt();

        System.out.print("Lama Sewa : ");
        int lama = input.nextInt();

        input.nextLine();

        // Memastikan pilihan pelanggan dan kendaraan valid
        if (p >= 1 && p <= pelanggan.size()
            && k >= 1 && k <= kendaraan.size()) {

            Pelanggan pData = pelanggan.get(p - 1);
            Kendaraan kData = kendaraan.get(k - 1);

            rental.add(
                new Rental(
                    id,
                    pData.getIdPelanggan(),
                    pData.getNama(),
                    pData.getNoTelepon(),
                    pData.getAlamat(),
                    kData.getIdKendaraan(),
                    kData.getMerk(),
                    kData.getTahun(),
                    kData.getHargaSewa(),
                    lama
                )
            );

            System.out.println(
                "Rental berhasil ditambahkan!"
            );

        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    // Menu tambah data
    public static void menuTambah(
        ArrayList<Kendaraan> kendaraan,
        ArrayList<Pelanggan> pelanggan,
        ArrayList<Rental> rental
    ) {
        System.out.println("\n===== TAMBAH DATA =====");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Pelanggan");
        System.out.println("4. Rental");
        System.out.println("5. Kembali");

        System.out.print("Pilihan : ");
        int pilihan = input.nextInt();

        input.nextLine();

        switch (pilihan) {
            case 1:
                tambahMobil(kendaraan);
                break;

            case 2:
                tambahMotor(kendaraan);
                break;

            case 3:
                tambahPelanggan(pelanggan);
                break;

            case 4:
                tambahRental(
                    pelanggan,
                    kendaraan,
                    rental
                );
                break;
        }
    }

    public static void main(String[] args) {

        ArrayList<Kendaraan> kendaraan =
            new ArrayList<>();

        ArrayList<Pelanggan> pelanggan =
            new ArrayList<>();

        ArrayList<Rental> rental =
            new ArrayList<>();

        // Data awal kendaraan
        kendaraan.add(
            new Mobil(
                "M001",
                "Toyota Avanza",
                2023,
                350000,
                7
            )
        );

        kendaraan.add(
            new Motor(
                "T001",
                "Honda Vario",
                2024,
                120000,
                125
            )
        );

        // Data awal pelanggan
        pelanggan.add(
            new Pelanggan(
                "P001",
                "Zaidaan",
                "081234567890",
                "Bandung"
            )
        );

        pelanggan.add(
            new Pelanggan(
                "P002",
                "Rizky",
                "082345678901",
                "Cimahi"
            )
        );

        // Data awal rental
        rental.add(
            new Rental(
                "R001",
                "P001",
                "Zaidaan",
                "081234567890",
                "Bandung",
                "M001",
                "Toyota Avanza",
                2023,
                350000,
                3
            )
        );

        int pilihan = 0;

        // Menu utama program
        do {
            System.out.println(
                "\n===== RENTAL KENDARAAN ====="
            );
            System.out.println("1. Lihat Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Keluar");

            System.out.print("Pilihan : ");
            pilihan = input.nextInt();

            input.nextLine();

            switch (pilihan) {
                case 1:
                    lihatData(
                        kendaraan,
                        pelanggan,
                        rental
                    );
                    break;

                case 2:
                    menuTambah(
                        kendaraan,
                        pelanggan,
                        rental
                    );
                    break;

                case 3:
                    System.out.println(
                        "Program selesai."
                    );
                    break;

                default:
                    System.out.println(
                        "Pilihan tidak valid."
                    );
            }

        } while (pilihan != 3);

        input.close();
    }
}