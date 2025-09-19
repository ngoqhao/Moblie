
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    List<TaiLieu> dstl = new ArrayList<>();
    public QuanLySach(){};
    
    public void Them(TaiLieu TL310){
        dstl.add(TL310);
    }
    public void Nhap(Scanner sc){
        int choice;
        TaiLieu TL310;
        do {
            System.out.println("1.Sach\n2.Tap chi\n3.Bao\n0.Thoat");
            System.out.print("Lua chon cua ban: ");
            choice=sc.nextInt();
            TL310=new TaiLieu();
            sc.nextLine();
            switch(choice){
                case 1:
                    TL310 = new Sach();
                    TL310.Nhap(sc);
                    
                    System.out.println("Da nhap thanh cong!!");
                    break;
                case 2:
                    TL310 = new TapChi();
                    TL310.Nhap(sc);

                    System.out.println("Da nhap thanh cong!!");
                    break;
                case 3:
                    TL310 = new Bao();
                    TL310.Nhap(sc);
                    System.out.println("Da nhap thanh cong!!");
                    break;

            }
            Them(TL310);

        } while (choice !=0);
    }
    public void Tim(){
        int choice;
        Scanner sc = new Scanner(System.in);
        do{          
            System.out.println("1.Ma tai lieu\n2.Loai tai lieu\n0.Thoat");
            System.out.print("Lua chon cua ban: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    TimID();
                    break;
                case 2:
                    TimTL();
                    break;
            }  
        }while (choice!=0);
        
    }
    public void TimID(){
        String id310;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma can tim: ");
        id310=sc.nextLine();
        for (TaiLieu TL310 : dstl)
            if (id310.equals(TL310.getID()))
            {
                TL310.Show();
                return;
            }
        System.out.println("Khong co ma nay!!");
        
    }
    public void TimTL(){
        int choice;
        Scanner sc = new Scanner(System.in);
        do{          
            System.out.println("1.Sach\n2.Tap chi\n3.Bao\n0.Thoat");
            System.out.print("Lua chon cua ban: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    for (TaiLieu TL310 : dstl)
                        if (TL310 instanceof Sach)
                            TL310.Show();
                    break;
                case 2:
                    for (TaiLieu TL310 : dstl)
                        if (TL310 instanceof TapChi)
                        TL310.Show();
                    break;
                case 3:
                    for (TaiLieu TL310 : dstl)
                        if (TL310 instanceof Bao)
                        TL310.Show();
                    break;

            }  
        }while (choice!=0);
    }
    
}
