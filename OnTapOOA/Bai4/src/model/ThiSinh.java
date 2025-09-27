
package model;

import java.util.Scanner;

public class ThiSinh {
    private String SBD310;
    private String HoTen310;
    private String DiaChi310;
    private String DienUuTien310;

    public String getSBD() {
        return SBD310;
    }

    public void setSBD(String SBD310) {
        this.SBD310 = SBD310;
    }

    public String getHoTen() {
        return HoTen310;
    }

    public void setHoTen(String HoTen310) {
        this.HoTen310 = HoTen310;
    }

    public String getDiaChi() {
        return DiaChi310;
    }

    public void setDiaChi(String DiaChi310) {
        this.DiaChi310 = DiaChi310;
    }

    public String getDienUuTien() {
        return DienUuTien310;
    }

    public void setDienUuTien(String DienUuTien310) {
        this.DienUuTien310 = DienUuTien310;
    }

    public ThiSinh() {
    }

    public ThiSinh(String SBD310, String HoTen310, String DiaChi310, String DienUuTien310) {
        this.SBD310 = SBD310;
        this.HoTen310 = HoTen310;
        this.DiaChi310 = DiaChi310;
        this.DienUuTien310 = DienUuTien310;
    }
    
    public void NhapTT(Scanner sc){
        System.out.println("Nhap so bao danh: ");
        SBD310=sc.nextLine();
        System.out.println("Nhap ho ten: ");
        HoTen310=sc.nextLine();
        System.out.println("Nhap dia chi: ");
        DiaChi310=sc.nextLine();
        System.out.println("Nhap dien uu tien khu vuc: ");
        DienUuTien310=sc.nextLine();
    }
    public void Show(){
        System.out.println("So bao danh: "+this.SBD310);
        System.out.println("Ho ten: "+this.HoTen310);
        System.out.println("Dia chi: "+this.DiaChi310);
        System.out.println("Dien uu tien khu vuc: "+this.DienUuTien310);
    }
}
