
package BaiTap4_C1;

import java.util.Scanner;

public class TinhTongTu1DenN {

    public static void main(String[] args) {

        int a;
        int Tong = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen a: ");
        a = input.nextInt();
        
        for (int i = 0; i <= a; i++) { 
            Tong = Tong + i;
        }
        System.out.println("Tong cac so tu 1 den " + a + " = " + Tong);
        System.out.println("\n");
    }
    
}
