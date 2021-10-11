/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author ASUS
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operasi satu = new Operasi();
        System.out.println(satu.jumlahkan(3, 4));
        
        Operasi dua = new Operasi();
        System.out.println(dua.jumlahkan(4, 7, -9));
        
        Operasi tiga = new Operasi();
        System.out.println(tiga.jumlahkan(3.4, -0.002, 0.12313));
        
        //PROJECT 1
        Operasi empat = new Operasi();
        System.out.println(empat.kalikan(1, 24));
    }
    
}
