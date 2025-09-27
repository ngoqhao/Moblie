package model;

import java.util.Scanner;

public class KhachHang {
    private String tenChuHo310;
    private int soNha310;
    private String maCongTo310;

    public String getTenChuHo() {
        return tenChuHo310;
    }

    public void setTenChuHo(String tenChuHo310) {
        this.tenChuHo310 = tenChuHo310;
    }

    public int getSoNha() {
        return soNha310;
    }

    public void setSoNha(int soNha310) {
        this.soNha310 = soNha310;
    }

    public String getMaCongTo() {
        return maCongTo310;
    }

    public void setMaCongTo(String maCongTo310) {
        this.maCongTo310 = maCongTo310;
    }
        
    public KhachHang() {}

    public KhachHang(String tenChuHo310, int soNha310, String maCongTo310) {
        this.tenChuHo310 = tenChuHo310;
        this.soNha310 = soNha310;
        this.maCongTo310 = maCongTo310;
    }
    
    public void NhapTT(Scanner sc) {
	System.out.print("Nhap ten chu ho: ");
	tenChuHo310 = sc.nextLine();
	System.out.print("Nhap so nha: ");
	soNha310 = sc.nextInt();
	sc.nextLine();
	System.out.print("Nhap ma cong to: ");
	maCongTo310 = sc.nextLine();
    }
    
    public void Show() {
	System.out.println("\tTen chu ho: " + tenChuHo310);
	System.out.println("\tSo nha: " + soNha310);
	System.out.println("\tMa cong to: " + maCongTo310);
    }
}
