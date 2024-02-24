<!-- 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
-->

<?php

class Product {
    // Atribut yang digunakan pada kelas Product
    private $ID = '';
    private $nama = '';
    private $brand = '';
    private $price = '';

    // Konstruktor
    public function __construct($ID = '', $nama = '', $brand = '', $price = '') {
        $this->ID = $ID;
        $this->nama = $nama;
        $this->brand = $brand;
        $this->price = $price;
    }

    // Metode getter dan setter untuk ID
    public function getID() {
        return $this->ID;
    }

    public function setID($ID) {
        $this->ID = $ID;
    }

    // Metode getter dan setter untuk nama
    public function getNama() {
        return $this->nama;
    }

    public function setNama($nama) {
        $this->nama = $nama;
    }

    // Metode getter dan setter untuk brand
    public function getBrand() {
        return $this->brand;
    }

    public function setBrand($brand) {
        $this->brand = $brand;
    }

    // Metode getter dan setter untuk price
    public function getPrice() {
        return $this->price;
    }

    public function setPrice($price) {
        $this->price = $price;
    }

    // Destructor
    public function __destruct() {
        // Tidak ada kode yang diperlukan di sini untuk destructor
    }
}

?>
