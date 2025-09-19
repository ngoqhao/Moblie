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
public class NhanVien extends CanBo {
    private String work310;

    public String getWork310() {
        return work310;
    }

    public void setWork310(String work310) {
        this.work310 = work310;
    }

    public NhanVien(String work310) {
        this.work310 = work310;
    }
    public NhanVien(){};
    
    public NhanVien(String work310, String Hoten310, String NgaySinh310, String DiaChi310) {
        super(Hoten310, NgaySinh310, DiaChi310);
        this.work310 = work310;
    }
    
    @Override
    public void NhapTT(Scanner sc){
        super.NhapTT(sc);
        System.out.println("Nhap cong viec: ");
        work310=sc.nextLine();
    }
    @Override
    public void Show(){
        super.Show();
        System.out.println("Cong viec: "+this.work310);
    }
    
    
}
