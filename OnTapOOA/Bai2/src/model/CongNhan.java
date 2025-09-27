package model;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private String Bac310;
    public String getBac() {
        return Bac310;
    }
    public void setBac(String Bac310) {
        this.Bac310 = Bac310;
    }
    
    public CongNhan(){};

    public CongNhan(String Bac310, String Hoten310, String NgaySinh310, String DiaChi310) {
        super(Hoten310, NgaySinh310, DiaChi310);
        this.Bac310 = Bac310;
    }
    
    @Override
    public void NhapTT(Scanner sc){
        super.NhapTT(sc);
        System.out.println("Nhap bac: ");
        Bac310=sc.nextLine();
    }
    @Override
    public void Show(){
        super.Show();
        System.out.println("Bac: "+this.Bac310);
    }        
}
