package main;

import dieuhoa.DieuHoa;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<DieuHoa>list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập số điều hòa: "); n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("Điều hòa thứ: " +(i+1));
            DieuHoa x = new DieuHoa();
            x.Nhap();
            list.add(x);
        }

        for(DieuHoa i : list)
        {
            i.XuatDH();
        }
    }
}
