
package model;

import java.util.Scanner;

public class TaiLieu {
    private String ID310;
    private String NXB310;
    private int SobanPH310;

    public String getID() {
        return ID310;
    }

    public String getNXB() {
        return NXB310;
    }

    public int getSobanPH() {
        return SobanPH310;
    }

    public void setID(String ID310) {
        this.ID310 = ID310;
    }

    public void setNXB(String NXB310) {
        this.NXB310 = NXB310;
    }

    public void setSobanPH(int SobanPH310) {
        this.SobanPH310 = SobanPH310;
    }

    public TaiLieu() {};

    public TaiLieu(String ID310, String NXB310, int SobanPH310) {
        this.ID310 = ID310;
        this.NXB310 = NXB310;
        this.SobanPH310 = SobanPH310;
    }
    
    public void Nhap(Scanner sc){
        System.out.println("Nhap ma tai lieu: ");
        ID310=sc.nextLine();
        System.out.println("Nhap ten NXB: ");
        NXB310=sc.nextLine();
        System.out.println("Nhap so ban phat hanh: ");
        SobanPH310=sc.nextInt();
    }
    
    public void Show(){
        System.out.println("Ma tai lieu: "+this.ID310);
        System.out.println("Nha xuat ban: "+this.NXB310);
        System.out.println("So ban phat hanh: "+this.SobanPH310);
    } 
}
