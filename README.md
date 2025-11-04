# LatihanSoalUkl
Nama: Shabrina
Kelas: X RPL 8
Absen 33

## Soal 1 - Mudah

### Input Data
Program meminta pengguna memasukkan: 
- Jarak pengiriman (dalam kilometer)
- Berat paket (dalam kilogram)
- Ukuran paket: panjang, lebar, dan tinggi (dalam cm)

### Menghitung Volume Paket
Volume dihitung dengan rumus:
volume = panjang * lebar * tinggi

### Menentukan Biaya per Kg
- Jika jarak ≤ 10 km, biaya per kg = Rp 4.250
- Jika jarak > 10 km, biaya per kg = Rp 6.000

### Menghitung Total Biaya Utama
totalBiaya = berat * biayaPerKg

### Menambahkan Biaya Tambahan (Jika Ada)
Jika volume paket lebih dari 100 cm³, maka ditambah biaya tambahan Rp 50.000

### Menampilkan Rincian Biaya
Program menampilkan volume paket, biaya utama, biaya tambahan (jika ada), dan total biaya pengiriman.

## Soal 2 - Mudah

### Input Data
Program meminta pengguna untuk memasukkan sebuah bilangan bulat (int number).

### Pemeriksaan Genap atau Ganjil
Program menggunakan operator modulus (%) untuk memeriksa sisa hasil bagi bilangan tersebut dengan 2:

- Jika number % 2 == 0, artinya bilangan habis dibagi 2, maka bilangan tersebut genap.
- Jika tidak, maka bilangan tersebut ganjil.

### Output
Program menampilkan hasil berupa teks:

- “[bilangan] adalah bilangan genap”
- atau “[bilangan] adalah bilangan ganjil”

## Soal 1 - Sedang

### Input Data
Program meminta pengguna memasukkan sebuah bilangan bulat (int number).

### Pemeriksaan Bilangan Negatif
Jika number < 0, program menampilkan pesan:
👉 "Input bilangan bulat bukan positif."
(karena faktorial hanya didefinisikan untuk bilangan 0 dan bilangan positif).

### Perhitungan Faktorial
Jika bilangan valid (≥ 0), program menggunakan perulangan for untuk menghitung faktorial:

```java
for (int i = 1; i <= angkaFaktorial; i++) {
    hasil *= i;
        }
```
Artinya:
Faktorial dari n = 1 × 2 × 3 × ... × n

### Output
Program menampilkan hasil faktorial, misalnya:
Jika input 5 → output: “Faktorial dari 5 adalah: 120”

## Soal 2 - Sedang

### Method hitungVolume()
Method ini menerima dua parameter: 
- jariJari dan tinggi, lalu menghitung volume tabung dengan rumus:

Volume = 𝜋 × 𝑟 2 × 𝑡

Hasil perhitungan kemudian dikembalikan (return) ke pemanggil method.

### Input Data di main()
Program meminta pengguna untuk memasukkan:

- Jari-jari tabung (r)
- Tinggi tabung (t)

### Pemanggilan Method
Nilai input dikirim ke method hitungVolume(r, t) untuk dihitung volumenya.

### Output
Program menampilkan hasil volume tabung dalam satuan cm³, misalnya:
Volume tabung adalah: 314.1592653589793 cm³

## Soal 1 - Sulit

### Input Jumlah Siswa
Pengguna diminta memasukkan jumlah siswa (JumlahSis).

### Inisialisasi Variabel
- awal digunakan sebagai penghitung siswa, dimulai dari 1.
- temp digunakan untuk menjumlahkan semua nilai siswa.

### Perulangan while
Selama awal <= JumlahSis, program akan:

- Meminta input nilai setiap siswa.
- Menambahkan nilai tersebut ke variabel temp.
- Menambah nilai awal satu per satu sampai semua siswa dihitung.

```java
while (awal <= JumlahSis) {
    System.out.println("Nilai Siswa " + awal);
        nilai = input.nextInt();
        temp += nilai;
        awal++;
    }
```
### Menghitung dan Menampilkan Rata-Rata
Setelah semua nilai dimasukkan, rata-rata dihitung dengan:

```java
 double rata = temp/JumlahSis;
```

## Soal 2 - Sulit

### Input Ukuran Matriks
Pengguna diminta memasukkan:
- Jumlah baris
- Jumlah kolom

Nilai ini digunakan untuk menentukan ukuran dari ketiga matriks (`matriks1`, `matriks2`, dan `hasil`).

### Deklarasi Matriks
Program membuat tiga buah array dua dimensi:
```java
int[][] matriks1 = new int[baris][kolom];
int[][] matriks2 = new int[baris][kolom];
int[][] hasil = new int[baris][kolom];
```

### Input Elemen Matriks Pertama dan Kedua
Menggunakan dua nested loop (`for` bersarang), program meminta pengguna memasukkan elemen satu per satu:

- Elemen untuk matriks1
- Elemen untuk matriks2

### Proses Penjumlahan Matriks
Elemen-elemen dari kedua matriks dijumlahkan sesuai posisinya:
```java
hasil[i][a] = matriks1[i][a] + matriks2[i][a];
```

### Output Hasil Penjumlahan
Program menampilkan hasil dalam bentuk matriks (baris dan kolom sesuai input):

```java
Hasil Matriks A + B 
    2    2
    2    2
```








