package main;

import lop.Lop;

public class RunMain {
    public static void main(String[] args) {
        Lop a = new Lop();
        a.NhapLop();
        a.XuatLop();
        System.out.println("\n---------------------KIỂM TRA SỐ SINH VIÊN K14-----------------------");
        a.Demk14();
        System.out.println("\n\t\t---------------------SAU SẮP XẾP-----------------------");
        a.SapXep();
    }
}