/* 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
*/

#include <iostream>
#include <string>
#include <bits/stdc++.h>

using namespace std;

// Deklarasi kelas Product dengan atribut privat dan metode publik
class Product {
    // Atribut privat untuk menyimpan informasi tentang Product
    private:
        string ID;
        string nama;
        string brand;
        string price;

    public:
        // Konstruktor tanpa parameter, digunakan untuk membuat objek Product dengan nilai default
        Product() {
            this->ID = "";
            this->nama = "";
            this->brand = "";
            this->price = "";
        }

        // Konstruktor dengan parameter, digunakan untuk membuat objek Product dengan nilai yang diberikan
        Product(string ID, string nama, string brand, string price) {
            this->ID = ID;
            this->nama = nama;
            this->brand = brand;
            this->price = price;
        }

        // Metode getter dan setter untuk ID
        string getID() {
            return this->ID;
        }

        void setID(string ID) {
            this->ID = ID;
        }

        // Metode getter dan setter untuk nama
        string getnama() {
            return this->nama;
        }

        void setnama(string nama) {
            this->nama = nama;
        }

        // Metode getter dan setter untuk brand
        string getbrand() {
            return this->brand;
        }

        void setbrand(string brand) {
            this->brand = brand;
        }

        // Metode getter dan setter untuk price
        string getprice() {
            return this->price;
        }

        void setprice(string price) {
            this->price = price;
        }

        // destructor
        ~Product(){
            
        }
};