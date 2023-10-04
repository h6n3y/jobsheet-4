Algoritma: Harga_Bayar_04

Tipe Variabel:

merek_buku = String
harga, jumlah, jumlah_halaman_buku = int
diskon, total, bayar, jumlah_diskon = double

Deskripsi:

1. print "Masukkan Merek Buku: ".
2. read merek_buku.
3. print "Jumlah Halaman Buku: ".
4. read jumlah_halaman_buku.
5. print "Masukkan Harga Buku: ".
6. read harga.
7. print "Masukkan Jumlah Barang: "
8. read jumlah.
9. print "Masukkan Diskon (Contoh: 0.1 AKA 10%): "
10. read diskon.

11. total = harga * jumlah.
12. jumlah_diskon = total * diskon.
13. bayar = total - jumlah_diskon.

14. print "==== RECEIPT ====".
15. print "Merek Buku: ".
16. read merek_buku.
17. print "Jumlah Halaman Buku :  Halaman".
18. read jumlah_halaman_buku.
19. print "Diskon yang Anda dapatkan: ".
20. read jumlah_diskon.
21. print "Total Harga: Rp.".
22. read bayar.
