<!-- 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
-->

<?php

require('Clothing.php');

class Shirt extends Clothing {
    // Atribut yang digunakan pada kelas Shirt
    private $color = '';
    private $S_type = '';

    // Konstruktor
    public function __construct($ID = '', $nama = '', $brand = '', $price = '',  $size = '', $material = '', $gender = '', $color = '', $S_type = '') {
        parent::__construct($ID, $nama, $brand, $price, $size, $material, $gender); // Memanggil konstruktor dari kelas parent (Clothing)
        $this->color = $color;
        $this->S_type = $S_type;
    }

    // Metode getter dan setter untuk color
    public function getColor() {
        return $this->color;
    }

    public function setColor($color) {
        $this->color = $color;
    }

    // Metode getter dan setter untuk S_type
    public function getS_type() {
        return $this->S_type;
    }

    public function setS_type($S_type) {
        $this->S_type = $S_type;
    }
}

?>
