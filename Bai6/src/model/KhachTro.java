package model;

import java.util.Scanner;

public class KhachTro extends Nguoi {

    private int soNgayTro310;
    private String loaiPhong310;
    private double giaPhong310;

    public int getSoNgayTro() {
        return soNgayTro310;
    }

    public double getGiaPhong() {
        return giaPhong310;
    }

    public KhachTro() {}

    public KhachTro(String hoTen310, int CMND310, int soNgayTro310, String loaiPhong310, double giaPhong310) {
        this.hoTen310 = hoTen310;
        this.CMND310 = CMND310;
        this.soNgayTro310 = soNgayTro310;
        this.loaiPhong310 = loaiPhong310;
        this.giaPhong310 = giaPhong310;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap so ngay tro: ");
        soNgayTro310 = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap loai phong: ");
        loaiPhong310 = sc.nextLine();
        System.out.print("Nhap gia phong: ");
        giaPhong310 = sc.nextDouble();
        sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo ngay tro: " + soNgayTro310);
        System.out.println("\tLoai phong: " + loaiPhong310);
        System.out.println("\tGia phong: " + giaPhong310);
    }
}
