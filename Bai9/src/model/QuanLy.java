package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLy {
    private List<TheMuon> ds = new ArrayList<>();
    public void themTheMuon(TheMuon theMuon310) {
        ds.add(theMuon310);
    }
    public void nhapDanhSach(Scanner sc) {
        TheMuon theMuon;
        System.out.print("Nhap vao so luong the muon: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao danh sach:");
        for (int i = 0; i < n; i++) {
            System.out.println("The muon thu " + (i + 1) + " la:");
            theMuon = new TheMuon();
            theMuon.NhapTT(sc);
            themTheMuon(theMuon);
        }
    }
    public void hienThiDanhSachTraCuoiThang() {
        for (TheMuon the : ds) {
            if (the.getHanTra().getDate() == 31 || the.getHanTra().getDate() == 30) {
                the.Show();
            }
        }
    }
}
