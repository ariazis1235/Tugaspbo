/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun_datar;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Lingkaran {
    public static void main(String[] args)

{
Scanner input = new Scanner(System.in);

double phi = 3.14;
double r, luas,keliling;

System.out.println("Program Luas Lingkaran\n");
System.out.print("Masukkan Panjang Jari-jari : ");
r = input.nextDouble();

luas = 0.5 * phi * r * r;
keliling = 2 * phi * r;

System.out.print("Luas Lingkaran = " + (int)luas + " \nKeliling lingkaran = "+ (int)keliling);
}
}