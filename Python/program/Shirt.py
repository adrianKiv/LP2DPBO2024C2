
    # Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    # untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 

# Mengimpor modul random yang digunakan untuk fungsi-fungsi acak
import random

# Mengimpor kelas Clothing dari modul Clothing
from Clothing import Clothing

# Mendefinisikan kelas Shirt yang mewarisi dari kelas Clothing
class Shirt(Clothing):
    # Metode __init__ untuk inisialisasi objek Shirt
    # Menerima parameter default untuk color, S_type, size, material, gender, ID, nama, brand, dan price
    def __init__(self,  ID = "", nama = "", brand = "", price = "", size = "", material = "", gender = "", color = "", S_type = ""):
        # Memanggil metode __init__ dari kelas induk (Clothing) untuk inisialisasi atribut size, material, gender, ID, nama, brand, dan price
        super().__init__(ID, nama, brand, price, size, material, gender)
        # Menetapkan atribut color dan S_type dengan nilai yang diberikan atau default jika tidak ada nilai yang diberikan
        self.color = color
        self.S_type = S_type

    # Metode getter untuk mendapatkan nilai dari atribut color
    def get_color(self):
        return self.color

    # Metode setter untuk mengatur nilai dari atribut color
    def set_color(self, color):
        self.color = color

    # Metode getter untuk mendapatkan nilai dari atribut S_type
    def get_S_type(self):
        return self.S_type

    # Metode setter untuk mengatur nilai dari atribut S_type
    def set_S_type(self, S_type):
        self.S_type = S_type

