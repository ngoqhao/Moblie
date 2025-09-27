
package bai4;

import java.util.Scanner;
import model.TuyenSinh;

public class Bai4 {

    public static void main(String[] args) {
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
