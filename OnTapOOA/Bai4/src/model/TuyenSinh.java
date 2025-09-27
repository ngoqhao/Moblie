
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh {
    List<ThiSinh> dsts = new ArrayList<>();
    public TuyenSinh(){};
    
    public void Them(ThiSinh TS310){
        dsts.add(TS310);
    }
    public void Nhap(Scanner sc){
        int choice;
        ThiSinh TS310;
        do {
            System.out.println("1.Khoi A\n2.Khoi B\n3.Khoi C\n0.Thoat");
            System.out.print("Lua chon cua ban: ");
            choice=sc.nextInt();
            TS310=new ThiSinh();
            sc.nextLine();
            switch(choice){
                case 1:
                    TS310 = new KhoiA();
                    TS310.NhapTT(sc);
                    
                    System.out.println("Da nhap thanh cong!!");
                    break;
                case 2:
                    TS310 = new KhoiB();
                    TS310.NhapTT(sc);

                    System.out.println("Da nhap thanh cong!!");
                    break;
                case 3:
                    TS310 = new KhoiC();
                    TS310.NhapTT(sc);
                    System.out.println("Da nhap thanh cong!!");
                    break;

            }
            Them(TS310);

        } while (choice !=0);
    }
    public void Tim(){
        String sbd310;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap SBD thi sinh can tim: ");
        sbd310=sc.nextLine();
        for (ThiSinh TS310 : dsts)
            if (sbd310.equals(TS310.getSBD()))
            {
                TS310.Show();
                return;
            }else
                System.out.println("Khong co ma nay!!");
        
    }
}
