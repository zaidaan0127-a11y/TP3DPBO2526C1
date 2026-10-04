from Kendaraan import Kendaraan

# Motor merupakan turunan dari class Kendaraan
class Motor(Kendaraan):
    # Constructor untuk mengisi data motor
    def __init__(self, id, merk, tahun, harga, mesin):
        super().__init__(id, merk, tahun, harga)
        self.kapasitas_mesin = mesin

    # Getter untuk mengambil kapasitas mesin
    def getKapasitasMesin(self):
        return self.kapasitas_mesin

    # Override method untuk menampilkan data motor
    def tampilkanData(self):
        print("ID Kendaraan    : " + self.id_kendaraan)
        print("Jenis           : Motor")
        print("Merk            : " + self.merk)
        print("Tahun           : " + str(self.tahun))
        print("Harga Sewa      : Rp" + str(self.harga_sewa))
        print("Kapasitas Mesin : " + str(self.kapasitas_mesin) + " cc")