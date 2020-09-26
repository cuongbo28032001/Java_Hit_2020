import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m, n;
        Scanner gt = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        m = gt.nextInt();
        System.out.print("Nhap chiều rộng: ");
        n = gt.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                if(i==1||j==1||i==n||j==m)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    
}
