package sanpham;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSp;
    private String hang;
    private int day, month, year;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSp, String hang, int day, int month, int year) {
        this.maSP = maSP;
        this.tenSp = tenSp;
        this.hang = hang;
        this.day = day;
        this.month = month;
        this.year = year;
    }



    public void NhapSP()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin sản phẩm");
        System.out.print("Nhập mã sản phẩm: "); maSP = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: "); tenSp = sc.nextLine();
        System.out.print("Nhập hãng: "); hang = sc.nextLine();
        System.out.println("Nhập ngày sản xuất");
        System.out.print("\tNhập ngày: "); day = sc.nextInt();
        System.out.print("\tNhập tháng: "); month = sc.nextInt();
        System.out.print("\tNhập năm: "); year = sc.nextInt();
    }

    public void XuatSP()
    {
        System.out.print("Mã: " +maSP+ "   Tên: " +tenSp+ "   Hãng: " +hang+ "   Ngày sx: " +day+"/"+month+"/"+year);
    }
}
