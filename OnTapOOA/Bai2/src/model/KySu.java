
package model;

import java.util.Scanner;

public class KySu extends CanBo{
    private String NganhDT310;
    
    public String getNganhDT() {
        return NganhDT310;
    }
    public void setNganhDT(String NganhDT310) {
        this.NganhDT310 = NganhDT310;
    }

    public KySu() {}
    public KySu(String NganhDT310, String Hoten310, String NgaySinh310, String DiaChi310) {
        super(Hoten310, NgaySinh310, DiaChi310);
        this.NganhDT310 = NganhDT310;
    }
    @Override
    public void NhapTT(Scanner sc){
        super.NhapTT(sc);
        System.out.println("Nhap nganh dao tao: ");
        NganhDT310=sc.nextLine();
    }
    @Override
    public void Show(){
        super.Show();
        System.out.println("Nganh dao tao: "+this.NganhDT310);
    }        
}
