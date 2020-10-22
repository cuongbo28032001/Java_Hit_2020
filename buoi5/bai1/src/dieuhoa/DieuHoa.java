package dieuhoa;

import sanpham.SanPham;

import java.util.Scanner;

public class DieuHoa extends SanPham {
    private double congSuat;
    private double giaBan;

    public DieuHoa() {
    }

    public DieuHoa(double congSuat, double giaBan) {
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }


    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.NhapSP();
        System.out.print("Nhập công suất: "); congSuat = sc.nextDouble();
        System.out.print("Nhập giá bán: "); giaBan = sc.nextDouble();
    }

    public void XuatDH()
    {
        super.XuatSP();
        System.out.println("   Công suất: " +congSuat+"KWh"+"   Giá: " +giaBan+ "USD");
    }
}
