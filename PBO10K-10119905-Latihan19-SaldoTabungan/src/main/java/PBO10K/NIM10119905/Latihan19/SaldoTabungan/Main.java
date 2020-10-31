/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan19.SaldoTabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


/**
 *
 * @author 
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program Saldo Tabungan
 */
public class Main {

    static int akhir;
    static void hitung(int a, int b){
         akhir = (a + (a*b/100));
    }
    
    public static void main(String[] args) {
    DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    
    formatRp.setCurrencySymbol("Rp. ");
    formatRp.setMonetaryDecimalSeparator('.');
    formatRp.setGroupingSeparator('.');
    
    kursIndonesia.setDecimalFormatSymbols(formatRp);

        int saldo = 2500000;
        int bunga = 15;
        int lama = 6;
        
        for (int i = 1; i <= lama; i++){
            hitung(saldo,bunga);
            System.out.println("Saldo di bulan ke-"+i+" " + kursIndonesia.format(akhir));
         saldo = akhir;
        }
}
}
