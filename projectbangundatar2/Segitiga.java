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
public class Segitiga {
    //Luasnya
    int hitungLuas(int s1, int s2){
        return (s1*s2)/2;
    }
    
    double hitungLuas(int s1, double s2){
        return (s1*s2)/2;
    }
    
    double hitungLuas(double s1, int s2){
        return (s1*s2)/2;
    }
    
    double hitungLuas(double s1, double s2){
        return (s1*s2)/2;
    }
    
    //Kelilingnya
    double hitungKeliling(int s1, int s2){
    double x = ((s1*s1)+(s2*s2));
    double Keliling = s1 + s2 +(Math.sqrt(x));
    return Keliling;
    
    }
    
    double hitungKeliling(int s1,double  s2){
    double x = ((s1*s1)+(s2*s2));
    double Keliling = s1 + s2 +(Math.sqrt(x));
    return Keliling;
    }
    
    double hitungKeliling(double s1, int s2){
    double x = ((s1*s1)+(s2*s2));
    double Keliling = s1 + s2 +(Math.sqrt(x));
    return Keliling;
    }
    
    double hitungKeliling(double s1, double s2){
    double x = ((s1*s1)+(s2*s2));
    double Keliling = s1 + s2 +(Math.sqrt(x));
    return Keliling;        
    }
}
