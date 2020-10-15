package runmain;

import sach.Sach;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> list = new ArrayList<>();
        int n;
        System.out.print("Nhập số sách: "); n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("Nhập sách thứ: " + (i+1));
            Sach x = new Sach();
            x.Nhap();
            list.add(x);
        }

        System.out.println("Danh sách vừa nhập vào là");

        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i).toString());
        }
    }
}

