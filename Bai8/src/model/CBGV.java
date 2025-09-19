package model;

import java.util.Date;
import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuoc tinh
	private double luongCung310;
	private double thuong310;
	private double phat310;
	private double luongThucLinh310;

	public double getLuongThucLinh() {
            return luongThucLinh310;
	}
        
	public CBGV() {}

        public CBGV(double luongCung310, double thuong310, double phat310, String Hoten310, Date NgaySinh310, String Que310) {
            super(Hoten310, NgaySinh310, Que310);
            this.luongCung310 = luongCung310;
            this.thuong310 = thuong310;
            this.phat310 = phat310;
        }
        @Override
	public void NhapTT(Scanner sc) {
            super.NhapTT(sc);
            System.out.print("\tNhap luong cung: ");
            luongCung310 = sc.nextDouble();
            sc.nextLine();
            System.out.print("\tNhap thuong: ");
            thuong310 = sc.nextDouble();
            sc.nextLine();

            System.out.print("\tNhap phat: ");
            phat310 = sc.nextDouble();
            sc.nextLine();
            luongThucLinh310 = luongCung310 + thuong310 - phat310;
	}
	@Override
	public void Show() {
            super.Show();
            String luongC = String.format("%.0f", luongCung310);
            System.out.println("\tLuong cung: " + luongC);
            System.out.println("\tThuong: " + thuong310);
            System.out.println("\tPhat: " + phat310);
            String luongStr = String.format("%.0f", luongThucLinh310);
            System.out.println("\tLuong thuc linh: " + luongStr);
	}
}
