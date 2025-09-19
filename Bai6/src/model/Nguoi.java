package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen310;
    protected Date ngaySinh310;
    protected int CMND310;

    public int getCMND() {
            return CMND310;
    }

    public Nguoi() {}

    public Nguoi(String hoTen310, Date ngaySinh310, int CMND310) {
        this.hoTen310 = hoTen310;
        this.ngaySinh310 = ngaySinh310;
        this.CMND310 = CMND310;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen310 = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String strDate = sc.nextLine();
        ngaySinh310 = strToDate(strDate);
        System.out.print("Nhap CMND: ");
        CMND310 = sc.nextInt();
    }

    private Date strToDate(String strDate) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
                date = sdf.parse(strDate);
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

    public void hienThiThongTin() {
            System.out.println("\tHo ten: " + hoTen310);
            System.out.println("\tNgay sinh: " + dateToString(ngaySinh310));
            System.out.println("\tCMND: " + CMND310);
    }
	
}
