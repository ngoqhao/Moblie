package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
    private int soMuon310;
    private Date ngayMuon310;
    private Date hanTra310;
    private String soHieu310;

    public Date getHanTra() {
            return hanTra310;
    }

    public TheMuon() {}

    public TheMuon(int soMuon310, Date ngayMuon310, Date hanTra310, String soHieu310, String hoTen310, String maSV310, Date ngaySinh310, String lop310) {
        super(hoTen310, maSV310, ngaySinh310, lop310);
        this.soMuon310 = soMuon310;
        this.ngayMuon310 = ngayMuon310;
        this.hanTra310 = hanTra310;
        this.soHieu310 = soHieu310;
    }

    @Override
    public void NhapTT(Scanner sc) {
        super.NhapTT(sc);
        System.out.print("Nhap so muon: ");
        soMuon310 = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ngay muon: ");
        String strNgayMuon = sc.nextLine();
        ngayMuon310 = strToDate(strNgayMuon);
        System.out.println("Nhap ngay tra: ");
        String strNgayTra = sc.nextLine();
        hanTra310 = strToDate(strNgayTra);
        System.out.println("Nhap so hieu: ");
        soHieu310 = sc.nextLine();
    }

    private Date strToDate(String strNgayMuon) {
            Date date = null;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                date = sdf.parse(strNgayMuon);
            } catch (ParseException e) {
                System.out.println("Loi dinh dang ngay thang!");
            }
            return date;
    }
    private String dateToString(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        String strDate = sdf.format(date);

        return strDate; 
    } 
    public void Show() {
        super.Show();
        System.out.println("\tSo phieu muon: " + soMuon310);
        System.out.println("\tNgay muon: " + dateToString(ngayMuon310));
        System.out.println("\tHan tra: " + dateToString(hanTra310));
        System.out.println("\tSo hieu: " + soHieu310);
    }
}
