
    # Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    # untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 

# Mengimpor modul random yang digunakan untuk fungsi-fungsi acak
import random

# Mendefinisikan kelas Product
class Product:
    # Metode __init__ untuk inisialisasi objek Product
    # Menerima parameter default untuk ID, nama, brand, dan price
    def __init__(self, ID = "", nama = "", brand = "", price = ""):
        # Menetapkan atribut ID, nama, brand, dan price dengan nilai yang diberikan atau default jika tidak ada nilai yang diberikan
        self.ID = ID
        self.nama = nama
        self.brand = brand
        self.price = price

    # Metode getter untuk mendapatkan nilai dari atribut ID
    def get_ID(self):
        return self.ID

    # Metode setter untuk mengatur nilai dari atribut ID
    def set_ID(self, ID):
        self.ID = ID

    # Metode getter untuk mendapatkan nilai dari atribut nama
    def get_nama(self):
        return self.nama

    # Metode setter untuk mengatur nilai dari atribut nama
    def set_nama(self, nama):
        self.nama = nama

    # Metode getter untuk mendapatkan nilai dari atribut brand
    def get_brand(self):
        return self.brand

    # Metode setter untuk mengatur nilai dari atribut brand
    def set_brand(self, brand):
        self.brand = brand

    # Metode getter untuk mendapatkan nilai dari atribut price
    def get_price(self):
        return self.price

    # Metode setter untuk mengatur nilai dari atribut price
    def set_price(self, price):
        self.price = price
