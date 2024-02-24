/* 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
*/

#include <iostream>
#include <string>
#include "Product.cpp"

using namespace std;

class Clothing : public Product {
    // Atribut privat untuk menyimpan informasi tentang Clothing
    private:
        string size;
        string material;
        string gender;

    public:
        // Konstruktor tanpa parameter, digunakan untuk membuat objek Clothing dengan nilai default
        Clothing() {
            this->size = "";
            this->material = "";
            this->gender = "";
        }

        // Konstruktor dengan parameter, digunakan untuk membuat objek Clothing dengan nilai yang diberikan
        Clothing(string size, string material, string gender) {
            this->size = size;
            this->material = material;
            this->gender = gender;
        }

        // Metode getter dan setter untuk size
        string getsize() {
            return this->size;
        }

        void setsize(string size) {
            this->size = size;
        }

        // Metode getter dan setter untuk material
        string getmaterial() {
            return this->material;
        }

        void setmaterial(string material) {
            this->material = material;
        }

        // Metode getter dan setter untuk gender
        string getgender() {
            return this->gender;
        }

        void setgender(string gender) {
            this->gender = gender;
        }
    
        // destructor
        ~Clothing(){
            
        }
};
