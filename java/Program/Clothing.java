/* 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
*/

import java.util.ArrayList;
import java.util.Scanner;

// Deklarasi kelas Clothing dengan atribut privat dan metode publik
class Clothing extends Product {
    // Atribut privat untuk menyimpan informasi tentang Clothing
    private String size;
    private String material;
    private String gender;

    // Konstruktor tanpa parameter, digunakan untuk membuat objek Clothing dengan nilai default
    public Clothing() {
        this.size = "";
        this.material = "";
        this.gender = "";
    }

    // Konstruktor dengan parameter, digunakan untuk membuat objek Clothing dengan nilai yang diberikan
    public Clothing(String size, String material, String gender) {
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    // Metode getter dan setter untuk size
    public String getsize() {
        return this.size;
    }

    public void setsize(String size) {
        this.size = size;
    }

    // Metode getter dan setter untuk material
    public String getmaterial() {
        return this.material;
    }

    public void setmaterial(String material) {
        this.material = material;
    }

    // Metode getter dan setter untuk gender
    public String getgender() {
        return this.gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }
}