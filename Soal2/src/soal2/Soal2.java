/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;

/**
 *
 * @author Oktavina Zahra R
 */

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        // Objek Scanner Input
        Scanner input = new Scanner(System.in);
        
        // Input
        System.out.print("Masukkan jumlah uang Anda (dalam rupiah): ");
        int uang = input.nextInt();
        
        System.out.print("Apakah hari ini hujan? (true/false): ");
        boolean hujan = input.nextBoolean();
        
        // Proses (Ekspresi)
        boolean beliGorengan = (uang > 5000) && (!hujan);
        
        // Output
        if (beliGorengan) {
            System.out.println("\nAnda akan membeli gorengan hari ini!");
        } else {
            System.out.println("\nAnda tidak akan membeli gorengan hari ini.");
        }
    }
}
