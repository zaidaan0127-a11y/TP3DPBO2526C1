public class Rental {
    private String id_rental;
    private Pelanggan pelanggan;
    private Kendaraan kendaraan;
    private int lama_sewa;

    // Constructor untuk mengisi data rental
    public Rental(
        String id,
        String id_pelanggan,
        String nama,
        String telepon,
        String alamat,
        String id_kendaraan,
        String merk,
        int tahun,
        int harga,
        int lama
    ) {
        this.id_rental = id;

        // Membuat objek Pelanggan di dalam Rental
        this.pelanggan = new Pelanggan(
            id_pelanggan,
            nama,
            telepon,
            alamat
        );

        // Membuat objek Kendaraan di dalam Rental
        this.kendaraan = new Kendaraan(
            id_kendaraan,
            merk,
            tahun,
            harga
        );

        this.lama_sewa = lama;
    }

    // Getter untuk mengambil ID rental
    public String getIdRental() {
        return this.id_rental;
    }

    // Getter untuk mengambil lama sewa
    public int getLamaSewa() {
        return this.lama_sewa;
    }

    // Menghitung total harga rental
    public int hitungTotal() {
        return this.kendaraan.getHargaSewa() * this.lama_sewa;
    }

    // Method untuk menampilkan data rental
    public void tampilkanData() {
        System.out.println("ID Rental    : " + this.id_rental);
        System.out.println("Pelanggan    : " + this.pelanggan.getNama());
        System.out.println("Kendaraan    : " + this.kendaraan.getMerk());
        System.out.println("Lama Sewa    : " + this.lama_sewa + " hari");
        System.out.println("Harga/Hari   : Rp" + this.kendaraan.getHargaSewa());
        System.out.println("Total Harga  : Rp" + this.hitungTotal());
    }
}