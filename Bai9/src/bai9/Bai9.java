package bai9;

import java.util.Scanner;

import model.QuanLy;

public class Bai9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy ql = new QuanLy();
        int choice;
        do{
            System.out.println("======================================");
            System.out.println("1.Nhap\n2.Xem danh sach can tra cuoi thang\n0.Thoat");
            choice=sc.nextInt();
            switch(choice){
                case 1: 
                    ql.nhapDanhSach(sc);
                    System.out.println("Nhap thanh cong");
                    break;
                case 2:
                    ql.hienThiDanhSachTraCuoiThang();
                    break;
            }
        }while (choice !=0);
    }

}
