/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author Oktavina Zahra R
 */

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        // Objek Scanner Input
        Scanner bilangan = new Scanner(System.in);
        
        // Input
        System.out.print("Masukkan bilangan bulat pertama : ");
        int x = bilangan.nextInt();
        
        System.out.print("Masukkan bilangan bulat kedua: ");
        int y = bilangan.nextInt();
        
        System.out.print("Masukkan bilangan bulat ketiga: ");
        int z = bilangan.nextInt();
        
        // Proses & Output
        int hasilPenambahan = x + y + z;
        System.out.println("\nHasil penambahan: " + hasilPenambahan);
        
        int hasilPengurangan = x - y - z;
        System.out.println("Hasil pengurangan: " + hasilPengurangan);
        
        int hasilPerkalian = x * y * z;
        System.out.println("Hasil perkalian: " + hasilPerkalian);
        
        int hasilPembagian = x / y / z;
        System.out.println("Hasil pembagian: " + hasilPembagian);
    }
}