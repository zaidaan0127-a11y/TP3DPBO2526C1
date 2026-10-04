#include "Kendaraan.cpp"

class Motor : public Kendaraan
{
private:
    int kapasitas_mesin;

public:
    // constructor
    Motor(string id, string m, int t, int harga, int mesin)
        : Kendaraan(id, m, t, harga)
    {
        this->kapasitas_mesin = mesin;
    }

    // getter
    int getKapasitasMesin()
    {
        return this->kapasitas_mesin;
    }

    // prosedur untuk menampilkan data
    void tampilkanData() override
    {
        cout << "ID Kendaraan    : " << this->id_kendaraan << endl;
        cout << "Jenis           : Motor" << endl;
        cout << "Merk            : " << this->merk << endl;
        cout << "Tahun           : " << this->tahun << endl;
        cout << "Harga Sewa      : Rp" << this->harga_sewa << endl;
        cout << "Kapasitas Mesin : " << this->kapasitas_mesin << " cc" << endl;
    }
};
