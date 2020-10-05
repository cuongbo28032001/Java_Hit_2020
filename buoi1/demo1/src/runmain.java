
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class runmain {
    public static void main(String[] args) {//psvm
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Đoàn Cường");//sout
        System.out.print("AAAAAAA");
        System.out.println("BBBBBB");
        System.out.printf("Age: %d\n", 20);
        String str = "Đoàn Quốc Cường";
        System.out.println(str);
        int n=5;
        System.out.println(n);
        if(n>4)
            System.out.println(n + "lớn hơn 4");
        else System.out.println(n + "Nhỏ hơn 4");
        int[] arr = {1, 2, 3, 4, 5};
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        int[] arr1 = new int[10];
        double[] arr2 = new double[15];
        String[] arr3 = new String[3];
        
        
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Nhap a = ");
        a = sc.nextInt();
        System.out.println(a);
        float b = 10.6f;
        int c = (int)b;
        System.out.println("c= "+c);
        final double PI = 3.14; // hằng số không đổi với từ khóa final
        Integer x = 10; //int
        x += 5;
        System.out.println(x);
        System.out.println(x.compareTo(a)); // = trả về 0; nhỏ hơn trả về -1 lớn trả về 1
        System.out.println(x.equals(b)); // trả về true or false
        System.out.println("b = " + (a+b));
        System.out.printf("%4f",Math.PI);//lấy 4 chữ số sau dấu phẩy
        System.out.println("Duyệt bằng forich");
        for(int x : arr)
        {
            System.out.print(x+ " ");
        } 
        String t = "10";
        int a = Integer.parseInt(t);
        System.out.println(a);
        String y = "10.6";
        float b = Float.parseFloat(y);
        System.out.println(b);
        
        int xx = 10;
        String str = String.valueOf(xx);
        System.out.println("str = "+str);
        Show();
        System.out.println("tong = "+sum(3,5));*/
        /*String str = "1h2h3h4";
        int sum=0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                sum += Integer.parseInt(String.valueOf(ch));
            }
        }*/
        int n;
        int sum=0;
        System.out.print("Nhập số phần tử mảng: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập phần tử mảng: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Nhập a[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        for(int i : arr)
        {
            if(Ngto(i))
            {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static boolean Ngto (int a)
    {
        int dem=0;
        for(int i=2; i<=a/2; i++)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
    /*public static void Show() {
        System.out.println("Bạn vừa gọi hàm show");  
    }
    
    public static int sum(int a, int b)
    {
        return a+b;
    }*/
        
}
