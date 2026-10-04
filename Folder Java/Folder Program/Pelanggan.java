public class Pelanggan {
    private String id_pelanggan;
    private String nama;
    private String no_telepon;
    private String alamat;

    // Constructor untuk mengisi data pelanggan
    public Pelanggan(String id, String n, String telepon, String a) {
        this.id_pelanggan = id;
        this.nama = n;
        this.no_telepon = telepon;
        this.alamat = a;
    }

    // Getter untuk mengambil ID pelanggan
    public String getIdPelanggan() {
        return this.id_pelanggan;
    }

    // Getter untuk mengambil nama pelanggan
    public String getNama() {
        return this.nama;
    }

    // Getter untuk mengambil nomor telepon
    public String getNoTelepon() {
        return this.no_telepon;
    }

    // Getter untuk mengambil alamat pelanggan
    public String getAlamat() {
        return this.alamat;
    }

    // Method untuk menampilkan data pelanggan
    public void tampilkanData() {
        System.out.println("ID Pelanggan : " + this.id_pelanggan);
        System.out.println("Nama         : " + this.nama);
        System.out.println("No. Telepon  : " + this.no_telepon);
        System.out.println("Alamat       : " + this.alamat);
    }
}