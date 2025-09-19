
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SinhVien {
    private String hoTen310;
    private String maSV310;
    private Date ngaySinh310;
    private String lop310;

    public String getHoTen() {
        return hoTen310;
    }

    public void setHoTen(String hoTen310) {
        this.hoTen310 = hoTen310;
    }

    public String getMaSV() {
        return maSV310;
    }

    public void setMaSV(String maSV310) {
        this.maSV310 = maSV310;
    }

    public Date getNgaySinh() {
        return ngaySinh310;
    }

    public void setNgaySinh(Date ngaySinh310) {
        this.ngaySinh310 = ngaySinh310;
    }

    public String getLop() {
        return lop310;
    }

    public void setLop(String lop310) {
        this.lop310 = lop310;
    }

    public SinhVien() {
    }

    public SinhVien(String hoTen310, String maSV310, Date ngaySinh310, String lop310) {
        this.hoTen310 = hoTen310;
        this.maSV310 = maSV310;
        this.ngaySinh310 = ngaySinh310;
        this.lop310 = lop310;
    }
    
   private Date strToDate(String strDate){
        Date date=null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = sdf.parse(strDate);    
        } catch (ParseException e){
            System.out.println("Loi dinh dang ngay thang");
        }
        return date;
    }
    private String dateToString(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        String strDate = sdf.format(date);
        return strDate;
    } 
    
    public void NhapTT(Scanner sc) {
	System.out.print("Nhap ho ten: ");
	hoTen310 = sc.nextLine();
	System.out.print("Nhap ma sinh vien: ");
	maSV310 = sc.nextLine();
	System.out.print("Nhap ngay sinh: ");
	String strDate=sc.nextLine();
        ngaySinh310=strToDate(strDate);
	System.out.print("Nhap lop: ");
	lop310 = sc.nextLine();
	}
    
    public void Show(){
        System.out.println("\tHo ten: " + hoTen310);
	System.out.println("\tNgay sinh: " + dateToString(ngaySinh310));
	System.out.println("\tMa sinh vien: " + maSV310);
	System.out.println("\tLop: " + lop310);
    }
}
