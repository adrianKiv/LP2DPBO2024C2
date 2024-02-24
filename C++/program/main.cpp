/* 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
*/

#include <iostream>
#include <string>
#include <bits/stdc++.h>

#include "Shirt.cpp"
#include "print.cpp"

using namespace std;

int main(){

    list<Shirt> llist; // list
    int n; // jumlah data
    cout << "masukan jumlah data [minimal 3]:";
    cin >> n;

    // menampung imputan atribut Product, Clothing, Shirt
    string ID;
    string nama;
    string Brand;
    string price;
    string size;
    string material;
    string gender;
    string color;
    string S_type;

    // meminta masukan sebanyak n
    for(int i =   0; i < n; i++){
        // Instansiasi objek temp
        Shirt temp;
        cout << "+===================+\n";
        cout << "|Masukan Data ke :" << i+1 << " |\n";
        cout << "+===================+\n";
        cout << "Masukan ID          : ";
        cin >> ID;
        cout << "Masukan Nama        : ";
        cin >> nama;
        cout << "Masukan Brand       : ";
        cin >> Brand;
        cout << "Masukan Price       : ";
        cin >> price;
        cout << "Masukan Size        : ";
        cin >> size;
        cout << "Masukan Material    : ";
        cin >> material;
        cout << "Masukan Gender      : ";
        cin >> gender;
        cout << "Masukan Color       : ";
        cin >> color;
        cout << "Masukan Sleeve type : ";
        cin >> S_type;

        // Mengatur nilai atribut inputan data baju ke dalam objek Shirt
        temp.setID(ID);    
        temp.setnama(nama);
        temp.setbrand(Brand);
        temp.setprice(price);
        temp.setsize(size);    
        temp.setmaterial(material);
        temp.setgender(gender);
        temp.setcolor(color);
        temp.setS_type(S_type);

        // Menambahkan nilai objek ke dalam list
        llist.push_back(temp);
        
        cout << "+===================+\n";
        cout << "Data berhasil ditambahkan..."<< "\n\n";
    }

    // Instansiasi objek printer
    print printer;
    printer.printTable(llist); // memanggil fungsi print
}