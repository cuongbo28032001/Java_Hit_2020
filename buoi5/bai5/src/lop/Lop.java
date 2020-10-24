package lop;

import sinhvien.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Lop {
    private String maLH;
    private String tenLH;
    private int day, month, year;
    private ArrayList<SinhVien>list = new ArrayList<>();
    private String giaoVien;
    private int n;

    public Lop() {
    }

    public Lop(String maLH, String tenLH, int day, int month, int year, ArrayList<SinhVien> list, String giaoVien, int n) {
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.day = day;
        this.month = month;
        this.year = year;
        this.list = list;
        this.giaoVien = giaoVien;
        this.n = n;
    }

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<SinhVien> getList() {
        return list;
    }

    public void setList(ArrayList<SinhVien> list) {
        this.list = list;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void NhapLop()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã lớp học: "); maLH = sc.nextLine();
        System.out.print("Nhập tên lớp học: "); tenLH = sc.nextLine();
        System.out.println("Nhập ngày mở lớp");
        System.out.print("\tNhập ngày: "); day = sc.nextInt();
        System.out.print("\tNhập tháng: "); month = sc.nextInt();
        System.out.print("\tNhập năm: "); year = sc.nextInt();
        System.out.print("Nhập tên giáo viên: "); sc.nextLine(); giaoVien = sc.nextLine();
        System.out.print("Nhập số sinh viên trong lớp: "); n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            SinhVien x = new SinhVien();
            x.NhapSV();
            list.add(x);
        }
    }

    public void XuatLop()
    {
        System.out.println("\t\t\t\t---------------------THÔNG TIN LỚP HỌC-------------------");
        System.out.println("Mã lớp: " +maLH);
        System.out.println("Tên lớp:" +tenLH);
        System.out.println("Tên giáo viên: " +giaoVien);
        System.out.println("Ngày mở lớp: " +day+"/"+month+"/"+year);
        System.out.println("\t\t\t\tTHÔNG TIN SINH VIÊN");
        System.out.printf("%10s %10s %15s %20s %20s %22s\n", "MÃ SV", "NGÀNH", "KHÓA", "HỌ TÊN", "QUÊ", "NGÀY SINH");
        for(SinhVien i : list)
        {
            i.XuatSV();
        }

    }

    public void Demk14()
    {
        int count=0;
        for(SinhVien i : list)
        {
            if(i.getKhoa()==14)
                count++;
        }
        if(count==0)
            System.out.println("KHÔNG CÓ SINH VIÊN K14");
        else System.out.println("SỐ SINH VIÊN K14 = "+count);
    }

    public void SapXep()
    {
        for(int i=0; i<list.size()-1; i++)
        {
            if(list.get(i).getKhoa() > list.get(i+1).getKhoa())
            {
                SinhVien temp = list.get(i);
                list.set(i, list.get(i+1));
                list.set((i+1), temp);
            }
        }

        XuatLop();
    }
}
