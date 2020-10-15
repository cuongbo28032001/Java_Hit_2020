package nhansu;

import date.Date;

import java.util.Scanner;

public class NhanSu {
    private String maNS;
    private String hoTen;
    private Date ns;

    public NhanSu() {
    }

    public NhanSu(String maNS, String hoTen, Date ns) {
        this.maNS = maNS;
        this.hoTen = hoTen;
        this.ns = ns;
    }

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân sự: "); maNS = sc.nextLine();
        //sc.nextLine();
        System.out.print("Nhập họ tên: "); hoTen = sc.nextLine();
        ns = new Date();
        ns.NhapDate();
    }

    @Override
    public String toString() {
        return "Nhân sự{" +
                "Mã nhân sự='" + maNS + '\'' +
                ", Họ tên='" + hoTen + '\'' +
                ", Ngày sinh=" + ns +
                '}';
    }
}
