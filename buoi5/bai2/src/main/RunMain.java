package main;

import sophuc.SoPhuc;

public class RunMain {
    public static void main(String[] args) {
        SoPhuc x = new SoPhuc(5.2, 112.3);
        SoPhuc y = new SoPhuc(1.8, 3.4);
        SoPhuc temp = new SoPhuc();
        temp.Tong(x, y);
        temp.Hieu(x, y);
    }
}
