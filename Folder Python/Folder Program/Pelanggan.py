class Pelanggan:
    # Constructor untuk mengisi data pelanggan
    def __init__(self, id, nama, telepon, alamat):
        self.id_pelanggan = id
        self.nama = nama
        self.no_telepon = telepon
        self.alamat = alamat

    # Getter untuk mengambil ID pelanggan
    def getIdPelanggan(self):
        return self.id_pelanggan

    # Getter untuk mengambil nama pelanggan
    def getNama(self):
        return self.nama

    # Getter untuk mengambil nomor telepon
    def getNoTelepon(self):
        return self.no_telepon

    # Getter untuk mengambil alamat pelanggan
    def getAlamat(self):
        return self.alamat

    # Method untuk menampilkan data pelanggan
    def tampilkanData(self):
        print("ID Pelanggan : " + self.id_pelanggan)
        print("Nama         : " + self.nama)
        print("No. Telepon  : " + self.no_telepon)
        print("Alamat       : " + self.alamat)