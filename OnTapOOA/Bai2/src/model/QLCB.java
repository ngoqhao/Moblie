
package model;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    ArrayList<CanBo> danhSachCanBo ;
    
    public QLCB(){this.danhSachCanBo = new ArrayList<>();};
    
    public void ThemCB(CanBo CB310){
        danhSachCanBo.add(CB310);
    }
    public void Nhap(Scanner sc){
        int choice;
        CanBo cb310;
        do {
            System.out.println("1.Cong nhan\n2.Ky su\n3.Nhan vien\n0.Thoat");
            System.out.print("Lua chon cua ban: ");
            choice=sc.nextInt();
            cb310=new CanBo();
            sc.nextLine();
            switch(choice){
                case 1:
                    cb310 = new CongNhan();
                    cb310.NhapTT(sc);
                    
                    System.out.println("Da nhap thanh cong!!");
                    break;
                case 2:
                    cb310 = new KySu();
                    cb310.NhapTT(sc);

                    System.out.println("Da nhap thanh cong!!");
                    break;
                case 3:
                    cb310 = new NhanVien();
                    cb310.NhapTT(sc);
                    System.out.println("Da nhap thanh cong!!");
                    break;

            }
                 ThemCB(cb310);

        } while (choice !=0);
    }
    public void Tim(){
        String Ten310;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can bo can tim: ");
        Ten310=sc.nextLine();
        for (CanBo cb310 : danhSachCanBo)
            if (Ten310.equals(cb310.getHoten())) {   
                cb310.Show();
                return;
            }
        System.out.println("Khong tim thay can bo");
    }

}