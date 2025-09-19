package bai8;

import java.util.Scanner;

import model.QuanLy;

public class Bai8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy ql = new QuanLy();
        int choice;
        do{
            System.out.println("======================================");
            System.out.println("1.Nhap can bo giao vien\n2.Xem thong tin\n3.Xem can bo co luong >8tr\n0.Thoat");
            choice=sc.nextInt();
            switch(choice){
                case 1: 
                    ql.nhapDanhSach(sc);
                    System.out.println("Nhap thanh cong");
                    break;
                case 2:
                    ql.hienThiDanhSach();
                    break;
                case 3:
                    ql.timKiem(8000000);
                    break;
            }
        }while (choice !=0);
    }
}
