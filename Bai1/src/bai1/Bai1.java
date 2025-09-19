
package bai1;

import java.util.Scanner;
import model.PhanSo;

public class Bai1 {

    public static void main(String[] args) {
        PhanSo ps1_310 = new PhanSo();
        PhanSo ps2_310 = new PhanSo();
        PhanSo psT_310 = new PhanSo();
        Scanner sc310= new Scanner(System.in);
        
        System.out.println("Nhap phan so thu 1: ");
        ps1_310.Nhap(sc310);
        System.out.println("Nhap phan so thu 2: ");
        ps2_310.Nhap(sc310);
        
        System.out.println("Tong 2 phan so: ");
        psT_310=ps1_310.Cong(ps2_310);
        psT_310.Show();
        
        System.out.println("Hieu 2 phan so: ");
        psT_310=ps1_310.Tru(ps2_310);
        psT_310.Show();
        
        System.out.println("Tich 2 phan so: ");
        psT_310=ps1_310.Nhan(ps2_310);
        psT_310.Show();
        
        System.out.println("Thuong 2 phan so: ");
        psT_310=ps1_310.Chia(ps2_310);
        psT_310.Show();
        
        System.out.println("UCLN cua ps1: "+ps1_310.UCLN(ps1_310.getTu(), ps1_310.getMau()));
        System.out.println("UCLN cua ps2: "+ps2_310.UCLN(ps2_310.getTu(), ps2_310.getMau()));
        
        System.out.println("Kiem tra toi gian");
        if (ps1_310.KiemTraTG())
            System.out.println("Phan so 1 da toi gian");
        else    {
            System.out.println("Phan so 1 chua toi gian");
            System.out.println("Dang toi gian cua ps1: ");
            ps1_310.DangTG();
            ps1_310.Show();
        }
            
        
        if (ps2_310.KiemTraTG())
            System.out.println("Phan so 2 da toi gian");
        else    {
            System.out.println("Phan so 2 chua toi gian");
            System.out.println("Dang toi gian cua ps2: ");
            ps2_310.DangTG();
            ps2_310.Show();
        }
        
        
    }
    
}
