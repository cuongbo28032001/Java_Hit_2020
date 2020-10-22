package phieu;

import datetime.DateTime;
import sanpham.SanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private String tenPhieu;
    private DateTime a;
    private ArrayList<SanPham>x = new ArrayList<>();
    private int n;

    public Phieu() {
    }

    public Phieu(String maPhieu, String tenPhieu, DateTime a, ArrayList<SanPham> x, int n) {
        this.maPhieu = maPhieu;
        this.tenPhieu = tenPhieu;
        this.a = a;
        this.x = x;
        this.n = n;
    }

    public void NhapPhieu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phiếu: "); maPhieu = sc.nextLine();
        System.out.print("Nhập tên phiếu: "); tenPhieu = sc.nextLine();
        a = new DateTime();
        a.NhapDate();
        System.out.print("Nhập số sản phẩm: "); n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("Nhập sản phẩm thứ: " +(i+1));
            SanPham temp = new SanPham();
            temp.NhapSP();
            x.add(temp);
        }
    }

    public void XuatPhieu()
    {
        System.out.println("Mã phiếu: " +maPhieu);
        System.out.println("Tên phiếu: " +tenPhieu);
        a.XuatDate();
        for(int i=0; i < x.size(); i++)
        {
            x.get(i).XuatSP();
        }

    }

}
