# LP2DPBO2024
## Janji
Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 

## Deskripsi Program
program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang mengimplementasikan konsep Multi-level Inheritance  pada kelas Product <- Clothing <- Shirt

## Penjelasan Desain Program
Program didesain menjadi empat class
* **Product**
* **Clothing**
* **Shirt**
* **Print**

Class `Product` adalah class induk yang memiliki turunan yaitu class `Clothing` Class `Clothing` memiliki turunan yaitu class `Shirt` Maka dengan relasi seperti itu class `Shirt` menjadi cucu dari class `Product` atau class `Product` adalah buyut dari class `Shirt`. Sedangkan untuk class print dia hanya individu sendiri yang berfungsi untuk memberikan tampilan data dalam bentuk table.

## Desain Relasi
![Desain Kelas](https://github.com/adrianKiv/LP2DPBO2024C2/assets/134991383/806b3370-19cf-4da1-8e13-ad0d9f572f82)

class **Product**
memiliki atribut :
- `ID_Product`
- `Nama`
- `Brand`
- `Price`
  
class **Clothing**
memiliki atribut :
- `Size`
- `Material`
- `Gender`
  
class **Shirt**
memiliki atribut :
- `Color`
- `S_Type`
  
class **Print**
memiliki atribut :
- `Cari_String_Terpanjang`
- `Print_Table`

## Alur Program
1. User diminta memasukan jumlah data yang ingin dimasukan.
2. User diminta mengisi data terkait setiap pakaian.
3. Setelah user memberikan data program akan menampilkan data dalam bentuk table

## Dokumentasi Program
- Meminta masukan user

![Cuplikan layar 2024-02-24 200707](https://github.com/adrianKiv/LP2DPBO2024C2/assets/134991383/446606bd-2020-4659-afa3-ca31de68b9bf)

- Menampilkan hasil masukan user
![Cuplikan layar 2024-02-24 200740](https://github.com/adrianKiv/LP2DPBO2024C2/assets/134991383/65c3bd40-4e14-459e-9744-93a03ed292a9)



