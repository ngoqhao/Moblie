/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

import java.util.Scanner;
import model.QuanLySach;

/**
 *
 * @author Hi
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        QuanLySach QL = new QuanLySach();
        do {
            System.out.println("==================================================");
            System.out.println("1.Them tai lieu\n2.Tim tai lieu\n0.Thoat");
            System.out.print("Lua chon cua ban: ");
            choice=sc.nextInt();
            
            sc.nextLine();
            switch(choice){
                case 1:
                    QL.Nhap(sc);
                    break;
                case 2: 
                    QL.Tim();
                    break;
                            
            }
        } while (choice !=0);
    }
    
}
