
package model;

import java.util.Scanner;

public class CanBo {
    private String Hoten310;
    private String NgaySinh310;
    private String DiaChi310;

    public String getHoten() {
        return Hoten310;
    }

    public String getNgaySinh() {
        return NgaySinh310;
    }

    public String getDiaChi() {
        return DiaChi310;
    }

    public void setHoten(String Hoten310) {
        this.Hoten310 = Hoten310;
    }

    public void setNgaySinh(String NgaySinh310) {
        this.NgaySinh310 = NgaySinh310;
    }

    public void setDiaChi(String DiaChi310) {
        this.DiaChi310 = DiaChi310;
        
    }
    public CanBo(){};

    public CanBo(String Hoten310, String NgaySinh310, String DiaChi310) {
        this.Hoten310 = Hoten310;
        this.NgaySinh310 = NgaySinh310;
        this.DiaChi310 = DiaChi310;
    }
    
    public void NhapTT(Scanner sc){
        System.out.println("Nhap ho ten can bo: ");
        Hoten310=sc.nextLine();
        System.out.println("Nhap ngay sinh (dd/MM/yyyy: ");
        NgaySinh310 = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        DiaChi310=sc.nextLine();
    }
    public void Show(){
        System.out.println("Ho ten: "+this.Hoten310);
        System.out.println("Ngay sinh: "+this.NgaySinh310);
        System.out.println("Dia chi: "+this.DiaChi310);
    }
    
}
