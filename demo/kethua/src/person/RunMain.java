package person;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<KySu>list = new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số kỹ sư: "); n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("Nhập ký sư thứ: " +(i+1));
            KySu k1 = new KySu();
            k1.Nhap();
            list.add(k1);
        }

        for(KySu x : list)
        {
            x.Xuat();
        }
        int max = list.get(0).getNamTn();
        for(KySu x : list)
        {
            if(x.getNamTn()>max)
                max = x.getNamTn();
        }

        for(KySu x : list)
        {
            if(x.getNamTn()==max)
                x.Xuat();
        }
    }

}
