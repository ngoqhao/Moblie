package bai7;

import java.util.Scanner;

import model.QLHS;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        QLHS list=new QLHS();

        list.nhapDanhSachHS(sc);
        System.out.println("========================================");
        System.out.println("Nhung hoc sinh sinh nam 1985 va que Thai Nguyen la:");
        list.timKiemThongTin(1985, "Thai Nguyen");
        System.out.println("========================================");
        System.out.println("Nhung hoc sinh hoc lop 10A1 la:");
        list.timKiemThongTin("10A1");

    }

}
