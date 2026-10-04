from Kendaraan import Kendaraan

# Mobil merupakan turunan dari class Kendaraan
class Mobil(Kendaraan):
    # Constructor untuk mengisi data mobil
    def __init__(self, id, merk, tahun, harga, kursi):
        super().__init__(id, merk, tahun, harga)
        self.jumlah_kursi = kursi

    # Getter untuk mengambil jumlah kursi
    def getJumlahKursi(self):
        return self.jumlah_kursi

    # Override method untuk menampilkan data mobil
    def tampilkanData(self):
        print("ID Kendaraan : " + self.id_kendaraan)
        print("Jenis        : Mobil")
        print("Merk         : " + self.merk)
        print("Tahun        : " + str(self.tahun))
        print("Harga Sewa   : Rp" + str(self.harga_sewa))
        print("Jumlah Kursi : " + str(self.jumlah_kursi))