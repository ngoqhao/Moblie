
package bai2;

import java.util.Scanner;
import model.QLCB;

public class Bai2 {
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
