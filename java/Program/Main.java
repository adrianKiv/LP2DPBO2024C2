/* 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
*/

import java.util.ArrayList; // inport arraylist
import java.util.Scanner; // import scanner

public class Main{
public static void main(String[] args){
    // Membuat ArrayList untuk menyimpan objek Shirt
    ArrayList<Shirt> list = new ArrayList<>();
    // Membuat Scanner untuk membaca input dari pengguna
    Scanner sc = new Scanner(System.in);
    
    // Meminta pengguna untuk memasukkan jumlah data yang akan dimasukkan
    System.out.print("Masukan jumlah data: ");
    int n = sc.nextInt();

    // Memeriksa apakah jumlah data yang dimasukkan valid (minimal  3)
    if(n >=  3){
        // Loop untuk membuat objek Shirt baru dan menambahkannya ke dalam list
        for (int i =   0; i < n; i++) {
            // Membuat objek Shirt baru
            Shirt temp = new Shirt();
            // Meminta pengguna untuk memasukkan ID untuk Shirt baru
            System.out.print("Masukan ID " + (i +   1) + ": ");
            String ID = sc.next();
            temp.setID(ID);
            // Meminta pengguna untuk memasukkan Nama untuk Shirt baru
            System.out.print("Masukan Nama " + (i +   1) + ": ");
            String nama = sc.next();
            temp.setnama(nama);
            // Meminta pengguna untuk memasukkan Brand untuk Shirt baru
            System.out.print("Masukan Brand " + (i +   1) + ": ");
            String brand = sc.next();
            temp.setbrand(brand);
            // Meminta pengguna untuk memasukkan Price untuk Shirt baru
            System.out.print("Masukan Prince " + (i +   1) + ": ");
            String price = sc.next();
            temp.setprice(price);

            // Meminta pengguna untuk memasukkan Size untuk Shirt baru
            System.out.print("Masukan size " + (i +   1) + ": ");
            String size = sc.next();
            temp.setsize(size);
            // Meminta pengguna untuk memasukkan Material untuk Shirt baru
            System.out.print("Masukan material " + (i +   1) + ": ");
            String material = sc.next();
            temp.setmaterial(material);
            // Meminta pengguna untuk memasukkan Gender untuk Shirt baru
            System.out.print("Masukan gender " + (i +   1) + ": ");
            String gender = sc.next();
            temp.setgender(gender);

            // Meminta pengguna untuk memasukkan Color untuk Shirt baru
            System.out.print("Masukan color " + (i +   1) + ": ");
            String color = sc.next();
            temp.setcolor(color);
            // Meminta pengguna untuk memasukkan Sleeve Type untuk Shirt baru
            System.out.print("Masukan sleeve type " + (i +   1) + ": ");
            String sleeve = sc.next();
            temp.setS_type(sleeve);

            // Menambahkan objek Shirt baru ke dalam list
            list.add(temp);
            // Menginformasikan pengguna bahwa data telah berhasil ditambahkan
            System.out.println("Data ditambahkan dengan sukses.");
        }
    }
        else{
            System.out.println("Tolong berikan jumlah data lebih dari atau sama dengan 3.");
        }

        // set default max length kolom
        int no = 2;
        int maxid = 2;
        int maxnama = 4;
        int maxbrand = 5;
        int maxprice = 5;
        int maxsize = 4;
        int maxmaterial = 8;
        int maxgender = 6;
        int maxcolor = 5;
        int maxslevee = 11;

        // mencari string terpanjang dalam list
        // jika ada string yang lebih panjang maka perbarui default max length
        for (int j = 0; j < list.size(); j++){
            Shirt datas = list.get(j);
            if ((list.get(j).getID()).length() > maxid) maxid = (list.get(j).getID()).length();
            if ((list.get(j).getnama()).length() > maxnama) maxnama = (list.get(j).getnama()).length();
            if ((list.get(j).getbrand()).length() > maxbrand) maxbrand = (list.get(j).getbrand()).length();
            if ((list.get(j).getprice()).length() > maxprice) maxprice = (list.get(j).getprice()).length();
            if ((list.get(j).getsize()).length() > maxsize) maxsize = (list.get(j).getsize()).length();
            if ((list.get(j).getmaterial()).length() > maxmaterial) maxmaterial = (list.get(j).getmaterial()).length();
            if ((list.get(j).getgender()).length() > maxgender) maxgender = (list.get(j).getgender()).length();
            if ((list.get(j).getcolor()).length() > maxcolor) maxcolor = (list.get(j).getcolor()).length();
            if ((list.get(j).getS_type()).length() > maxslevee) maxslevee = (list.get(j).getS_type()).length();
        }

        // print bagian baris atas
        System.out.print("+");
        for(int z = 0; z < no + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxid + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxnama + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxbrand + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxprice + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxsize + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxmaterial + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxgender + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxcolor + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxslevee + 2; z++){
            System.out.print("-");
        }
        System.out.print("+\n");

        // print bagian header
        System.out.print("| NO ");
        for(int z = 0; z < no - 2; z++){
            System.out.print(" ");
        }
        System.out.print("| ID ");
        for(int z = 0; z < maxid - 2; z++){
            System.out.print(" ");
        }
        System.out.print("| NAMA ");
        for(int z = 0; z < maxnama - 4; z++){
            System.out.print(" ");
        }
        System.out.print("| BRAND ");
        for(int z = 0; z < maxbrand - 5; z++){
            System.out.print(" ");
        }
        System.out.print("| PRICE ");
        for(int z = 0; z < maxprice - 5; z++){
            System.out.print(" ");
        }
        System.out.print("| SIZE ");
        for(int z = 0; z < maxsize - 4; z++){
            System.out.print(" ");
        }
        System.out.print("| MATERIAL ");
        for(int z = 0; z < maxmaterial - 8; z++){
            System.out.print(" ");
        }
        System.out.print("| GENDER ");
        for(int z = 0; z < maxgender - 6; z++){
            System.out.print(" ");
        }                
        System.out.print("| COLOR ");
        for(int z = 0; z < maxcolor - 5; z++){
            System.out.print(" ");
        }
        System.out.print("| SLEVEE TYPE ");
        for(int z = 0; z < maxslevee - 11; z++){
            System.out.print(" ");
        }
        System.out.print("|\n");

        // print bagian baris bawah header
        System.out.print("+");
        for(int z = 0; z < no + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxid + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxnama + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxbrand + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxprice + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxsize + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxmaterial + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxgender + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxcolor + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxslevee + 2; z++){
            System.out.print("-");
        }
        System.out.print("+\n");

        // print isi list
        for (int i = 0; i < list.size(); i++) {
            Shirt data = list.get(i);

            System.out.print("| " + (i +  1) + ". ");
            System.out.print("| " + list.get(i).getID());
            for(int x = 0; x < (maxid + 1) - list.get(i).getID().length(); x++){
                System.out.print(" ");
            }
            System.out.print("| " + list.get(i).getnama());
            for(int x = 0; x < (maxnama + 1) - list.get(i).getnama().length(); x++){
                System.out.print(" ");
            }
            System.out.print("| " + list.get(i).getbrand());
            for(int x = 0; x < (maxbrand + 1) - list.get(i).getbrand().length(); x++){ 
                System.out.print(" ");
            }
            System.out.print("| " + list.get(i).getprice());
            for(int x = 0; x < (maxprice + 1) - list.get(i).getprice().length(); x++){
                System.out.print(" ");
            }
            System.out.print("| " + list.get(i).getsize());
            for(int x = 0; x < (maxsize + 1) - list.get(i).getsize().length(); x++){
                System.out.print(" ");
            }
            System.out.print("| " + list.get(i).getmaterial());
            for(int x = 0; x < (maxmaterial + 1) - list.get(i).getmaterial().length(); x++){
                System.out.print(" ");
            }
            System.out.print("| " + list.get(i).getgender());
            for(int x = 0; x < (maxgender + 1) - list.get(i).getgender().length(); x++){
                System.out.print(" ");
            }
            System.out.print("| " + list.get(i).getcolor());
            for(int x = 0; x < (maxcolor + 1) - list.get(i).getcolor().length(); x++){
                System.out.print(" ");
            }
            System.out.print("| " + list.get(i).getS_type());
            for(int x = 0; x < (maxslevee + 1) - list.get(i).getS_type().length(); x++){
                System.out.print(" ");
            }
            System.out.print("|\n");
        }

        // print baris bagian bawah
        System.out.print("+");
        for(int z = 0; z < no + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxid + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxnama + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxbrand + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxprice + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxsize + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxmaterial + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxgender + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxcolor + 2; z++){
            System.out.print("-");
        }
        System.out.print("+");
        for(int z = 0; z < maxslevee + 2; z++){
            System.out.print("-");
        }
        System.out.print("+\n");
    }
}