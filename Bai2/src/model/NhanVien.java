
package model;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String work310;

    public String getWork() {
        return work310;
    }
    public void setWork(String work310) {
        this.work310 = work310;
    }

    public NhanVien(){};
    public NhanVien(String work310, String Hoten310, String NgaySinh310, String DiaChi310) {
        super(Hoten310, NgaySinh310, DiaChi310);
        this.work310 = work310;
    }
    @Override
    public void NhapTT(Scanner sc){
        super.NhapTT(sc);
        System.out.println("Nhap cong viec: ");
        work310=sc.nextLine();
    }
    @Override
    public void Show(){
        super.Show();
        System.out.println("Cong viec: "+this.work310);
    }   
}
