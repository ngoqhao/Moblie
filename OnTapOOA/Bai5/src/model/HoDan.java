
package model;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
    private int SoTV310;
    private int SoNha310;
    private Nguoi[] list;

    public int getSoTV() {
        return SoTV310;
    }

    public int getSoNha() {
        return SoNha310;
    }

    public HoDan() {
        list = new Nguoi[10];
    }

    public HoDan(int SoTV310, int SoNha310, String Hoten310, String GioiTinh310, Date NgaySinh310, String Nghe310) {
        super(Hoten310, GioiTinh310, NgaySinh310, Nghe310);
        this.SoTV310 = SoTV310;
        this.SoNha310 = SoNha310;
    }
    
    public void NhapTT(Scanner sc){
        System.out.println("Nhap so thanh vien: ");
        SoTV310=sc.nextInt();
        System.out.println("Nhap so nha: ");
        SoNha310=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap thong tin thanh vien: ");
        for (int i=0;i<SoTV310;i++){
            int j=i+1;
            System.out.println("Thanh vien thu "+j+": ");
            list[i]=new Nguoi();
            list[i].NhapTT(sc);            
        }
    }
    public void Show(){
        System.out.println("So thanh vien: "+this.SoTV310);
        System.out.println("So nha: "+SoNha310);
        System.out.println("Thong tin tung thanh vien trong ho: ");
        for(int i=0;i<SoTV310;i++){
            int j=i+1;
            System.out.println("Thanh vien thu "+j+": ");
            list[i].Show();
        }
    }
    public Nguoi[] getList(){
        return list;
    }
}
