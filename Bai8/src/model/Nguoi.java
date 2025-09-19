
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String Hoten310;
    private Date NgaySinh310;
    private String Que310;

    public String getHoten() {
        return Hoten310;
    }

    public void setHoten(String Hoten310) {
        this.Hoten310 = Hoten310;
    }

    public Date getNgaySinh(){
        return NgaySinh310;
    }

    public void setNgaySinh(Date NgaySinh310) {
        this.NgaySinh310 = NgaySinh310;
    }

    public String getQue() {
        return Que310;
    }

    public void setQue(String Que310) {
        this.Que310 = Que310;
    }

    public Nguoi() {
    }

    public Nguoi(String Hoten310, Date NgaySinh310, String Que310) {
        this.Hoten310 = Hoten310;
        this.NgaySinh310 = NgaySinh310;
        this.Que310 = Que310;
    }
    
    public void NhapTT(Scanner sc){
        System.out.println("Nhap ho ten: ");
        Hoten310=sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        String strDate=sc.nextLine();
        NgaySinh310=strToDate(strDate);
        System.out.println("Nhap que quan: ");
        Que310=sc.nextLine();
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
    public void Show()
    {
        System.out.println("Ho ten: "+this.Hoten310);
        System.out.println("Ngay sinh: "+dateToString(this.NgaySinh310));
        System.out.println("Nghe nghiep: "+this.Que310);
    }
    
    
}
