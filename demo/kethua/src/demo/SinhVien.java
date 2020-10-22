package demo;

import java.util.Scanner;

public class SinhVien extends nguoi{
    private String maSinhVien;
    private String nganhHoc;

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.NhapNguoi();
        System.out.print("Nhập mã sinh viên: ");
        maSinhVien = sc.nextLine();
        System.out.print("Nhập ngành học: ");
        nganhHoc = sc.nextLine();
    }

    public void Xuat()
    {
        super.XuatNguoi();
        System.out.println("Mã sinh viên: " +maSinhVien);
        System.out.println("Ngành học: " +nganhHoc);
    }


}
