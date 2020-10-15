package sach;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String nXB;
    private int soTrang;
    private long giaTien;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String nXB, int soTrang, long giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nXB = nXB;
        this.soTrang = soTrang;
        this.giaTien = giaTien;
    }

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        maSach = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        tenSach = sc.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        nXB = sc.nextLine();
        System.out.print("Nhập số trang: ");
        soTrang = sc.nextInt();
        System.out.print("Nhập giá tiền: ");
        giaTien = sc.nextLong();
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach='" + maSach + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", nXB='" + nXB + '\'' +
                ", soTrang=" + soTrang +
                ", giaTien=" + giaTien +
                '}';
    }
}