<!-- 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
-->

<!-- Bagian CSS untuk styling tabel -->
<style>
  table {
    border:  2px solid black;
    border-collapse: collapse;
    width:  30%;
    margin-bottom:  20px; /* Jarak antara tabel */
  }
  th, td {
    padding:  4px;
    border:  1px solid black;
    text-align: left;
  }
</style>

<?php

require ('Shirt.php');

$all_data = [];

//mengisi array all_data dengan data sementara
$data1 = new Shirt("D1", "Turle_neck", "Adidas", "162k", "XL", "Silk", "P", "Blue", "Panjang");
$data2 = new Shirt("D2", "Shirt", "Nike", "224k", "L", "Silk", "L", "Green", "Panjang");
$data3 = new Shirt("D3", "Trousers", "Gucci", "581k", "XS", "Katun", "L", "Yellow", "Panjang");
$data4 = new Shirt("D4", "Sweater", "Supreme", "464k", "XXL", "Katun", "P", "Pink", "Pendek");
$data5 = new Shirt("D5", "Coat", "H&M", "7008k", "M", "Cotton", "L", "Cyan", "Pendek");
$data6 = new Shirt("D6", "Shorts", "Hermes", "2237k", "L", "Cotton", "L", "Black", "Pendek");

  // Menambahkan objek ke array all_data
  array_push($all_data, $data1);
  array_push($all_data, $data2);
  array_push($all_data, $data3);
  array_push($all_data, $data4);
  array_push($all_data, $data5);
  array_push($all_data, $data6);

  // keterangan table
echo "<br>";
echo str_repeat("&nbsp", 63) . "<b>" . "Daftar Data Pakaian" . "</b>" . "<br>";

// Membuka elemen tabel dan menambahkan header
echo "<table>
    <tr>
      <th>No</th>
      <th>ID</th>
      <th>NAMA</th>
      <th>Brand</th>
      <th>Price</th>
      <th>Size</th>
      <th>Material</th>
      <th>Gender</th>
      <th>Color</th>
      <th>Slevee Type</th>
    </tr>";

// Iterasi melalui setiap objek dalam array all_data
foreach ($all_data as $key => $shirt) { // foreach untuk menampilkan semua data
    echo "<tr>
        <td>" . ($key +  1) . "</td>
        <td>" . $shirt->getID() . "</td>
        <td>" . $shirt->getNama() . "</td>
        <td>" . $shirt->getBrand() . "</td>
        <td>" . $shirt->getPrice() . "</td>
        <td>" . $shirt->getSize() . "</td>
        <td>" . $shirt->getMaterial() . "</td>
        <td>" . $shirt->getGender() . "</td>
        <td>" . $shirt->getColor() . "</td>
        <td>" . $shirt->getS_type() . "</td>
    </tr>";
}

// Menutup elemen tabel
echo "</table>";

?>