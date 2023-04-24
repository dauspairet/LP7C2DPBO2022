# LP7C2DPBO2022

Saya Muhamad Firdaus [2101995] mengerjakan soal Latihan Praktikum 7 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Requirement
Modifikasi kode yang ada. Ketika pencet WASD, skor masih jadi 1 2 3 4 secara hardcode. Nahh, modifikasi skor nya sehingga ketika ganti tombol yang dipencet, skornya selalu bertambah. Misal, posisi sekarang 0. Pencet W, tambah 1. Jadi satu, berhenti. Pencet D, tambah satu. Jadi 2, berhenti. Pencet apapun lagi asal WASD, tambah satu. Jadi 3. dst.

## Dokumentasi
### Start

![start](https://github.com/dauspairet/LP7C2DPBO2023/raw/main/Screenshot_Video/start.jpg)

### Simulation

#### Movement Score

https://user-images.githubusercontent.com/100768773/234002535-60538962-dd65-412a-ad8a-d173751ad925.mov

<b>Description</b>

Skor hanya bertambah jika pemain berbelok, bukan bergerak berurutan. Detail:
  - Saat pertama kali membuka program, pemain bergerak ke arah manapun, skor +1.
  - Setelah pemain bergerak, dia harus bergerak ke arah lain agar skornya +1. Jika menekan tombol yang sama, skor tetap (+0).
  - Contoh, pemain membuka program, lalu bergerak ke kanan dan berhenti, maka skor bertambah +1. Jika pemain bergerak ke arah atas, bawah, atau kiri, maka skor bertambah   +1. Namun, jika pemain bergerak ke kanan lagi, maka skor +0.
  - Bagaimana jika urutannya, kanan - atas - kiri - kanan? Kanan yang kedua tetap +1, karena pergerakan pemain sebelumnya adalah kiri, sehingga tidak dianggap berurutan.

#### Collision Score

https://user-images.githubusercontent.com/100768773/234002777-73e11ea4-b53f-41ff-851e-f9f946e64f0f.mov

<b>Description</b>

Buatlah sistem game yang menambahkan satu kotak atau objek apapun secara acak. Jika pemain menyentuh objek tersebut, skor bertambah +5 atau +10, lalu objek akan berpindah lagi ke posisi lain secara acak.



