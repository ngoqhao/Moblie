
package model;

import java.util.Scanner;

public class Sach extends TaiLieu{
    private String TenTG310;
    private int page310;

    public String getTenTG() {
        return TenTG310;
    }

    public int getPage() {
        return page310;
    }

    public void setTenTG(String TenTG310) {
        this.TenTG310 = TenTG310;
    }

    public void setPage(int page310) {
        this.page310 = page310;
    }

    public Sach() {
    }

    public Sach(String TenTG310, int page310, String ID310, String NXB310, int SobanPH310) {
        super(ID310, NXB310, SobanPH310);
        this.TenTG310 = TenTG310;
        this.page310 = page310;
    }
    
    @Override
    public void Nhap(Scanner sc){
        super.Nhap(sc);
        sc.nextLine();
        System.out.println("Nhap ten tac gia: ");
        TenTG310=sc.nextLine();
        System.out.println("Nhap so trang: ");
        page310=sc.nextInt();
    }
    @Override
    public void Show(){
        super.Show();
        System.out.println("Ten tac gia: "+this.TenTG310);
        System.out.println("So trang: "+this.page310);
    }
}
