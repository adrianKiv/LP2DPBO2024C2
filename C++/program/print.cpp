/* 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
*/

#include <iostream>
#include <string>
#include <list>

using namespace std;

class print {
    private:
        int maxIDLength;
        int maxNamaLength;
        int maxBrandLength;
        int maxPriceLength;
        int maxSizeLength;
        int maxMaterialLength;
        int maxGenderLength;
        int maxColorLength;
        int maxS_typeLength;

    public:
        print() {
            // Inisialisasi variabel dengan default length
            maxIDLength =  2;
            maxNamaLength =  4;
            maxBrandLength =  5;
            maxPriceLength =  5;
            maxSizeLength =  4;
            maxMaterialLength =  8;
            maxGenderLength =  6;
            maxColorLength =  5;
            maxS_typeLength =  11;
        }

        void caripanjang(list<Shirt>& llist){
            for (auto it = llist.begin(); it != llist.end(); ++it) {
                Shirt& datas = *it; // Menggunakan referensi untuk mengakses objek
                // mengecek length terpanjang dari data dalam list
                if (datas.getID().length() > maxIDLength) maxIDLength = datas.getID().length();
                if (datas.getnama().length() > maxNamaLength) maxNamaLength = datas.getnama().length();
                if (datas.getbrand().length() > maxBrandLength) maxBrandLength = datas.getbrand().length();
                if (datas.getprice().length() > maxPriceLength) maxPriceLength = datas.getprice().length();
                if (datas.getsize().length() > maxSizeLength) maxSizeLength = datas.getsize().length();
                if (datas.getmaterial().length() > maxMaterialLength) maxMaterialLength = datas.getmaterial().length();
                if (datas.getgender().length() > maxGenderLength) maxGenderLength = datas.getgender().length();
                if (datas.getcolor().length() > maxColorLength) maxColorLength = datas.getcolor().length();
                if (datas.getS_type().length() > maxS_typeLength) maxS_typeLength = datas.getS_type().length();
            }
        }

        void garis(){
            int i;
            // Menampilkan data dalam bentuk tabel dengan lebar kolom yang disesuaikan
            cout << "+";
            for (i =  0; i < maxIDLength +  2; i++) cout << "-";
            cout << "+";
            for (i =  0; i < maxNamaLength +  2; i++) cout << "-";
            cout << "+";
            for (i =  0; i < maxBrandLength +  2; i++) cout << "-";
            cout << "+";
            for (i =  0; i < maxPriceLength +  2; i++) cout << "-";
            cout << "+";
            for (i =  0; i < maxSizeLength +  2; i++) cout << "-";
            cout << "+";
            for (i =  0; i < maxMaterialLength +  2; i++) cout << "-";
            cout << "+";
            for (i =  0; i < maxGenderLength +  2; i++) cout << "-";
            cout << "+";
            for (i =  0; i < maxColorLength +  2; i++) cout << "-";
            cout << "+";
            for (i =  0; i < maxS_typeLength +  2; i++) cout << "-";
            cout << "+\n";  
        }

        // Fungsi untuk menampilkan data dalam bentuk tabel
        void printTable(list<Shirt>& llist) {

            caripanjang(llist);
            int i;

            garis();
            cout << "| ID ";
            for (i =  0; i < maxIDLength -  2; i++) cout << " ";
            cout << "| Nama ";
            for (i =  0; i < maxNamaLength -  4; i++) cout << " ";
            cout << "| Brand ";
            for (i =  0; i < maxBrandLength -  5; i++) cout << " ";
            cout << "| Price ";
            for (i =  0; i < maxPriceLength -  5; i++) cout << " ";
            cout << "| Size ";
            for (i =  0; i < maxSizeLength -  4; i++) cout << " ";
            cout << "| Material ";
            for (i =  0; i < maxMaterialLength -  8; i++) cout << " ";
            cout << "| Gender ";
            for (i =  0; i < maxGenderLength -  6; i++) cout << " ";
            cout << "| Color ";
            for (i =  0; i < maxColorLength -  5; i++) cout << " ";
            cout << "| Sleeve Type ";
            for (i =  0; i < maxS_typeLength -  11; i++) cout << " ";
            cout << "|\n";
            garis();
            for(list<Shirt>::iterator it = llist.begin(); it != llist.end(); ++it){
                cout << "| " << it->getID() << " ";
                for (i =  0; i < maxIDLength - it->getID().length(); i++) cout << " ";
                cout << "| " << it->getnama() << " ";
                for (i =  0; i < maxNamaLength - it->getnama().length(); i++) cout << " ";
                cout << "| " << it->getbrand() << " ";
                for (i =  0; i < maxBrandLength - it->getbrand().length(); i++) cout << " ";
                cout << "| " << it->getprice() << " ";
                for (i =  0; i < maxPriceLength - it->getprice().length(); i++) cout << " ";
                cout << "| " << it->getsize() << " ";
                for (i =  0; i < maxSizeLength - it->getsize().length(); i++) cout << " ";
                cout << "| " << it->getmaterial() << " ";
                for (i =  0; i < maxMaterialLength - it->getmaterial().length(); i++) cout << " ";
                cout << "| " << it->getgender() << " ";
                for (i =  0; i < maxGenderLength - it->getgender().length(); i++) cout << " ";
                cout << "| " << it->getcolor() << " ";
                for (i =  0; i < maxColorLength - it->getcolor().length(); i++) cout << " ";
                cout << "| " << it->getS_type() << " ";
                for (i =   0; i < maxS_typeLength - it->getS_type().length(); i++) cout << " ";
                cout << "|\n";
                i++;
            }
            garis();
            cout << '\n';
    }

    // destructor
    ~print(){
        
    }
};
