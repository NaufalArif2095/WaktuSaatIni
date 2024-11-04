/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1;

/*
 * @author
 * NAMA    : Naufal Arif Maulana
 * KELAS   : PBO12
 * NIM     : 23176026
 * Deskripsi Program : Program ini berisi program untuk menampilkan 
 * waktu saat ini
 */
import java.util.Date;
import java.text.SimpleDateFormat;

public class WaktuSaatIni {
    public static void main(String[] args) {
        Date sekarang = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        
        System.out.println("Hari ini adalah hari : " + sdf.format(sekarang));
    }
}
