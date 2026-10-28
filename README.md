# 🧮 BMI Calculator (JavaFX)

Aplikasi kalkulator Indeks Massa Tubuh (Body Mass Index) berbasis desktop yang dibangun menggunakan **JavaFX**, **Maven**, dan **Scene Builder** dengan mengimplementasikan arsitektur **MVC (Model-View-Controller)**.

---

## 🚀 Fitur Utama

- **Hitung BMI:** Menghitung nilai BMI secara akurat berdasarkan input berat badan (kg) dan tinggi badan (cm).
- **Kategori BMI:** Menampilkan status kategori secara otomatis (Kurus, Normal/Ideal, Kelebihan Berat Badan, Obesitas).
- **Pencegahan Error:** Validasi input untuk menangani kesalahan format input pengguna.
- **Reset Form:** Mengosongkan form input dan kartu hasil secara instan.

---

## 📐 Arsitektur Proyek (MVC Pattern)

- **Model (`com.example.model.BmiModel`):** Menangani logika matematis perhitungan BMI dan penentuan kategorinya.
- **View (`src/main/resources/com/example/bmi-view.fxml`):** Antarmuka pengguna (UI) yang dirancang menggunakan Scene Builder.
- **Controller (`com.example.controller.BmiController`):** Menghubungkan interaksi komponen UI dengan logika bisnis pada Model.
- **Entry Point (`com.example.MainApp`):** Menjalankan *Stage* dan *Scene* JavaFX.

---

## 🛠️ Teknologi yang Penggunaan

- **Bahasa:** Java (JDK 26)
- **GUI Framework:** JavaFX 17.0.2
- **Build Tool:** Apache Maven
- **IDE:** Apache NetBeans 31
- **UI Designer:** Gluon Scene Builder

---

## 💻 Cara Menjalankan Aplikasi

1. **Clone repositori ini:**
   ```bash
   git clone https://github.com/daris-coder/BmiCalculator-JavaFX.git
   ```
   1. Masuk ke folder proyek:
   cd BmiCalculator-JavaFX
   2. Jalankan via Maven:
   mvn clean javafx:run
   
