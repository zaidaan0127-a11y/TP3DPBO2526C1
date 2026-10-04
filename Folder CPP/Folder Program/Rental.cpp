#include "Pelanggan.cpp"
#include "Kendaraan.cpp"

class Rental
{
private:
    string id_rental;
    Pelanggan pelanggan;
    Kendaraan kendaraan;
    int lama_sewa;

public:
    // constructor
    Rental(string id,
           string id_pelanggan, string nama, string telepon, string alamat,
           string id_kendaraan, string merk, int tahun, int harga,
           int lama)
        : pelanggan(id_pelanggan, nama, telepon, alamat),
          kendaraan(id_kendaraan, merk, tahun, harga)
    {
        this->id_rental = id;
        this->lama_sewa = lama;
    }

    // getter
    string getIdRental()
    {
        return this->id_rental;
    }

    int getLamaSewa()
    {
        return this->lama_sewa;
    }

    // menghitung total harga
    int hitungTotal()
    {
        return this->kendaraan.getHargaSewa() * this->lama_sewa;
    }

    // menampilkan data
    void tampilkanData()
    {
        cout << "ID Rental    : " << this->id_rental << endl;
        cout << "Pelanggan    : " << this->pelanggan.getNama() << endl;
        cout << "Kendaraan    : " << this->kendaraan.getMerk() << endl;
        cout << "Lama Sewa    : " << this->lama_sewa << " hari" << endl;
        cout << "Harga/Hari   : Rp" << this->kendaraan.getHargaSewa() << endl;
        cout << "Total Harga  : Rp" << this->hitungTotal() << endl;
    }
};