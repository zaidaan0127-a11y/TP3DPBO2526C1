# TP3DPBO2526C1

____
Janji

Saya Zaidaan Dhyaa Ulhaq Budiono dengan NIM 2500945 mengerjakan Tugas Praktikum 3 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
____
Fitur

Tambah Data: Menambah objek baru. 

Tampilkan Data: Menampilkan semua objek yang tersimpan.

_____
Desain Diagram Program

<img width="662" height="666" alt="tp3" src="https://github.com/user-attachments/assets/9c6eefb5-166a-41c1-a256-7122a9193224" />

Penjelasan

a. Panah dengan kotak Hitam merupakan relasi komposisi

b. Panah dengan kata extends menunjukkan inheritance

1. Kendaraan

  Class Kendaraan merupakan superclass yang menyimpan atribut dasar dari sebuah kendaraan, yaitu id_kendaraan, merk, tahun, dan harga_sewa. Atribut id_kendaraan digunakan untuk menyimpan identitas kendaraan, merk untuk menyimpan merek kendaraan, tahun untuk menyimpan tahun kendaraan, sedangkan harga_sewa digunakan untuk menyimpan harga sewa kendaraan per hari. Atribut tersebut menggunakan akses protected agar dapat diakses oleh class turunan seperti Mobil dan Motor. Class ini memiliki method getIdKendaraan(), getMerk(), getTahun(), dan getHargaSewa() yang berfungsi untuk mengambil nilai dari masing-masing atribut. Sementara itu, method tampilkanData() digunakan untuk menampilkan informasi kendaraan dan dibuat sebagai virtual agar dapat dioverride oleh class turunannya.

2. Mobil

  Class Mobil merupakan subclass dari Kendaraan sehingga memiliki hubungan inheritance dengan Kendaraan. Class ini mewarisi atribut dan method dari Kendaraan serta menambahkan atribut khusus mobil, yaitu jumlah_kursi. Atribut jumlah_kursi digunakan untuk menyimpan jumlah kursi yang tersedia pada sebuah mobil. Terdapat method getJumlahKursi() yang digunakan untuk mengambil nilai jumlah kursi. Sementara itu, method tampilkanData() digunakan untuk menampilkan informasi kendaraan dengan tambahan jenis kendaraan dan jumlah kursi. 

3. Motor

  Class Motor merupakan subclass dari Kendaraan sehingga memiliki hubungan inheritance dengan Kendaraan. Class ini mewarisi atribut dan method dari Kendaraan serta menambahkan atribut khusus motor, yaitu kapasitas_mesin. Atribut kapasitas_mesin digunakan untuk menyimpan kapasitas mesin motor dalam satuan cc. Terdapat method getKapasitasMesin() yang digunakan untuk mengambil nilai kapasitas mesin. Sementara itu, method tampilkanData() digunakan untuk menampilkan informasi kendaraan dengan tambahan jenis kendaraan dan kapasitas mesin. Dengan demikian, Mobil dan Motor membentuk hierarchical inheritance, yaitu satu superclass Kendaraan memiliki dua subclass berupa Mobil dan Motor.

4. Pelanggan

  Class Pelanggan merupakan class yang digunakan untuk menyimpan data pelanggan yang melakukan penyewaan kendaraan. Class ini memiliki atribut id_pelanggan, nama, no_telepon, dan alamat. Atribut id_pelanggan digunakan untuk menyimpan identitas pelanggan, nama untuk menyimpan nama pelanggan, no_telepon untuk menyimpan nomor telepon, sedangkan alamat digunakan untuk menyimpan alamat pelanggan. Seluruh atribut pada class Pelanggan menggunakan akses private sehingga tidak dapat diakses secara langsung dari luar class. Terdapat method getIdPelanggan(), getNama(), getNoTelepon(), dan getAlamat() yang digunakan untuk mengambil nilai dari masing-masing atribut. Method tampilkanData() digunakan untuk menampilkan seluruh informasi pelanggan.

5. Rental

  Class Rental merupakan class yang digunakan untuk menyimpan data transaksi penyewaan kendaraan. Class ini memiliki atribut id_rental, pelanggan, kendaraan, dan lama_sewa. Atribut id_rental digunakan untuk menyimpan identitas transaksi rental, pelanggan digunakan untuk menyimpan objek Pelanggan yang melakukan penyewaan, kendaraan digunakan untuk menyimpan objek Kendaraan yang disewa, sedangkan lama_sewa digunakan untuk menyimpan lama penyewaan dalam satuan hari. Class Rental memiliki hubungan composition dengan Pelanggan dan Kendaraan, karena kedua objek tersebut digunakan sebagai bagian dari data transaksi rental. Dengan composition tersebut, Rental menjadi objek yang mengandung data pelanggan dan kendaraan yang digunakan dalam transaksi penyewaan. Method getIdRental() dan getLamaSewa() digunakan untuk mengambil nilai ID rental dan lama sewa. Method hitungTotal() digunakan untuk menghitung total biaya penyewaan dengan mengalikan harga sewa kendaraan per hari dengan lama sewa. Kemudian method tampilkanData() digunakan untuk menampilkan informasi transaksi rental, seperti ID rental, nama pelanggan, kendaraan, lama sewa, harga per hari, dan total harga.

