package model;

import java.util.Scanner;

public class BienLai extends KhachHang {
    private int chiSoMoi310;
    private int chiSoCu310; 
    private double tien310;

    public BienLai() {}

    public BienLai(int chiSoMoi310, int chiSoCu310, double tien310) {
        this.chiSoMoi310 = chiSoMoi310;
        this.chiSoCu310 = chiSoCu310;
        this.tien310 = tien310;
    }

    public BienLai(int chiSoMoi310, int chiSoCu310, double tien310, String tenChuHo310, int soNha310, String maCongTo310) {
        super(tenChuHo310, soNha310, maCongTo310);
        this.chiSoMoi310 = chiSoMoi310;
        this.chiSoCu310 = chiSoCu310;
        this.tien310 = tien310;
    }
        
    public void NhapTT(Scanner sc) {
	super.NhapTT(sc);
	System.out.print("Nhap chi so moi: ");
	chiSoMoi310 = sc.nextInt();
	sc.nextLine();
	System.out.print("Nhap chi so cu: ");
	chiSoCu310 = sc.nextInt();
	sc.nextLine();
	tien310 = (chiSoMoi310 - chiSoCu310) * 750;
    }

    public void Show() {
	super.Show();
	System.out.println("\tChi so moi: " + chiSoMoi310);
	System.out.println("\tChi so cu: " + chiSoCu310);
	System.out.println("\tTien: : " + tien310);
    }
}
