/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author PERSONAL
 */
public class biodata {
    public static void main(String[] args) {
        System.out.println("Data Diri");
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("masukan nama anda :");
        String nama = masukan.nextLine();
        
        System.out.println("masukan alamat anda :");
        String alamat = masukan.nextLine();
        
        System.out.println("masukan kelas anda :");
        String kelas = masukan.nextLine();
        
        System.out.println("masukan no absen anda :");
        int absen = masukan.nextInt();
        
        System.out.println("Nama anda adalah " +nama);
        System.out.println("Alamat anda adalah " +alamat);
        System.out.println("Kelas anda adalah " +kelas);
        System.out.println("No Absen anda adalah " +absen
        );
    }
 
}
