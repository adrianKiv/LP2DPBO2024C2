
    # Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    # untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 

# Mengimpor modul random yang digunakan untuk fungsi-fungsi acak
import random

# Mengimpor kelas Product dari modul Product
from Product import Product

# Mendefinisikan kelas Clothing yang mewarisi dari kelas Product
class Clothing(Product):
    # Metode __init__ untuk inisialisasi objek Clothing
    # Menerima parameter default untuk size, material, gender, ID, nama, brand, dan price
    def __init__(self, ID = "", nama = "", brand = "", price = "", size = "", material = "", gender = ""):
        # Memanggil metode __init__ dari kelas induk (Product) untuk inisialisasi atribut ID, nama, brand, dan price
        super().__init__(ID, nama, brand, price)
        # Menetapkan atribut size, material, dan gender dengan nilai yang diberikan atau default jika tidak ada nilai yang diberikan
        self.size = size
        self.material = material
        self.gender = gender

    # Metode getter untuk mendapatkan nilai dari atribut size
    def get_size(self):
        return self.size

    # Metode setter untuk mengatur nilai dari atribut size
    def set_size(self, size):
        self.size = size

    # Metode getter untuk mendapatkan nilai dari atribut material
    def get_material(self):
        return self.material

    # Metode setter untuk mengatur nilai dari atribut material
    def set_material(self, material):
        self.material = material

    # Metode getter untuk mendapatkan nilai dari atribut gender
    def get_gender(self):
        return self.gender

    # Metode setter untuk mengatur nilai dari atribut gender
    def set_gender(self, gender):
        self.gender = gender
