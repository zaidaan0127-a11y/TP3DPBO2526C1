from Pelanggan import Pelanggan
from Kendaraan import Kendaraan

# Rental memiliki objek Pelanggan dan Kendaraan
class Rental:
    # Constructor untuk mengisi data rental
    def __init__(self, id, id_pelanggan, nama, telepon, alamat,
                 id_kendaraan, merk, tahun, harga, lama):

        self.id_rental = id

        # Membuat objek Pelanggan di dalam Rental
        self.pelanggan = Pelanggan(
            id_pelanggan, nama, telepon, alamat
        )

        # Membuat objek Kendaraan di dalam Rental
        self.kendaraan = Kendaraan(
            id_kendaraan, merk, tahun, harga
        )

        self.lama_sewa = lama

    # Getter untuk mengambil ID rental
    def getIdRental(self):
        return self.id_rental

    # Getter untuk mengambil lama sewa
    def getLamaSewa(self):
        return self.lama_sewa

    # Menghitung total harga berdasarkan harga sewa per hari
    def hitungTotal(self):
        return self.kendaraan.getHargaSewa() * self.lama_sewa

    # Method untuk menampilkan data rental
    def tampilkanData(self):
        print("ID Rental    : " + self.id_rental)
        print("Pelanggan    : " + self.pelanggan.getNama())
        print("Kendaraan    : " + self.kendaraan.getMerk())
        print("Lama Sewa    : " + str(self.lama_sewa) + " hari")
        print("Harga/Hari   : Rp" + str(self.kendaraan.getHargaSewa()))
        print("Total Harga  : Rp" + str(self.hitungTotal()))