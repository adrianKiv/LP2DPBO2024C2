/* 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
*/

import java.util.ArrayList;
import java.util.Scanner;

// Deklarasi kelas Shirt dengan atribut privat dan metode publik
class Shirt extends Clothing {
    // Atribut privat untuk menyimpan informasi tentang Shirt
    private String color;
    private String S_type;

    // Konstruktor tanpa parameter, digunakan untuk membuat objek Shirt dengan nilai default
    public Shirt() {
        this.color = "";
        this.S_type = "";
    }

    // Konstruktor dengan parameter, digunakan untuk membuat objek Shirt dengan nilai yang diberikan
    public Shirt(String color, String S_type) {
        this.color = color;
        this.S_type = S_type;
    }

    // Metode getter dan setter untuk color
    public String getcolor() {
        return this.color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    // Metode getter dan setter untuk S_type
    public String getS_type() {
        return this.S_type;
    }

    public void setS_type(String S_type) {
        this.S_type = S_type;
    }
}