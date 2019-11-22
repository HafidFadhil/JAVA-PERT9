/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3.memasukan.nilai.dari.keyboard;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA  : Hafid Fadhil
 * KELAS : TI-IC
 * NIM   : A2.1900075
 */
public class MemasukanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama Anda adalah "+ nama);

    }
}
