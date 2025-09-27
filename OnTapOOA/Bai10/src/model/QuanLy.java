package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLy {
    private List<BienLai> ds = new ArrayList<>();
    public void themBienLai(BienLai bienLai310) {
	ds.add(bienLai310);    
    }
    public void nhapDanhSachBL(Scanner sc) {
        BienLai bienLai310;
	System.out.print("Nhap vao so luong bien lai: ");
	int n = sc.nextInt();
	sc.nextLine();
	System.out.println("Nhap vao danh sach bien lai:");
	for (int i = 0; i < n; i++) {
            System.out.println("Bien lai thu " + (i + 1) + " la:");
            bienLai310 = new BienLai();
		bienLai310.NhapTT(sc);
		themBienLai(bienLai310);
	}
    }
    public void hienThiDanhSach() {
	for (int i = 0; i < ds.size(); i++) {
            System.out.println("Bien lai thu " + (i + 1) + " la:");
            ds.get(i).Show();
            System.out.println();
	}
    }
}
