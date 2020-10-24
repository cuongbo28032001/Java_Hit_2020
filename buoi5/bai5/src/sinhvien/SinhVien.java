package sinhvien;

import nguoi.Person;

import java.util.Scanner;

public class SinhVien extends Person {
    private String maSV;
    private String nganh;
    private int khoa;

    public SinhVien() {
    }

    public SinhVien(String maSV, String nganh, int khoa) {
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoa = khoa;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoa() {
        return khoa;
    }

    public void setKhoa(int khoa) {
        this.khoa = khoa;
    }

    public void NhapSV()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: "); maSV = sc.nextLine();
        System.out.print("Nhập ngành học: "); nganh = sc.nextLine();
        System.out.print("Nhập khóa học: "); khoa = sc.nextInt();
        super.NhapPerson();
    }

    public void XuatSV()
    {
        System.out.printf("%10s %10s %15d", maSV, nganh, khoa);
        super.XuatPerson();
    }
}
