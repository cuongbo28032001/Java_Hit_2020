package phieu;

import hang.Hang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private Hang[] x;
    private int n;

    public Phieu() {
    }

    public Phieu(String maPhieu, Hang[] x, int n) {
        this.maPhieu = maPhieu;
        this.x = x;
        this.n = n;
    }



    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phiếu: "); maPhieu = sc.nextLine();
        System.out.print("Nhập số mặt hàng: "); n = sc.nextInt();

        x = new Hang[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Mặt hàng thứ: " +(i+1));
            x[i] = new Hang();
            x[i].NhapHang();
        }


    }

    @Override
    public String toString() {
        return "Phieu{" +
                "maPhieu='" + maPhieu + '\'' +
                ", x=" + Arrays.toString(x) +
                '}';
    }
}
