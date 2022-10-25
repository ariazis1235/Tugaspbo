/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun_datar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.sqrt;

/**
 *
 * @author PERSONAL
 */
public class segitiga {
     public static void main(String[] args) throws IOException {
        int a,t;
        double m, kll,luas;
        
        BufferedReader segitiga = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Alas: ");
        String nilaiA = segitiga.readLine();
        a = Integer.parseInt(nilaiA);
        System.out.print("Masukkan Tinggi: ");
        String nilaiT = segitiga.readLine();
        t = Integer.parseInt(nilaiT);
        System.out.println("");
        //menghitung luas
        luas = 0.5*a*t;
        System.out.println("Luasnya Adalah: "+luas);
        //menghitung sisi miring
        m = sqrt((a*a)+(t*t));
        //menghitung keliling
        kll = a+t+m;
        System.out.println("Kelilingnya adalah: "+kll);     
    }
}