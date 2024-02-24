/* 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
*/

#include <iostream>
#include <string>
#include "Clothing.cpp"

using namespace std;// Deklarasi kelas Clothing dengan atribut privat dan metode publik

// Deklarasi kelas Shirt dengan atribut privat dan metode publik
class Shirt : public Clothing {
    // Atribut privat untuk menyimpan informasi tentang Shirt
    private:
        string color;
        string S_type;

    public:
        // Konstruktor tanpa parameter, digunakan untuk membuat objek Shirt dengan nilai default
        Shirt() {
            this->color = "";
            this->S_type = "";
        }

        // Konstruktor dengan parameter, digunakan untuk membuat objek Shirt dengan nilai yang diberikan
        Shirt(string color, string S_type) {
            this->color = color;
            this->S_type = S_type;
        }

        // Metode getter dan setter untuk color
        string getcolor() {
            return this->color;
        }

        void setcolor(string color) {
            this->color = color;
        }

        // Metode getter dan setter untuk S_type
        string getS_type() {
            return this->S_type;
        }

        void setS_type(string S_type) {
            this->S_type = S_type;
        }

        // destructor
        ~Shirt(){
            
        }
};
