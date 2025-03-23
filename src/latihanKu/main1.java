/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

import javax.swing.JOptionPane;

public class main1 {
    public static void main(String[] args) {
        
         int data[][] = {{4,6,4,2,8,4,2,10}, {4,6,4,2,8,4,2,10}};
        // hanya untuk menampilkan data awal
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
      
       int searchBaris = Integer.parseInt(JOptionPane.showInputDialog("Masukkan baris (0 - 1)"));
       int searchKolom = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka (0 - 7)"));
        
       if (searchBaris >= 0 && searchBaris < data.length && searchKolom >= 0 && searchKolom < data[searchBaris].length) {            
            
        int newValue = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai dari : (" + searchBaris + ", " + searchKolom + ")" ));           
           
            data[searchBaris][searchKolom] = newValue;
            System.out.println("Nilai dari (" + searchBaris + ", " + searchKolom + ") Telah Dirubah" );
           
        } else {
            System.out.println("Index atau Kolom tidak valid!");           
        }
           
        System.out.println("\nArray setelah dirubah");
         for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
