/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6.Mamalia;

/**
 *
 * @author
 * NAMA  : Hafid Fadhil
 * KELAS : TI-IC
 * NIM   : A2.1900075
 */
class Mamalia {
    // Variabel jumlahKambing dideklarasikan sebagai static
    public static int jumlahKambing;
}

class KambingStatic {
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
   
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " Memili Kambing Sebanyak = " + Mamalia.jumlahKambing);
        
      
    }
}
