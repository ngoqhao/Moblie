/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

import java.util.Scanner;
import model.CanBo;
import model.KySu;
import model.NhanVien;
import model.QLCB;



/**
 *
 * @author Hi
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        QLCB cb310 = new QLCB();
        do {
            System.out.println("==================================================");
            System.out.println("1.Them can bo\n2.Tim can bo\n0.Thoat");
            System.out.print("Lua chon cua ban: ");
            choice=sc.nextInt();
            
            sc.nextLine();
            switch(choice){
                case 1:
                    cb310.Nhap(sc);
                    break;
                case 2: 
                    cb310.Tim();
                    break;
                            
            }
        } while (choice !=0);
        
    }
    
}
