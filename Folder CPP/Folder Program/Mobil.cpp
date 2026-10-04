#include "Kendaraan.cpp"

class Mobil : public Kendaraan
{
private:
    int jumlah_kursi;

public:
    // constructor
    Mobil(string id, string m, int t, int harga, int kursi)
        : Kendaraan(id, m, t, harga)
    {
        this->jumlah_kursi = kursi;
    }

    // getter
    int getJumlahKursi()
    {
        return this->jumlah_kursi;
    }

    // prosedur untuk menampilkan data
    void tampilkanData() override
    {
        cout << "ID Kendaraan : " << this->id_kendaraan << endl;
        cout << "Jenis        : Mobil" << endl;
        cout << "Merk         : " << this->merk << endl;
        cout << "Tahun        : " << this->tahun << endl;
        cout << "Harga Sewa   : Rp" << this->harga_sewa << endl;
        cout << "Jumlah Kursi : " << this->jumlah_kursi << endl;
    }
};

