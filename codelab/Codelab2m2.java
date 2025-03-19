class RekeningBank {

    String nomorRekening;
    String namaPemilik;
    double saldo;

    RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println();
    }


    void setor(double jumlah) {
        saldo += jumlah;

        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }


    void tarik(double jumlah) {
        if (jumlah > saldo) {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        } else {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        }
    }
}

public class Codelab2m2 {
    public static void main(String[] args) {

        RekeningBank rekening1 = new RekeningBank("202310370311129", "Maharani", 500000.0);
        RekeningBank rekening2 = new RekeningBank("202310370311307", "Amelia", 1000000.0);


        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setor(200000.0);
        rekening2.setor(500000.0);

        rekening1.tarik(800000.0);
        rekening2.tarik(300000.0);

        System.out.println();
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
