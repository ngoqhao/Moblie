
package model;

import static java.lang.Math.abs;
import java.util.Scanner;
public class PhanSo {
    private int Tu_310;
    private int Mau_310;

    public int getTu() {
        return Tu_310;
    }

    public int getMau() {
        return Mau_310;
    }

    public void setTu(int Tu_310) {
        this.Tu_310 = Tu_310;
    }

    public void setMau(int Mau_310) {
        this.Mau_310 = Mau_310;
    }  

    public PhanSo(){};

    public PhanSo(int Tu_310, int Mau_310) {
        this.Tu_310 = Tu_310;
        this.Mau_310 = Mau_310;
    }
    
    public void Nhap(Scanner sc310){
        do {
            System.out.println("Nhap tu: ");
            Tu_310=sc310.nextInt();
            System.out.println("Nhap mau: ");
            Mau_310=sc310.nextInt();
           
            if (Mau_310==0)
                System.out.println("Sai định dạng! Hãy nhập lại");
        } while (Mau_310==0);
    }
    public void Show(){
        if (Tu_310*Mau_310<0)
            System.out.println("-"+abs(Tu_310)+"/"+abs(Mau_310));
        else
            System.out.println(+abs(Tu_310)+"/"+abs(Mau_310));
    }
    public PhanSo Cong(PhanSo ps310){
        int b310=this.Mau_310 * ps310.getMau();
        int a310= this.Tu_310*ps310.getMau()+ps310.getTu()*this.Mau_310;
        return new PhanSo(a310,b310);
    }
    public PhanSo Tru(PhanSo ps310){
        int b310=this.Mau_310* ps310.getMau();
        int a310= this.Tu_310*ps310.getMau()- ps310.getTu()*this.Mau_310;
        return new PhanSo(a310,b310);
    }
    public PhanSo Nhan(PhanSo ps310){
        int b310=this.Mau_310* ps310.getMau();
        int a310= this.Tu_310*ps310.getTu();
        return new PhanSo(a310,b310);
    }
    public PhanSo Chia(PhanSo ps310){
        int b310=this.Mau_310* ps310.getTu();
        int a310= this.Tu_310*ps310.getMau();
        return new PhanSo(a310,b310);
    }
    public int UCLN(int a310,int b310){
        int r310;
        a310=abs(a310);
        b310=abs(b310);
        r310= a310 % b310;
        while (r310!=0){
            a310=b310;
            b310=r310;
            r310=a310 % b310;
        }
        return b310;
    }
    public boolean KiemTraTG(){
        int r310= UCLN(Tu_310,Mau_310);
        if (r310 ==1 ) 
            return true;
        else 
            return false;
    }
    public void DangTG(){
        int r310= UCLN(Tu_310,Mau_310);
        Tu_310 = Tu_310 / r310;
        Mau_310 = Mau_310 /r310;
    }    
}
