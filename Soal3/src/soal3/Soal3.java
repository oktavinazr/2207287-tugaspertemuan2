/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3;

/**
 *
 * @author Oktavina Zahra R
 */
import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        // Objek Scanner Input
        Scanner karakter = new Scanner(System.in);
        
        // Input
        System.out.print("Masukkan karakter pertama: ");
        char karakter1 = karakter.next().charAt(0);
        
        System.out.print("Masukkan karakter kedua: ");
        char karakter2 = karakter.next().charAt(0);
        
        // Menghitung kode ASCII
        int kodeASCII1 = (int) karakter1;
        int kodeASCII2 = (int) karakter2;
        
        // Proses & Output
        int hasilJumlah = kodeASCII1 + kodeASCII2;
        System.out.println("\nkode ASCII dari " + karakter1 + " = " + kodeASCII1);
        System.out.println("kode ASCII dari " + karakter2 + " = " + kodeASCII2);
        System.out.println("\nJumlah kode ASCII dari " + karakter1 + " dan " + karakter2 + " adalah: " + hasilJumlah);
    }
}
