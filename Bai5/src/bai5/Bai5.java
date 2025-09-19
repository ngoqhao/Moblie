/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai5;

import java.util.Scanner;
import model.KhuPho;

/**
 *
 * @author Hi
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        KhuPho KP=new KhuPho();
        
         KP.Nhap(sc);
         KP.hienThiDanhSach();
         System.out.println("Danh sach ho dan co nguoi 80 tuoi la: ");
         KP.Tim();
    }
    
}
