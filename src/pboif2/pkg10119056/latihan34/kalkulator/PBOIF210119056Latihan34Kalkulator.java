/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan34.kalkulator;
import java.util.Scanner;
/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan program kalkulator
 */

class Kalkulator{
    double value1;
    double value2;
    
    double tambahBilangan(){
        return value1+value2;
    }
    double kurangBilangan(){
        return value1-value2;
    }
    double kaliBilangan(){
        return value1*value2;
    }
    double bagiBilangan(){
        return value1/value2;
    }
    double sisaBilangan(){
        return value1%value2;
    }
}


public class PBOIF210119056Latihan34Kalkulator {    
    
    public static void main(String[] args) {
        Kalkulator nilai=new Kalkulator();
        Scanner masukan = new Scanner(System.in);
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        nilai.value1=masukan.nextDouble();
        System.out.print("Masukan Angka ke-2 : ");
        nilai.value2=masukan.nextDouble();
        System.out.println();
        System.out.println("Hasil Pertambahan : "+nilai.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+nilai.kurangBilangan());
        System.out.println("Hasil Perkalian : "+nilai.kaliBilangan());
        System.out.println("Hasil Pembagian : "+nilai.bagiBilangan());
        System.out.println("Hasil Sisa : "+nilai.sisaBilangan());      
        
    }
    
}
