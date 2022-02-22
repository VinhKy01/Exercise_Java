
package BaiTap1_C1;

import java.util.Scanner;

public class TinhTongAvaB {

    public static void main(String[] args) {

        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen a: ");
        a = input.nextInt();
        System.out.print("Nhap vao so nguyen b: ");
        b = input.nextInt();
        
        int Tong = a + b;
        int Tich = a * b;
        
        System.out.println("Tong cua "+ a +" + " + b +" = " + Tong);
        System.out.println("Tich cua "+ a +" * " + b +" = " + Tich);
    }
    
}
