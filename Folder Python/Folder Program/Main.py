from Mobil import Mobil
from Motor import Motor
from Pelanggan import Pelanggan
from Rental import Rental


# Menampilkan semua data
def lihatData(kendaraan, pelanggan, rental):
    print("\n===== DATA KENDARAAN =====")
    for k in kendaraan:
        k.tampilkanData()
        print("-------------------------")

    print("\n===== DATA PELANGGAN =====")
    for p in pelanggan:
        p.tampilkanData()
        print("-------------------------")

    print("\n===== DATA RENTAL =====")
    for r in rental:
        r.tampilkanData()
        print("-------------------------")


# Menambah mobil
def tambahMobil(kendaraan):
    print("\n--- Tambah Mobil ---")

    id = input("ID       : ")
    merk = input("Merk     : ")
    tahun = int(input("Tahun    : "))
    harga = int(input("Harga    : "))
    kursi = int(input("Kursi    : "))

    kendaraan.append(
        Mobil(id, merk, tahun, harga, kursi)
    )


# Menambah motor
def tambahMotor(kendaraan):
    print("\n--- Tambah Motor ---")

    id = input("ID       : ")
    merk = input("Merk     : ")
    tahun = int(input("Tahun    : "))
    harga = int(input("Harga    : "))
    mesin = int(input("Mesin    : "))

    kendaraan.append(
        Motor(id, merk, tahun, harga, mesin)
    )


# Menambah pelanggan
def tambahPelanggan(pelanggan):
    print("\n--- Tambah Pelanggan ---")

    id = input("ID       : ")
    nama = input("Nama     : ")
    telepon = input("Telepon  : ")
    alamat = input("Alamat   : ")

    pelanggan.append(
        Pelanggan(id, nama, telepon, alamat)
    )


# Menambah rental
def tambahRental(pelanggan, kendaraan, rental):
    # Rental membutuhkan data pelanggan dan kendaraan
    if len(pelanggan) == 0 or len(kendaraan) == 0:
        print("\nPelanggan dan kendaraan harus tersedia!")
        return

    print("\n--- Tambah Rental ---")

    id = input("ID Rental : ")

    print("\nPelanggan:")
    for i in range(len(pelanggan)):
        print(str(i + 1) + ". " + pelanggan[i].getNama())

    p = int(input("Pilih : "))

    print("\nKendaraan:")
    for i in range(len(kendaraan)):
        print(str(i + 1) + ". " + kendaraan[i].getMerk())

    k = int(input("Pilih : "))

    lama = int(input("Lama Sewa : "))

    # Memastikan pilihan pelanggan dan kendaraan valid
    if 1 <= p <= len(pelanggan) and 1 <= k <= len(kendaraan):

        rental.append(
            Rental(
                id,
                pelanggan[p - 1].getIdPelanggan(),
                pelanggan[p - 1].getNama(),
                pelanggan[p - 1].getNoTelepon(),
                pelanggan[p - 1].getAlamat(),
                kendaraan[k - 1].getIdKendaraan(),
                kendaraan[k - 1].getMerk(),
                kendaraan[k - 1].getTahun(),
                kendaraan[k - 1].getHargaSewa(),
                lama
            )
        )

        print("Rental berhasil ditambahkan!")

    else:
        print("Pilihan tidak valid!")


# Menu tambah data
def menuTambah(kendaraan, pelanggan, rental):
    print("\n===== TAMBAH DATA =====")
    print("1. Mobil")
    print("2. Motor")
    print("3. Pelanggan")
    print("4. Rental")
    print("5. Kembali")

    pilihan = int(input("Pilihan : "))

    if pilihan == 1:
        tambahMobil(kendaraan)

    elif pilihan == 2:
        tambahMotor(kendaraan)

    elif pilihan == 3:
        tambahPelanggan(pelanggan)

    elif pilihan == 4:
        tambahRental(pelanggan, kendaraan, rental)


# Menyimpan data kendaraan, pelanggan, dan rental
kendaraan = []
pelanggan = []
rental = []


# Data awal kendaraan
kendaraan.append(
    Mobil("M001", "Toyota Avanza", 2023, 350000, 7)
)

kendaraan.append(
    Motor("T001", "Honda Vario", 2024, 120000, 125)
)


# Data awal pelanggan
pelanggan.append(
    Pelanggan("P001", "Zaidaan", "081234567890", "Bandung")
)

pelanggan.append(
    Pelanggan("P002", "Rizky", "082345678901", "Cimahi")
)


# Data awal rental
rental.append(
    Rental(
        "R001",
        "P001",
        "Zaidaan",
        "081234567890",
        "Bandung",
        "M001",
        "Toyota Avanza",
        2023,
        350000,
        3
    )
)


# Menu utama
pilihan = 0

while pilihan != 3:
    print("\n===== RENTAL KENDARAAN =====")
    print("1. Lihat Data")
    print("2. Tambah Data")
    print("3. Keluar")

    pilihan = int(input("Pilihan : "))

    if pilihan == 1:
        lihatData(kendaraan, pelanggan, rental)

    elif pilihan == 2:
        menuTambah(kendaraan, pelanggan, rental)

    elif pilihan == 3:
        print("Program selesai.")

    else:
        print("Pilihan tidak valid.")