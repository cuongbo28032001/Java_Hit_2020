package hang;

import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private double donGia;

    public Hang() {
    }

    public Hang(String maHang, String tenHang, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }

    public void NhapHang()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhập mã hàng: "); maHang = sc.nextLine();
        System.out.print("\tNhập tên hàng: "); tenHang = sc.nextLine();
        System.out.print("\tNhập đơn giá: "); donGia = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Hang{" +
                "maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", donGia=" + donGia +
                '}';
    }
}
