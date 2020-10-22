package demo;

import java.util.Scanner;

public class nguoi {
    private String theCanCuoc;
    private String gioiTinh;
    private String hoTen;

    public nguoi() {
    }

    public nguoi(String theCanCuoc, String gioiTinh, String hoTen) {
        this.theCanCuoc = theCanCuoc;
        this.gioiTinh = gioiTinh;
        this.hoTen = hoTen;
    }

    public void NhapNguoi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập thẻ căn cước: ");
        theCanCuoc = sc.nextLine();
        System.out.print("Nhập tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh = sc.nextLine();
    }

    public void XuatNguoi()
    {
        System.out.println("Thẻ căn cước: " +theCanCuoc);
        System.out.println("Tên: " +hoTen);
        System.out.println("Giới tính:" +gioiTinh);
    }
}
