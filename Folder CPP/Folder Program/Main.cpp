#include <iostream>
#include <vector>
#include "Mobil.cpp"
#include "Motor.cpp"
#include "Pelanggan.cpp"
#include "Rental.cpp"

using namespace std;

// Menampilkan semua data
void lihatData(vector<Kendaraan*>& kendaraan,
              vector<Pelanggan>& pelanggan,
              vector<Rental>& rental)
{
    cout << "\n===== DATA KENDARAAN =====\n";
    for (Kendaraan* k : kendaraan)
    {
        k->tampilkanData();
        cout << "-------------------------\n";
    }

    cout << "\n===== DATA PELANGGAN =====\n";
    for (Pelanggan& p : pelanggan)
    {
        p.tampilkanData();
        cout << "-------------------------\n";
    }

    cout << "\n===== DATA RENTAL =====\n";
    for (Rental& r : rental)
    {
        r.tampilkanData();
        cout << "-------------------------\n";
    }
}

// Menambah mobil
void tambahMobil(vector<Kendaraan*>& kendaraan)
{
    string id, merk;
    int tahun, harga, kursi;

    cout << "\n--- Tambah Mobil ---\n";
    cout << "ID       : ";
    cin >> id;
    cout << "Merk     : ";
    cin.ignore();
    getline(cin, merk);
    cout << "Tahun    : ";
    cin >> tahun;
    cout << "Harga    : ";
    cin >> harga;
    cout << "Kursi    : ";
    cin >> kursi;

    kendaraan.push_back(
        new Mobil(id, merk, tahun, harga, kursi)
    );
}

// Menambah motor
void tambahMotor(vector<Kendaraan*>& kendaraan)
{
    string id, merk;
    int tahun, harga, mesin;

    cout << "\n--- Tambah Motor ---\n";
    cout << "ID       : ";
    cin >> id;
    cout << "Merk     : ";
    cin.ignore();
    getline(cin, merk);
    cout << "Tahun    : ";
    cin >> tahun;
    cout << "Harga    : ";
    cin >> harga;
    cout << "Mesin    : ";
    cin >> mesin;

    kendaraan.push_back(
        new Motor(id, merk, tahun, harga, mesin)
    );
}

// Menambah pelanggan
void tambahPelanggan(vector<Pelanggan>& pelanggan)
{
    string id, nama, telepon, alamat;

    cout << "\n--- Tambah Pelanggan ---\n";
    cout << "ID       : ";
    cin >> id;
    cout << "Nama     : ";
    cin.ignore();
    getline(cin, nama);
    cout << "Telepon  : ";
    getline(cin, telepon);
    cout << "Alamat   : ";
    getline(cin, alamat);

    pelanggan.push_back(
        Pelanggan(id, nama, telepon, alamat)
    );
}

// Menambah rental
void tambahRental(vector<Pelanggan>& pelanggan,
                  vector<Kendaraan*>& kendaraan,
                  vector<Rental>& rental)
{
    if (pelanggan.empty() || kendaraan.empty())
    {
        cout << "\nPelanggan dan kendaraan harus tersedia!\n";
        return;
    }

    string id;
    int p, k, lama;

    cout << "\n--- Tambah Rental ---\n";
    cout << "ID Rental : ";
    cin >> id;

    cout << "\nPelanggan:\n";
    for (int i = 0; i < pelanggan.size(); i++)
        cout << i + 1 << ". " << pelanggan[i].getNama() << endl;

    cout << "Pilih : ";
    cin >> p;

    cout << "\nKendaraan:\n";
    for (int i = 0; i < kendaraan.size(); i++)
        cout << i + 1 << ". "
             << kendaraan[i]->getMerk() << endl;

    cout << "Pilih : ";
    cin >> k;

    cout << "Lama Sewa : ";
    cin >> lama;

    if (p >= 1 && p <= pelanggan.size() &&
        k >= 1 && k <= kendaraan.size())
    {
        rental.push_back(
            Rental(
                id,
                pelanggan[p - 1].getIdPelanggan(),
                pelanggan[p - 1].getNama(),
                pelanggan[p - 1].getNoTelepon(),
                pelanggan[p - 1].getAlamat(),
                kendaraan[k - 1]->getIdKendaraan(),
                kendaraan[k - 1]->getMerk(),
                kendaraan[k - 1]->getTahun(),
                kendaraan[k - 1]->getHargaSewa(),
                lama
            )
        );

        cout << "Rental berhasil ditambahkan!\n";
    }
    else
    {
        cout << "Pilihan tidak valid!\n";
    }
}

// Menu tambah data
void menuTambah(vector<Kendaraan*>& kendaraan,
                vector<Pelanggan>& pelanggan,
                vector<Rental>& rental)
{
    int pilihan;

    cout << "\n===== TAMBAH DATA =====\n";
    cout << "1. Mobil\n";
    cout << "2. Motor\n";
    cout << "3. Pelanggan\n";
    cout << "4. Rental\n";
    cout << "5. Kembali\n";
    cout << "Pilihan : ";
    cin >> pilihan;

    switch (pilihan)
    {
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
            tambahRental(pelanggan, kendaraan, rental);
            break;
    }
}

int main()
{
    vector<Kendaraan*> kendaraan;
    vector<Pelanggan> pelanggan;
    vector<Rental> rental;

    // Data awal kendaraan
    kendaraan.push_back(
        new Mobil("M001", "Toyota Avanza", 2023, 350000, 7)
    );

    kendaraan.push_back(
        new Motor("T001", "Honda Vario", 2024, 120000, 125)
    );

    // Data awal pelanggan
    pelanggan.push_back(
        Pelanggan("P001", "Zaidaan", "081234567890", "Bandung")
    );

    pelanggan.push_back(
        Pelanggan("P002", "Rizky", "082345678901", "Cimahi")
    );

    // Data awal rental
    rental.push_back(
        Rental(
            "R001",
            "P001", "Zaidaan", "081234567890", "Bandung",
            "M001", "Toyota Avanza", 2023, 350000,
            3
        )
    );

    int pilihan;

    do
    {
        cout << "\n===== RENTAL KENDARAAN =====\n";
        cout << "1. Lihat Data\n";
        cout << "2. Tambah Data\n";
        cout << "3. Keluar\n";
        cout << "Pilihan : ";
        cin >> pilihan;

        switch (pilihan)
        {
            case 1:
                lihatData(kendaraan, pelanggan, rental);
                break;

            case 2:
                menuTambah(kendaraan, pelanggan, rental);
                break;

            case 3:
                cout << "Program selesai.\n";
                break;

            default:
                cout << "Pilihan tidak valid.\n";
        }

    } while (pilihan != 3);

    // Hapus object kendaraan
    for (Kendaraan* k : kendaraan)
        delete k;

    return 0;
}