package bai6;

import java.util.Scanner;
import model.KhachSan;

public class Bai6 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	KhachSan ql = new KhachSan();
        int choice;
        do{
            System.out.println("======================================");
            System.out.println("1.Nhap danh sach\n2.Xem thong tin cac khach hang\n3.Tinh tien\n0.Thoat");
            choice=sc.nextInt();
            switch(choice){
                case 1: 
                    ql=new KhachSan();
                    ql.nhapDanhSach(sc);
                    System.out.println("Nhap thanh cong");
                    break;
                case 2:
                    ql.hienThiDanhSach();
                    break;
                case 3:
                    System.out.print("Nhap vao khach tro can tinh tien: ");
                    int cmnd = sc.nextInt();
                    System.out.println("==> Tong tien la: " + ql.tinhTien(cmnd));
                    break;
            }
        }while (choice !=0);
    }
}
