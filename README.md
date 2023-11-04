# Assignment_1_Aditya_Saputra_G1A023024
# Soal dan Pembahasan
1. Buatlah perulangan hingga 100 menggunakan Java dengan output sebagai berikut:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    (Your Name)
    (Your Name)
    (Your Name)
2. Buatlah program bebas, dengan menerapkan if else dalam perulangan while
3. Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan
4. Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for
# Tugas 1
Program ini adalah contoh sederhana dari penggunaan perulangan dalam bahasa pemrograman Java. Tujuannya adalah untuk mencetak perulangan dari 1 hingga 100 dengan output: 1 2 3 4 5 6 7 8 9 (your name) (your name) (your name)......dan seterusnya
## Penjelasan Code
```sh
for (int i = 1; i <= 100; i++) {
```
Program menggunakan perulangan for untuk menginisialisasi variabel i dengan nilai 1. Perulangan akan terus berjalan selama i kurang dari atau sama dengan 100.
```sh
if (i <= 9) {
    System.out.println(i);
```
Di dalam perulangan, ada pernyataan if dengan nilai i kurang dari atau sama dengan 9. program akan mencetak nilai i dengan output 1 2 3 4 5 6 7 8 9
```sh
} else{
    System.out.println("(Aditya Saputra)");
```
Jika i lebih besar dari 9, program akan mencetak nama "(Aditya Saputra)" sebagai gantinya.
## Output
![Screenshot (277) 2](https://github.com/AdityaSaputraG1A023024/Assignment_1_Aditya_Saputra_G1A023024/assets/147525304/f23e0c72-b691-4e40-b0b8-cf4a3e1d38f0)

# Tugas 2
Program ini adalah contoh kalkulator sederhana yang ditulis dalam bahasa pemrograman Java. Kalkulator ini memungkinkan pengguna untuk melakukan operasi perhitungan sederhana seperti penambahan, pengurangan, perkalian, dan pembagian. program ini menerapkan if else dalam perulangan while untuk melakukan operasi
## Penjelasan Kode
```sh
Scanner sc = new Scanner(System.in);
```
kode ini berguna untuk membaca input atau masukkan dari pengguna
```sh
        while (true) {
            System.out.println("Selamat Datang di Kalkulator ");
            System.out.println("Pilih operasi:");
            System.out.println("1. Penambahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.println("5. Keluar");
```
* while (true): Ini adalah loop while yang menggunakan kondisi true. Ini berarti loop akan terus berjalan selama kondisinya adalah true. sehingga loop akan berjalan tanpa batas waktu sampai kondisi ini berubah menjadi false. Dalam hal ini, itu berarti loop akan berjalan terus menerus sampai ada perintah yang menghentikan loop, yaitu saat pengguna memilih untuk keluar.
* System.out.println("Selamat Datang di Kalkulator ");: Ini adalah perintah yang mencetak pesan selamat datang di kalkulator. Pesan ini akan ditampilkan setiap kali program masuk ke dalam iterasi loop.
* Menu Operasi: Program ini mencetak menu operasi kalkulator, yang mencakup penambahan, pengurangan, perkalian, pembagian, dan opsi keluar. Pengguna akan diminta untuk memilih operasi ini dengan memasukkan angka terkait.
```sh
            System.out.print("Masukkan pilihan (1/2/3/4/5): ");
            int choice = input.nextInt();
```
* System.out.print("Masukkan pilihan (1/2/3/4/5): ");: Ini adalah perintah yang mencetak pesan untuk meminta pengguna memasukkan pilihan operasi kalkulator. 
* int choice = input.nextInt();: Ini adalah perintah yang menggunakan objek input (yang merupakan objek Scanner) untuk membaca input dari pengguna dalam bentuk bilangan bulat. Input yang diterima akan disimpan dalam variabel choice sebagai angka yang akan digunakan untuk menentukan operasi yang dipilih oleh pengguna.
```sh
            if (choice == 5){
                System.out.println("Terima kasih! Program selesai.");
                break;
```
* if (choice == 5): Ini adalah pernyataan kondisional if yang digunakan untuk memeriksa apakah nilai yang dimasukkan oleh pengguna (disimpan dalam variabel choice) sama dengan 5. Dalam konteks ini, 5 adalah pilihan yang telah didefinisikan sebelumnya untuk keluar dari program.
* break;: Perintah break digunakan untuk menghentikan perulangan saat ini, yang dalam hal ini adalah perulangan while. 
* saat pengguna memilih opsi "5" (keluar), program akan mencetak pesan terima kasih dan kemudian menggunakan break untuk menghentikan perulangan while, yang mengakibatkan program berakhir dan keluar. Dengan cara ini, pengguna memiliki cara yang jelas dan bersih untuk menutup program kalkulator.
```sh
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();
```
Dengan menggunakan kode ini program akan memiliki dua angka, angka1 dan angka2, yang diambil dari masukan pengguna, dan nilai-nilai ini akan digunakan dalam operasi perhitungan sesuai dengan pilihan pengguna pada kalkulator.
```sh
            if (choice == 1) {
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
            } else if (choice == 2) {
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
            } else if (choice == 3) {
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
```
Kode ini menggunakan struktur if-else if untuk memeriksa pilihan pengguna dan menjalankan operasi kalkulator yang sesuai dengan yang dimasukkan penggguna yaitu untuk melakukan pertambahan, pengurangan, dan perkalian. Kode ini akan terus berjalan sampai pengguna memilih untuk keluar dari program.  
```sh
            } else if (choice == 4) {
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Hasil tak terdefinisi, silakan coba lagi");
```
Ini adalah bagian dari program yang menjalankan operasi pembagian dan menangani kasus khusus ketika pengguna mencoba untuk membagi dengan nol.kode ini memastikan bahwa pembagian dilakukan hanya jika pembagi (angka2) tidak sama dengan nol. Jika pembagi adalah nol, program akan memberi tahu pengguna bahwa hasil tidak terdefinisi dan mengharuskan mereka untuk mencoba kembali.
```sh
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
```
ini bagian dari program kalkulator yang menangani kasus di mana pengguna memasukkan pilihan yang tidak valid, yaitu pilihan selain 1, 2, 3, atau 4. program ini memberikan umpan balik kepada pengguna ketika mereka memasukkan pilihan yang tidak sesuai dengan menu operasi yang disediakan. 
## Output
![Screenshot (275) 2](https://github.com/AdityaSaputraG1A023024/Assignment_1_Aditya_Saputra_G1A023024/assets/147525304/4b75c7c2-7331-4796-bd58-81665ffc477f)

# Tugas 3
program zodiac adalah program yang berguna untuk menentukan zodiak pengguna. Program ini memungkinkan pengguna untuk memasukkan tanggal dan bulan kelahiran mereka contohnya Tanggal:16
Bulan:Maret, program kemudian memberikan hasil berupa zodiak yang sesuai dengan tanggal lahir tersebut.
## Penjelasan Kode
```sh
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat Datang Di Ramalan Zodiak");
        System.out.println("Tentukan Zodiakmu");
```
 * Scanner sc = new Scanner(System.in);: pemrogram ini digunakan untuk membuat objek Scanner yang akan digunakan untuk membaca masukan dari pengguna
 * System.out.println("Selamat Datang Di Ramalan Zodiak");: Ini adalah perintah yang mencetak pesan "Selamat Datang Di Ramalan Zodiak" ke layar. 
 * System.out.println("Tentukan Zodiakmu");: Ini adalah perintah yang mencetak pesan "Tentukan Zodiakmu" ke layar. 
 Kode ini adalah langkah awal dari program yang memberikan pesan selamat datang dan instruksi kepada pengguna
 ```sh
        System.out.print("Masukkan tanggal lahir (1-31): ");
        int tanggal = sc.nextInt();
        sc.nextLine();
```
Kode ini memungkinkan pengguna untuk memasukkan tanggal lahir mereka dan menyediakan masukan yang akan digunakan untuk menentukan zodiak mereka dalam program.
```sh
        System.out.print("Masukkan bulan lahir (contoh:Maret): ");
        String Bulan = sc.nextLine();
```
Dengan kode ini pengguna dapat memasukkan bulan lahir mereka dalam format yang sesuai dengan contoh yang diberikan dalam pesan. Masukan ini akan digunakan bersama dengan tanggal lahir yang telah dimasukkan sebelumnya untuk menentukan zodiak pengguna dalam program.
```sh
        if (Bulan.equalsIgnoreCase("Maret") && tanggal >= 21 || Bulan.equalsIgnoreCase("April") && tanggal <= 19) {
            System.out.println("Zodiak Anda adalah Aries.");
        } else if (Bulan.equalsIgnoreCase("April") && tanggal >= 20 || Bulan.equalsIgnoreCase("Mei") && tanggal <= 20) {
            System.out.println("Zodiak Anda adalah Taurus.");
        } else if (Bulan.equalsIgnoreCase("Mei") && tanggal >= 21 || Bulan.equalsIgnoreCase("Juni") && tanggal <= 20) {
            System.out.println("Zodiak Anda adalah Gemini.");
        } else if (Bulan.equalsIgnoreCase("Juni") && tanggal >= 21 || Bulan.equalsIgnoreCase("Juli") && tanggal <= 22) {
            System.out.println("Zodiak Anda adalah Cancer.");
        } else if (Bulan.equalsIgnoreCase("Juli") && tanggal >= 23 || Bulan.equalsIgnoreCase("Agustus") && tanggal <= 22) {
            System.out.println("Zodiak Anda adalah Leo.");
        } else if (Bulan.equalsIgnoreCase("Agustus") && tanggal >= 23 || Bulan.equalsIgnoreCase("September") && tanggal <= 22) {
```
* Kode ini berguna untuk menentukan zodiac pengguna berdasarkan tanggal dan bulan yang dimasukkan oleh pengguna.
* Setiap blok if-else if memeriksa kondisi tertentu yang menggabungkan bulan (Bulan) dan tanggal (tanggal) yang telah dimasukkan pengguna.
* Bulan.equalsIgnoreCase("Maret") && tanggal >= 21 || Bulan.equalsIgnoreCase("April") && tanggal <= 19: Ini adalah contoh dari satu blok kondisional. Ini memeriksa apakah bulan yang dimasukkan adalah "Maret" dan tanggal lebih besar atau sama dengan 21, atau apakah bulan adalah "April" dan tanggal kurang dari atau sama dengan 19. Jika salah satu kondisi ini terpenuhi, maka pesan "Zodiak Anda adalah Aries" akan dicetak.
* Totalnya ada 12 zodiac
```sh
        } else {
            System.out.println("Tanggal/Bulan yang dimasukkan tidak valid.");
```
Jika tidak ada blok yang sesuai, maka pernyataan else terakhir akan dijalankan, dan program akan mencetak pesan "Tanggal/Bulan yang dimasukkan tidak valid." Ini memberi tahu pengguna bahwa masukan yang mereka berikan tidak sesuai dengan kriteria yang telah ditentukan.
## output
![Screenshot (281) 2](https://github.com/AdityaSaputraG1A023024/Assignment_1_Aditya_Saputra_G1A023024/assets/147525304/343b3faa-475d-4109-ac4c-b980fbd98efb)

# Tugas 4
Program ini adalah contoh sederhana untuk mengakses dan mencetak elemen-elemen dalam sebuah array. Program ini menggunakan array untuk menyimpan beberapa nama dalam tipe data string. Kemudian, program mencetak setiap elemen array ke layar dengan nomor indeksnya. 
## Penjelasan Kode
```sh
        String[] nama = {"Adit","Yasser","Thariq","Aimar"};
        
        for (int i=0; i<=3; i++){
            System.out.println("variabel ke-"+ i +" adalah :" + nama[i]);
```
* String[] nama = {"Adit", "Yasser", "Thariq", "Aimar"};: Ini adalah sebuah array "nama" yang berisi empat elemen dengan tipe data string. Array ini digunakan untuk menyimpan nama-nama.
* for (int i = 0; i <= 3; i++) {: Ini adalah loop for yang akan melakukan iterasi dari 0 hingga 3. Variabel i digunakan sebagai variabel iterasi yang dimulai dari 0 dan bertambah satu pada setiap iterasi. Loop ini akan mengulang sebanyak empat kali.
* System.out.println("variabel ke-" + i + " adalah :" + nama[i]);: Di dalam loop for, program mencetak pesan yang berisi nomor indeks i dan elemen array nama pada indeks i. Pesan ini mencetak nama-nama dari array nama bersama dengan nomor indeksnya.
* Kode ini mengilustrasikan bagaimana array digunakan untuk menyimpan dan mengakses beberapa nilai dalam sebuah program. Dalam hal ini, array nama digunakan untuk menyimpan daftar nama, dan loop for digunakan untuk mengakses setiap elemen dalam array tersebut.
## Output
![Screenshot (278) 2](https://github.com/AdityaSaputraG1A023024/Assignment_1_Aditya_Saputra_G1A023024/assets/147525304/49a322ff-c034-44f0-92ba-5c6436c0583e)







