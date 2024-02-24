<!-- 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
-->

<?php

require('Product.php');

class Clothing extends Product {
    // Atribut yang digunakan pada kelas Clothing
    private $size = '';
    private $material = '';
    private $gender = '';

    // Konstruktor
    public function __construct($ID = '', $nama = '', $brand = '', $price = '', $size = '', $material = '', $gender = '') {
        parent::__construct($ID, $nama, $brand, $price); // Memanggil konstruktor dari kelas parent (Product)
        $this->size = $size;
        $this->material = $material;
        $this->gender = $gender;
    }

    // Metode getter dan setter untuk size
    public function getSize() {
        return $this->size;
    }

    public function setSize($size) {
        $this->size = $size;
    }

    // Metode getter dan setter untuk material
    public function getMaterial() {
        return $this->material;
    }

    public function setMaterial($material) {
        $this->material = $material;
    }

    // Metode getter dan setter untuk gender
    public function getGender() {
        return $this->gender;
    }

    public function setGender($gender) {
        $this->gender = $gender;
    }
}

?>