_______
Desain Program

  Desain program menggunakan konsep hierarchical inheritance dan composition. Hierarchical inheritance diterapkan pada class Kendaraan sebagai superclass yang memiliki dua subclass, yaitu Mobil dan Motor. Mobil dan Motor mewarisi atribut dan method umum dari Kendaraan serta memiliki atribut khusus masing-masing.
Composition diterapkan pada class Rental yang memiliki hubungan dengan Pelanggan dan Kendaraan. Pelanggan digunakan sebagai bagian dari data penyewa, sedangkan Kendaraan digunakan sebagai bagian dari data kendaraan yang disewa. Dengan demikian, Rental menjadi class yang menggabungkan data pelanggan, kendaraan, dan lama penyewaan dalam satu transaksi. Method hitungTotal() kemudian menggunakan data harga_sewa dari kendaraan dan lama_sewa untuk menentukan total biaya rental.

_______
Penjelasan Alur Program

  Program dimulai dari main() dengan membuat beberapa vector untuk menyimpan data kendaraan, pelanggan, dan rental. Program kemudian memasukkan beberapa data awal berupa objek Mobil, Motor, dan Pelanggan.

  Setelah itu, program menampilkan menu utama yang terdiri dari Lihat Data, Tambah Data, dan Keluar. Jika pengguna memilih Lihat Data, program memanggil method tampilkanData() untuk menampilkan data kendaraan, pelanggan, dan rental.

  Jika pengguna memilih Tambah Data, program menampilkan pilihan untuk menambahkan Mobil, Motor, Pelanggan, atau Rental. Data yang dimasukkan pengguna kemudian digunakan untuk membuat objek baru dan disimpan ke dalam vector. Pada saat membuat rental, objek Rental memiliki objek Pelanggan dan Kendaraan sehingga menerapkan hubungan composition.

  Objek Mobil dan Motor merupakan turunan dari class Kendaraan, sehingga keduanya menerapkan inheritance. Method tampilkanData() pada Kendaraan, Mobil, dan Motor menggunakan polymorphism sehingga data dapat ditampilkan sesuai jenis kendaraannya.

  Program terus menjalankan menu menggunakan perulangan do-while sampai pengguna memilih Keluar. Setelah program selesai, objek kendaraan yang dibuat secara dinamis dihapus dari memory menggunakan delete.


______
Dokumentasi Program CPP

Lihat data awal

<img width="410" height="329" alt="Screenshot Lihat data 1 awal" src="https://github.com/user-attachments/assets/d6536a29-5398-4019-9d1a-4b472fa0c453" />

<img width="483" height="287" alt="Screenshot lihat data 2 awal" src="https://github.com/user-attachments/assets/bc0f207d-74c1-4482-ae0e-fb1a4aeb099c" />

Tambah data

<img width="366" height="286" alt="Screenshot tambah data" src="https://github.com/user-attachments/assets/b8a52987-093b-493b-8e17-727679af1508" />

hasil:

<img width="419" height="320" alt="Screenshot tambah data hasil" src="https://github.com/user-attachments/assets/8b91aef8-1bf3-44f7-8c9f-9ee639fdfc21" />

_____
Dokumentasi Program Python

Lihat data awal

<img width="470" height="326" alt="Screenshot Lihat data 1 awal" src="https://github.com/user-attachments/assets/0629f28a-826e-46da-910b-c80b96eecf02" />

<img width="356" height="290" alt="Screenshot lihat data 2 awal" src="https://github.com/user-attachments/assets/f442fbfc-514c-4795-bb46-f1619d456b41" />

Tambah data

<img width="377" height="280" alt="Screenshot tambah data" src="https://github.com/user-attachments/assets/34d1bacc-2bdf-41f1-b1b2-50f4870ae449" />

hasil:

<img width="326" height="358" alt="Screenshot tambah data hasil" src="https://github.com/user-attachments/assets/48bc41bd-0233-490a-a2b0-bcbb93d8a1ae" />

____
Dokumentasi Program Java

Lihat data awal

<img width="458" height="326" alt="Screenshot Lihat data 1 awal" src="https://github.com/user-attachments/assets/d3e49b98-a066-41ea-9238-cff11e26fd61" />

<img width="395" height="288" alt="Screenshot lihat data 2 awal" src="https://github.com/user-attachments/assets/d48a25d0-b070-4741-b22d-d3a3da67526d" />

Tambah data

<img width="379" height="292" alt="Screenshot tambah data" src="https://github.com/user-attachments/assets/382b36e5-b1a4-4078-93ea-4c951432af24" />

hasil:

<img width="347" height="398" alt="Screenshot tambah data hasil" src="https://github.com/user-attachments/assets/8d9f22f7-f406-4e3f-a022-5f05f38e05b8" />



