
    # Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    # untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 

import random

class Printer:
    def __init__(self):
        # set default length
        self.max_id_length = 2
        self.max_nama_length = 4
        self.max_brand_length = 5
        self.max_price_length = 5
        self.max_size_length = 4
        self.max_material_length = 8
        self.max_gender_length = 6
        self.max_color_length = 5
        self.max_s_type_length = 11

    def find_max_lengths(self, shirts):
        #mengecek length terpanjang dari data dalam list
        for shirt in shirts:
            if len(shirt.get_ID()) > self.max_id_length:
                self.max_id_length = len(shirt.get_ID())
            if len(shirt.get_nama()) > self.max_nama_length:
                self.max_nama_length = len(shirt.get_nama())
            if len(shirt.get_brand()) > self.max_brand_length:
                self.max_brand_length = len(shirt.get_brand())
            if len(shirt.get_price()) > self.max_price_length:
                self.max_price_length = len(shirt.get_price())
            if len(shirt.get_size()) > self.max_size_length:
                self.max_size_length = len(shirt.get_size())
            if len(shirt.get_material()) > self.max_material_length:
                self.max_material_length = len(shirt.get_material())
            if len(shirt.get_gender()) > self.max_gender_length:
                self.max_gender_length = len(shirt.get_gender())
            if len(shirt.get_color()) > self.max_color_length:
                self.max_color_length = len(shirt.get_color())
            if len(shirt.get_S_type()) > self.max_s_type_length:
                self.max_s_type_length = len(shirt.get_S_type())

    def print_table(self, shirts):
        # Tampilkan baris header
        header = f"| {'NO':<2} | {'ID':<{self.max_id_length}} | {'NAMA':<{self.max_nama_length}} | {'BRAND':<{self.max_brand_length}} | {'PRICE':<{self.max_price_length}} | {'SIZE':<{self.max_size_length}} | {'MATERIAL':<{self.max_material_length}} | {'GENDER':<{self.max_gender_length}} | {'COLOR':<{self.max_color_length}} | {'SLEVEE TYPE':<{self.max_s_type_length}} |"
        line = '+' + '-' * (len(header) -  2) + '+'
        print(line)
        print(header)
        print(line)

        # Tampilkan baris data
        for i, shirt in enumerate(shirts, start=1):
            row = f"| {i:<2} | {shirt.get_ID():<{self.max_id_length}} | {shirt.get_nama():<{self.max_nama_length}} | {shirt.get_brand():<{self.max_brand_length}} | {shirt.get_price():<{self.max_price_length}} | {shirt.get_size():<{self.max_size_length}} | {shirt.get_material():<{self.max_material_length}} | {shirt.get_gender():<{self.max_gender_length}} | {shirt.get_color():<{self.max_color_length}} | {shirt.get_S_type():<{self.max_s_type_length}} |"
            print(row)

        print(line)