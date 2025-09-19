/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;

import java.util.Scanner;
import model.TuyenSinh;

/**
 *
 * @author Hi
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int choice;
        TuyenSinh TS = new TuyenSinh();
        do {
            System.out.println("==================================================");
            System.out.println("1.Them thi sinh\n2.Tim thi sinh\n0.Thoat");
            System.out.print("Lua chon cua ban: ");
            choice=sc.nextInt();
            
            sc.nextLine();
            switch(choice){
                case 1:
                    TS.Nhap(sc);
                    break;
                case 2: 
                    TS.Tim();
                    break;
                            
            }
        } while (choice !=0);
    }
    
}
