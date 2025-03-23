/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author ASUS
 */
public class main3 {
    public static void main(String[] args) {
        String data[][] = {
            {"Abdul", "089976876543", "Kediri"},
            {"Kusno", "085443879012", "Trenggalek"},
            {"Poniran", "081234097445", "Bojonegoro"}            
        };
        
        System.out.print("Nama\t");
        System.out.print("  Alamat\t");
        System.out.print("\tTelepon\t");
        System.out.println("");
        String nama = "";
       
        for (int j = 0; j < data.length; j++) {
                System.out.print(String.format("%-10s", data[j][0]));
                System.out.print(String.format("%-15s", data[j][2]));
                System.out.print(String.format("%-10s", data[j][1]));        
            System.out.println("");
        }
       
    }
}
