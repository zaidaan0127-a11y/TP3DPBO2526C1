#ifndef PELANGGAN_CPP
#define PELANGGAN_CPP

#include <iostream>
#include <string>
using namespace std;

class Pelanggan
{
private:
    string id_pelanggan;
    string nama;
    string no_telepon;
    string alamat;

public:
    // constructor
    Pelanggan(string id, string n, string telepon, string a)
    {
        this->id_pelanggan = id;
        this->nama = n;
        this->no_telepon = telepon;
        this->alamat = a;
    }

    // getter
    string getIdPelanggan()
    {
        return this->id_pelanggan;
    }

    string getNama()
    {
        return this->nama;
    }

    string getNoTelepon()
    {
        return this->no_telepon;
    }

    string getAlamat()
    {
        return this->alamat;
    }

    // prosedur untuk menampilkan data
    void tampilkanData()
    {
        cout << "ID Pelanggan : " << this->id_pelanggan << endl;
        cout << "Nama         : " << this->nama << endl;
        cout << "No. Telepon  : " << this->no_telepon << endl;
        cout << "Alamat       : " << this->alamat << endl;
    }
};

#endif

