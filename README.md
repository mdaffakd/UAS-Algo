Penjelasan Program Java - Sistem Perpustakaan
Program ini adalah sistem perpustakaan sederhana berbasis teks yang memungkinkan pengguna untuk melihat daftar buku, meminjam buku, dan mengembalikan buku. Program menggunakan array, fungsi (method), perulangan (looping), dan pencabangan (if-else & switch-case) untuk mengelola data buku dan anggota perpustakaan.

Program ini memanfaatkan array untuk menyimpan data buku dan anggota.
Menggunakan metode (fungsi) untuk memisahkan tugas sehingga kode lebih rapi.
Memakai pencabangan (if-else, switch-case) untuk validasi input.
Looping digunakan dalam menu dan daftar buku untuk perulangan data.
Program ini simulasi sederhana dari sistem perpustakaan nyata yang memungkinkan pengguna melihat, meminjam, dan mengembalikan buku.

Pseudocode

Mulai
1. Inisialisasi daftar buku, status ketersediaan buku, daftar anggota, dan daftar buku yang dipinjam.
2. Ulangi langkah berikut sampai pengguna memilih keluar:
   a. Tampilkan menu utama:
      - 1: Lihat Buku
      - 2: Pinjam Buku
      - 3: Kembalikan Buku
      - 4: Keluar
   b. Input pilihan menu
   c. Jika pilihan = 1, tampilkan daftar buku beserta statusnya
   d. Jika pilihan = 2:
      - Input nama anggota
      - Jika anggota tidak ditemukan, tampilkan pesan kesalahan dan kembali ke menu
      - Jika anggota sudah meminjam buku, tampilkan pesan kesalahan dan kembali ke menu
      - Tampilkan daftar buku yang tersedia
      - Input pilihan buku yang ingin dipinjam
      - Jika buku tersedia, ubah status buku menjadi "Dipinjam" dan simpan buku yang dipinjam anggota
      - Jika tidak, tampilkan pesan kesalahan
   e. Jika pilihan = 3:
      - Input nama anggota
      - Jika anggota tidak ditemukan, tampilkan pesan kesalahan dan kembali ke menu
      - Jika anggota tidak memiliki buku yang dipinjam, tampilkan pesan kesalahan dan kembali ke menu
      - Ubah status buku menjadi "Tersedia", hapus data buku yang dipinjam oleh anggota
   f. Jika pilihan = 4, tampilkan pesan keluar dan akhiri program
   g. Jika pilihan tidak valid, tampilkan pesan kesalahan
   Selesai

![Flowchart_uas](https://github.com/user-attachments/assets/2fcd46b5-cc19-4203-8bfc-9a08e150f9ee)
![uas output sistem perpustakaan 1](https://github.com/user-attachments/assets/bf9ce2c3-41e0-479c-9157-84cb0f24c463)
![uas output sistem perpustakaan 2](https://github.com/user-attachments/assets/494fdc79-bea2-40dd-ab5e-7ba86c0d6930)
