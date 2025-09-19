/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Hi
 */
public class Bao extends TaiLieu{
    private String NgayPH310;

    public String getNgayPH() {
        return NgayPH310;
    }

    public void setNgayPH(String NgayPH310) {
        this.NgayPH310 = NgayPH310;
    }

    public Bao() {
    }

    public Bao(String NgayPH310, String ID310, String NXB310, int SobanPH310) {
        super(ID310, NXB310, SobanPH310);
        this.NgayPH310 = NgayPH310;
    }
    
    @Override
    public void Nhap(Scanner sc){
        super.Nhap(sc);
        sc.nextLine();
        System.out.println("Nhap ngay phat hanh: ");
        NgayPH310=sc.nextLine();
    }
    @Override
    public void Show(){
        super.Show();
        System.out.println("Ngay phat hanh: "+this.NgayPH310);
    }
    
    
}
