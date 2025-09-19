
package model;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
    private String mon1_310;
    private String mon2_310;
    private String mon3_310;
    public KhoiA() {}
    public KhoiA(String mon1_310, String mon2_310, String mon3_310, String SBD310, String HoTen310, String DiaChi310, String DienUuTien310) {
        super(SBD310, HoTen310, DiaChi310, DienUuTien310);
        this.mon1_310 = mon1_310;
        this.mon2_310 = mon2_310;
        this.mon3_310 = mon3_310;
    }
    @Override 
    public void NhapTT(Scanner sc){
        super.NhapTT(sc);
        System.out.println("Nhap mon 1: ");
        mon1_310=sc.nextLine();
        System.out.println("Nhap mon 2: ");
        mon2_310=sc.nextLine();
        System.out.println("Nhap mon 2: ");
        mon3_310=sc.nextLine();
    }
    @Override
    public void Show(){
        super.Show();
        System.out.println("To hop mon thi: "+this.mon1_310+", "+this.mon2_310+", "+this.mon3_310);
    }  
}
