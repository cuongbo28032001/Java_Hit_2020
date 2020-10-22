package sanpham;


import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private double donGia;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int soLuong, double donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public void NhapSP()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhập mã SP: "); maSP = sc.nextLine();
        System.out.print("\tNhập tên SP: "); tenSP = sc.nextLine();
        System.out.print("\tNhập số lượng: "); soLuong = sc.nextInt();
        System.out.print("\tNhập đơn giá: "); donGia = sc.nextDouble();
    }

    public void XuatSP()
    {
        System.out.println("Mã SP: " +maSP+ " - Tên SP: " +tenSP+ " - Số lượng: " +soLuong+ " - Đơn giá: " +donGia+ " Thành tiền: " +(soLuong*donGia));
    }
}
