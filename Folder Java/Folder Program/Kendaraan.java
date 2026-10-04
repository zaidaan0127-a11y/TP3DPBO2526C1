public class Kendaraan {
    protected String id_kendaraan;
    protected String merk;
    protected int tahun;
    protected int harga_sewa;

    // Constructor untuk mengisi data kendaraan
    public Kendaraan(String id, String m, int t, int harga) {
        this.id_kendaraan = id;
        this.merk = m;
        this.tahun = t;
        this.harga_sewa = harga;
    }

    // Getter untuk mengambil ID kendaraan
    public String getIdKendaraan() {
        return this.id_kendaraan;
    }

    // Getter untuk mengambil merk kendaraan
    public String getMerk() {
        return this.merk;
    }

    // Getter untuk mengambil tahun kendaraan
    public int getTahun() {
        return this.tahun;
    }

    // Getter untuk mengambil harga sewa
    public int getHargaSewa() {
        return this.harga_sewa;
    }

    // Method untuk menampilkan data kendaraan
    public void tampilkanData() {
        System.out.println("ID Kendaraan : " + this.id_kendaraan);
        System.out.println("Merk         : " + this.merk);
        System.out.println("Tahun        : " + this.tahun);
        System.out.println("Harga Sewa   : Rp" + this.harga_sewa);
    }
}