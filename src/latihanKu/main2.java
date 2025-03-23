/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author ASUS
 */
public class main2 {
    public static void main(String[] args) {
         int data[][] = {{4,6,4,2,8,4,2,10}, {4,6,4,2,8,4,2,10}};
         double total1 = 0; double total2 = 0; double total3 = 0;
        
        // hanya untuk menampilkan data awal
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");
        }
      
        System.out.println("\nArray Baris ke-1 : ");
        for (int i = 0; i < data[0].length; i++) {
            if (i % 2 != 0) {
                System.out.print(data[0][i]);
                if (i == (data[0].length - 1)) {
                    System.out.print(" = ");
                } else {
                    System.out.print(" + ");
                }
                total1 += data[0][i];
            }
        }
            System.out.println(total1);
            
            
        System.out.println("Array Baris ke-2 : ");
        for (int j = 0; j < data[1].length; j++) {
            if (j % 2 != 0) {
                System.out.print(data[1][j]);
                if (j == (data[0].length - 1)) {
                    System.out.print(" = ");
                } else {
                    System.out.print(" + ");
                }
                total2 += data[1][j];
            }
        }
            System.out.println(total2);
           
        total3 = total1 + total2;
        System.out.println("\nBaris 1 + Baris 2 = " + total3);
        
    }
}
