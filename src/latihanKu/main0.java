/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

public class main0 {
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
        
        // program untuk menjumlahkan nilai rata-rata         
        int nilai = 0; double average = 0;  int total = 0;
        for (int i = 0; i < data.length; i++) {
                if (i > 0) {
                System.out.print("\n" + total + " + ");
            }
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]);
                total += data[i][j];
                nilai++;
                if (j == (data[i].length - 1)) {
                    System.out.print(" = ");
                } else {
                    System.out.print(" + ");
                }
            }
            System.out.print(total);
        }
        
        System.out.println("\n\nJumlah : " + total + " / " +  nilai);
        average = total / nilai;
        System.out.println("Nilai rata-rata : " + average);
    }
}
