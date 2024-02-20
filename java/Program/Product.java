/* 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
*/

import java.util.ArrayList;
import java.util.Scanner;

// Deklarasi kelas Product dengan atribut privat dan metode publik
public class Product {
    // Atribut privat untuk menyimpan informasi tentang Product
    private String ID;
    private String nama;
    private String brand;
    private String price;

    // Konstruktor tanpa parameter, digunakan untuk membuat objek Product dengan nilai default
    public Product() {
        this.ID = "";
        this.nama = "";
        this.brand = "";
        this.price = "";
    }

    // Konstruktor dengan parameter, digunakan untuk membuat objek Product dengan nilai yang diberikan
    public Product(String ID, String nama, String brand, String price) {
        this.ID = ID;
        this.nama = nama;
        this.brand = brand;
        this.price = price;
    }

    // Metode getter dan setter untuk ID
    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    // Metode getter dan setter untuk nama
    public String getnama() {
        return this.nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    // Metode getter dan setter untuk brand
    public String getbrand() {
        return this.brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    // Metode getter dan setter untuk price
    public String getprice() {
        return this.price;
    }

    public void setprice(String price) {
        this.price = price;
    }
}