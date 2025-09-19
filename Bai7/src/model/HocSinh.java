package model;
import java.util.Scanner;
public class HocSinh extends Nguoi {
    private String lop310;
    private String khoaHoc310;
    private String kyHoc310;
    public String getLop() {
        return lop310;
    }
    public HocSinh() {}
    public HocSinh(String hoTen310, String lop310, String khoaHoc310, String kyHoc310) {
        this.Hoten310 = hoTen310;
        this.lop310 = lop310;
        this.khoaHoc310 = khoaHoc310;
        this.kyHoc310 = kyHoc310;
    }
    public void NhapTT(Scanner sc) {
        super.NhapTT(sc);
        System.out.print("Nhap lop: ");
        lop310 = sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        khoaHoc310 = sc.nextLine();
        System.out.print("Nhap ky hoc: ");
        kyHoc310 = sc.nextLine();
    }
    public void Show() {
        super.Show();
        System.out.println("Lop: " + lop310);
        System.out.println("Khoa hoc: " + khoaHoc310);
        System.out.println("Ky hoc: " + kyHoc310);
    }	
}
