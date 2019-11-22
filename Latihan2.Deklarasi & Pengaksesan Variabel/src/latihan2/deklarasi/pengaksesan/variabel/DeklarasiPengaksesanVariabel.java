/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2.deklarasi.pengaksesan.variabel;

/**
 *
 * @author
 * NAMA  : Hafid Fadhil
 * KELAS : TI-IC
 * NIM   : A2.1900075
 */
public class DeklarasiPengaksesanVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi Variabel
        int nilaiInt;
        final double  PHI = 3.14; //Konstanta Uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberi Nilai Ke Variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menampilkan Hasil
        System.out.println();
        System.out.println("Masukan Variabel Nilai = " + nilaiInt);
        System.out.println("Isi Variabel PHI = " + PHI);
        System.out.println("Isi Variabel Logika = " + nilaiLogika);
        System.out.println("Isi Variabel Karakter = " + nilaiKarakter);
    }
}
