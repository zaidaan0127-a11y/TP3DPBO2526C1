#ifndef KENDARAAN_CPP
#define KENDARAAN_CPP

#include <iostream>
#include <string>
using namespace std;

class Kendaraan
{
protected:
    string id_kendaraan;
    string merk;
    int tahun;
    int harga_sewa;

public:
    // constructor
    Kendaraan(string id, string m, int t, int harga)
    {
        this->id_kendaraan = id;
        this->merk = m;
        this->tahun = t;
        this->harga_sewa = harga;
    }

    // getter
    string getIdKendaraan()
    {
        return this->id_kendaraan;
    }

    string getMerk()
    {
        return this->merk;
    }

    int getTahun()
    {
        return this->tahun;
    }

    int getHargaSewa()
    {
        return this->harga_sewa;
    }

    // prosedur untuk menampilkan data
    virtual void tampilkanData()
    {
        cout << "ID Kendaraan : " << this->id_kendaraan << endl;
        cout << "Merk         : " << this->merk << endl;
        cout << "Tahun        : " << this->tahun << endl;
        cout << "Harga Sewa   : Rp" << this->harga_sewa << endl;
    }
};

#endif