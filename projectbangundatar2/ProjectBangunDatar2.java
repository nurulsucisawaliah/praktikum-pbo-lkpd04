/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author ASUS
 */
public class ProjectBangunDatar2 {

    public static void main(String[] args) {
        // persegi panjang 
        PersegiPanjang Pp1 = new PersegiPanjang();
        System.out.println("1. Luas & Keliling Persegi Panjang: "
        + "\nLuas persegi panjang 1 = " + Pp1.hitungLuas(10, 5) + ", Keliling 1 = " + Pp1.hitungKeliling(10, 5)
        + "\nLuas persegi panjang 2 = " + Pp1.hitungLuas(3.6, 8) + ", Keliling 2 = " + Pp1.hitungKeliling(3.6, 8)
        + "\nLuas persegi panjang 3 = " + String.format("%.3f", Pp1.hitungLuas(6, 8.3)) + ", Keliling 3 = " + Pp1.hitungKeliling(6, 8.3)
        + "\nLuas persegi panjang 4 = " + Pp1.hitungLuas(5.6, 8.8) + ", Keliling 4 = " + Pp1.hitungKeliling(5.6, 8.8)
        );
        
        // Persegi
        Persegi P1 = new Persegi();
        System.out.println("2. Luas & Keliling Persegi: "
        + "\nLuas persegi  1 = " + P1.hitungLuas(4.5) + ", Keliling 1 = " + P1.hitungKeliling(4.5)
        + "\nLuas persegi  2 = " + P1.hitungLuas(7) + ", Keliling 2 = " + P1.hitungKeliling(7)
        );
        
        //Lingkaran
        Lingkaran l1 = new Lingkaran();
        System.out.println("3. Luas & Keliling Lingkaran: "
        + "\nLuas Lingkaran 1 = " + (l1.hitungLuas(5) * 3.14) + ", Keliling 1 = " + String.format("%.3f", l1.hitungKeliling(5) * 3.14)
        + "\nLuas Lingkaran 2 = " +  String.format("%.3f", l1.hitungLuas(7.4) * 3.14) + ", Keliling 2 = " + String.format("%.3f", l1.hitungKeliling(7.4) * 3.14)
        );
        
        //Segitiga
        Segitiga s1= new Segitiga();
        System.out.println("4. Luas & Keliling Segitiga: "
        + "\nLuas Segitiga 1 = " + s1.hitungLuas(8, 10) + ", Keliling 1 = " + String.format("%.3f", s1.hitungKeliling(8, 10))
        + "\nLuas Segitiga 2 = " + s1.hitungLuas(8, 11.5) + ", Keliling 2 = " + String.format("%.3f", s1.hitungKeliling(8, 11.5))
        + "\nLuas Segitiga 3 = " + s1.hitungLuas(12.2, 9) + ", Keliling 3 = " + String.format("%.3f", s1.hitungKeliling(12.2, 9))
        + "\nLuas Segitiga 4 = " + String.format("%.3f", s1.hitungLuas(13.9, 20.7)) + ", Keliling 4 = " + String.format("%.2f", s1.hitungKeliling(13.9, 20.7))
        );
    }
    
}
