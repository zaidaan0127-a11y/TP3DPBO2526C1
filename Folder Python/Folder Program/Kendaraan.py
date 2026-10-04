class Kendaraan:
    # Constructor untuk mengisi data kendaraan
    def __init__(self, id, merk, tahun, harga):
        self.id_kendaraan = id
        self.merk = merk
        self.tahun = tahun
        self.harga_sewa = harga

    # Getter untuk mengambil ID kendaraan
    def getIdKendaraan(self):
        return self.id_kendaraan

    # Getter untuk mengambil merk kendaraan
    def getMerk(self):
        return self.merk

    # Getter untuk mengambil tahun kendaraan
    def getTahun(self):
        return self.tahun

    # Getter untuk mengambil harga sewa
    def getHargaSewa(self):
        return self.harga_sewa

    # Method untuk menampilkan data kendaraan
    def tampilkanData(self):
        print("ID Kendaraan : " + self.id_kendaraan)
        print("Merk         : " + self.merk)
        print("Tahun        : " + str(self.tahun))
        print("Harga Sewa   : Rp" + str(self.harga_sewa))