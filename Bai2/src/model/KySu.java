/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Hi
 */
public class KySu extends CanBo{
    private String NganhDT310;

    public String getNganhDT310() {
        return NganhDT310;
    }

    public void setNganhDT310(String NganhDT310) {
        this.NganhDT310 = NganhDT310;
    }

    public KySu() {
    }

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
