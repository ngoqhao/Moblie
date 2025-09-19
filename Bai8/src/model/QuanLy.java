package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLy {

    private List<CBGV> ds= new ArrayList<>() ;

    public QuanLy() {}

    public void themCBGV(CBGV canBo310) {
            ds.add(canBo310);
    }

    public void nhapDanhSach(Scanner sc) {
            CBGV canBo310;
            System.out.print("Nhap vao so luong can bo: ");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap vao danh sach:");
            for (int i = 0; i < n; i++) {
                System.out.println("Can bo thu " + (i + 1) + " la:");
                canBo310 = new CBGV();
                canBo310.NhapTT(sc);
                themCBGV(canBo310);
            }
    }

    public void hienThiDanhSach() {
        for (CBGV cb : ds) {
            cb.Show();
        }
    }
    public void timKiem(double luong) {
        for (CBGV cb : ds) {
            if (cb.getLuongThucLinh() >= luong) {
                cb.Show();
            }
        }
    }
}
