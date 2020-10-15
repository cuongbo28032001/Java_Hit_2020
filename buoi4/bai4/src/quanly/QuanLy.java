package quanly;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String ten;

    public QuanLy() {
    }

    public QuanLy(String maQL, String ten) {
        this.maQL = maQL;
        this.ten = ten;
    }

    public void NhapQL()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhập mã quản lý: "); maQL = sc.nextLine();
        System.out.print("\tNhập tên quản lý: "); ten = sc.nextLine();
    }

    @Override
    public String toString() {
        return "QuanLy{" +
                "maQL='" + maQL + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }
}
