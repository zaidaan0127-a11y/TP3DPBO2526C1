public class Mobil extends Kendaraan {
    private int jumlah_kursi;

    // Constructor untuk mengisi data mobil
    public Mobil(String id, String m, int t, int harga, int kursi) {
        super(id, m, t, harga);
        this.jumlah_kursi = kursi;
    }

    // Getter untuk mengambil jumlah kursi
    public int getJumlahKursi() {
        return this.jumlah_kursi;
    }

    // Override method untuk menampilkan data mobil
    @Override
    public void tampilkanData() {
        System.out.println("ID Kendaraan : " + this.id_kendaraan);
        System.out.println("Jenis        : Mobil");
        System.out.println("Merk         : " + this.merk);
        System.out.println("Tahun        : " + this.tahun);
        System.out.println("Harga Sewa   : Rp" + this.harga_sewa);
        System.out.println("Jumlah Kursi : " + this.jumlah_kursi);
    }
}