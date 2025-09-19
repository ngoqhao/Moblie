
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class KhuPho {
    private List<HoDan> dshd = new ArrayList<>();
    
    public void ThemHD(HoDan HD310){
        dshd.add(HD310);
    }
    public void Nhap(Scanner sc){
        System.out.println("Nhap vao so ho dan: ");
        int so310=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap thong tin tung ho dan: ");
        for (int i=0;i<so310;i++){
            int j=i+1;
            System.out.println("Ho dan thu "+j+":");
            HoDan HD310= new HoDan();
            HD310.NhapTT(sc);
            ThemHD(HD310);
        }
    }
    public void hienThiDanhSach(){
        int n=dshd.size();
        for (int i=0;i<n;i++){
            int j=i+1;
            System.out.println("Ho dan thu "+j+":");
            dshd.get(i).Show(); 
        }     
    }
    public void Tim(){
        Date now310=new Date();
        int y_now310=now310.getYear()+1900;
        Nguoi[] dstv=null;
        
        for (HoDan hoDan: dshd){
            dstv=hoDan.getList();
            for (int i=0;i<hoDan.getSoTV();i++)
                if (y_now310-(dstv[i].getNgaySinh().getYear()+1900)==80){
                    hoDan.Show();
                }
        }
    }
}
