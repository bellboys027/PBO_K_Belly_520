class Hewan {

    String nama;
    String jenis;
    String suara;


    Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println(); // Baris kosong untuk pemisah
    }
}

public class Codelab1m2 {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan("Monyet", "Mamalia", "UUAAKK~~");
        Hewan hewan2 = new Hewan("Buaya", "Reptil", "aku sayang kamu!!");

        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}
