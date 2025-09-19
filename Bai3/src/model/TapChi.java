
package model;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int SoPH310;
    private int ThangPH310;

    public int getSoPH() {
        return SoPH310;
    }

    public int getThangPH() {
        return ThangPH310;
    }

    public void setSoPH(int SoPH310) {
        this.SoPH310 = SoPH310;
    }

    public void setThangPH(int ThangPH310) {
        this.ThangPH310 = ThangPH310;
    }

    public TapChi() {
    }

    public TapChi(int SoPH310, int ThangPH310, String ID310, String NXB310, int SobanPH310) {
        super(ID310, NXB310, SobanPH310);
        this.SoPH310 = SoPH310;
        this.ThangPH310 = ThangPH310;
    }

    @Override
    public void Nhap(Scanner sc){
        super.Nhap(sc);
        System.out.println("Nhap so phat hanh: ");
        SoPH310=sc.nextInt();
        System.out.println("Nhap thang phat hanh: ");
        ThangPH310=sc.nextInt();
    }
    @Override
    public void Show(){
        super.Show();
        System.out.println("So phat hanh: "+this.SoPH310);
        System.out.println("Thang phat hanh: "+this.ThangPH310);
    }   
}
