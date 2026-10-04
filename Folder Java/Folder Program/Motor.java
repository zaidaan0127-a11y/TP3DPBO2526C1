public class Motor extends Kendaraan {
    private int kapasitas_mesin;

    // Constructor untuk mengisi data motor
    public Motor(String id, String m, int t, int harga, int mesin) {
        super(id, m, t, harga);
        this.kapasitas_mesin = mesin;
    }

    // Getter untuk mengambil kapasitas mesin
    public int getKapasitasMesin() {
        return this.kapasitas_mesin;
    }

    // Override method untuk menampilkan data motor
    @Override
    public void tampilkanData() {
        System.out.println("ID Kendaraan    : " + this.id_kendaraan);
        System.out.println("Jenis           : Motor");
        System.out.println("Merk            : " + this.merk);
        System.out.println("Tahun           : " + this.tahun);
        System.out.println("Harga Sewa      : Rp" + this.harga_sewa);
        System.out.println("Kapasitas Mesin : " + this.kapasitas_mesin + " cc");
    }
}