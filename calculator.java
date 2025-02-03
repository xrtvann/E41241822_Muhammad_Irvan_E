/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
       String Operator;
       int Angka_pertama;
       int Angka_kedua;
       int Hasil = 0;
       
       Scanner Calculator = new Scanner(System.in);
       
        System.out.println("Selamat Datang Di App Kalkulator");
        System.out.print("Masukkan Operator ");
        Operator = Calculator.nextLine();
        
        System.out.print("Masukkan Angka Pertama");
        Angka_pertama = Calculator.nextInt();
        
        System.out.print("Masukkan Angka Kedua");
        Angka_kedua = Calculator.nextInt();
        
        if(null == Operator ) {
            System.out.println("Mohon memasukkann Operator Yang Benar");
        } else switch (Operator) {
            case "+":
                Hasil = Angka_pertama + Angka_kedua;
                break;
            case "-":
                Hasil = Angka_pertama - Angka_kedua;
                break;
            case "*":
                Hasil = Angka_pertama * Angka_kedua;
                break;
            case "/":
                Hasil = Angka_pertama / Angka_kedua;
                break;
            default:
                System.out.println("Mohon memasukkann Operator Yang Benar");
        }
        
        System.out.println(Angka_pertama + Operator + Angka_kedua + "=" + Hasil);
    }
}
