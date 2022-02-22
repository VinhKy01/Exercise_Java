
package BaiTap3_C1;

import java.util.Scanner;

public class Tu1denN {

    public static void main(String[] args) {
        int a;
        Scanner nhapa = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen a: ");
        a = nhapa.nextInt();
        
        System.out.print("Cac so tu 1 den "+a+" la : ");
        for (int i = 0; i < a; i++) { 
            System.out.print(", " + (i+1));
        }
        System.out.println("\n");
    }
    
}
