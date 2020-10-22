package person;

import java.util.Scanner;

public class KySu extends Preson {
    private String Nganh;
    private int namTn;

    public KySu() {
    }

    public KySu(String nganh, int namTn) {
        Nganh = nganh;
        this.namTn = namTn;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
    }

    public int getNamTn() {
        return namTn;
    }

    public void setNamTn(int namTn) {
        this.namTn = namTn;
    }

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhập họ tên: "); hoTen = sc.nextLine();
        System.out.print("\tNhập ngay sinh: "); ngaySinh = sc.nextLine();
        System.out.print("\tNhập quê quán: "); queQuan = sc.nextLine();
        System.out.print("\tNhập ngành: "); Nganh = sc.nextLine();
        System.out.print("\tNhập năm tốt nghiệp: "); namTn = sc.nextInt();
    }

    public void Xuat()
    {
        System.out.println("Tên: " +hoTen+ " - Ngày Sinh: " +ngaySinh+" - Tên: " +hoTen+" - Ngành: " +Nganh+" - Năm tốt nghiệp: " +namTn);
    }

}
