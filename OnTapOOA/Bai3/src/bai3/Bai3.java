
package bai3;

import java.util.Scanner;
import model.QuanLySach;

public class Bai3 {

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
