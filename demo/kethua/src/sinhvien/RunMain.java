package sinhvien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<SinhVien>list = new ArrayList<>();
        SinhVien sv1 = new SinhVien("123", "cuong");
        SinhVien sv2 = new SinhVien("111", "Hưng");
        list.add(sv1);
        list.add(sv2);
        //Collections.swap(list, 0, 1);
        SinhVien temp = list.get(0);
        list.set(0, list.get(1));
        list.set(1, temp);

        for( SinhVien x : list)
        {
            System.out.println(x);
        }

        sv1.HienThi();
    }
}
