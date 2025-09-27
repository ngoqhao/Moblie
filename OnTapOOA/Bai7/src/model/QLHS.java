package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLHS {
    private List<HocSinh> dshs = new ArrayList<>();

    public void themHS(HocSinh hs) {
        dshs.add(hs);
    }

    public void nhapDanhSachHS(Scanner sc) {
        HocSinh hs;
        System.out.print("Nhap vao so luong hoc sinh: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap thong tin cho hoc sinh trong danh sach:");
        for (int i = 0; i < n; i++) {
            System.out.println("Hoc sinh thu " + (i + 1) + " la:");
            hs = new HocSinh();
            hs.NhapTT(sc);
            themHS(hs);
        }
    }

    public void hienThiDanhSach() {
        int n = dshs.size();
        for (int i = 0; i < n; i++) {
            System.out.println("Hoc sinh thu " + (i + 1) + " la:");
            dshs.get(i).Show();
        }
    }

    public void timKiemThongTin(int nam, String que) {
        for (HocSinh hs : dshs) {
            if ((hs.getNgaySinh().getYear() + 1900 == nam) && (que.equals(hs.getQue()))) {
                hs.Show();
            }
        }
    }

    public void timKiemThongTin(String lop) {
        for (HocSinh hs : dshs) {
            if (lop.equals(hs.getLop())) {
                hs.Show();
            }
        }
    }
}
