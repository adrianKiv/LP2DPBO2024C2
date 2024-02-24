
    # Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    # untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 

from Shirt import Shirt
from Printer import Printer

shirts = []  # List
printing = Printer()

# meminta banyak masukan
n = int(input("Masukkan jumlah data: "))

# loop sebanyak n
for i in range(n):
    print("+===================+")
    print(f"|Masukan Data ke :{i+1} |")
    print("+===================+")

    #meminta masukan user
    ID = str(input("Masukan ID          :"))
    nama = str(input("Masukan Nama        :"))
    Brand = str(input("Masukan Brand       :"))
    price = str(input("Masukan Price       :"))
    size = str(input("Masukan Size        :"))
    material = str(input("Masukan Material    :"))
    gender = str(input("Masukan Gender      :"))
    color = str(input("Masukan Color       :"))
    S_type = str(input("Masukan Sleeve type :"))

    # Mengatur nilai atribut inputan data baju ke dalam objek Shirt
    shirt = Shirt(ID, nama, Brand, price, size, material, gender, color, S_type)
    # Menambahkan nilai objek ke dalam list
    shirts.append(shirt)
    
    print("+===================+\n")
    print("Data berhasil ditambahkan...\n\n")

# Cetak tabel Shirt
printing.find_max_lengths(shirts) # mengecek length terpanjang di list
printing.print_table(shirts) # menampilkan isi list dalam bentuk table