package phongmay;

import may.May;
import quanly.QuanLy;

import java.util.Arrays;
import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private float dt;
    private QuanLy x;
    private May[] y;
    private int n;

    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, float dt, QuanLy x, May[] y, int n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dt = dt;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phòng: "); maPhong = sc.nextLine();
        System.out.print("Nhập tên phòng: "); tenPhong = sc.nextLine();
        System.out.print("Nhập diện tích phòng: "); dt = sc.nextInt();
        System.out.println("Nhập quản lý");
        x = new QuanLy();
        x.NhapQL();
        System.out.print("Nhập số máy: "); n = sc.nextInt();
        y = new May[n];
        System.out.println("Nhập thông tin máy");
        for(int i=0; i<n; i++)
        {
            y[i] = new May();
            y[i].NhapMay();
        }
    }

    @Override
    public String toString() {
        return "PhongMay{" +
                "maPhong='" + maPhong + '\'' +
                ", tenPhong='" + tenPhong + '\'' +
                ", dt=" + dt +
                ", x=" + x +
                ", y=" + Arrays.toString(y) +
                ", n=" + n +
                '}';
    }


}
