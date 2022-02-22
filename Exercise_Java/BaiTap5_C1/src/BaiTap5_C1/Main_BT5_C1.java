
package BaiTap5_C1;

import java.util.Scanner;

public class Main_BT5_C1 {
    Scanner Input = new Scanner(System.in);
    void NhapMang (int[] a, int b){
        for (int i = 0; i < b; i++) {
            System.out.print("Nhap vao so nguyen thu "+i+" :");
            a[i] = Input.nextInt();
        }
    }
    void XuatMang (int[] a, int b){
        for (int i = 0; i < b; i++) {
            System.out.println("So nguyen thu "+ (i+1) +" la: " + a[i]);
        }
    }
    int TimSLN (int[] a, int b){
        int max = a[0];
        for (int i = 0; i < b; i++) {
            if(a[i] < a[i+1]){
                max = a[i + 1];
            }
        }
        return max;
    }
    void XapSep (int a[], int b) {
        for (int i = 0; i < b - 1; i++) {
            for (int j = i + 1; j < b; j++) {
                if (a[i] > a[j]) {
                    {
                        int t = a[i];
                        a[i] = a[j];
                        a[j] = t;                     }
                }
            }
        }
    }

    public static void main(String[] args) {
        
        Main_BT5_C1 bt5 = new Main_BT5_C1();
        int a[] = new int[20];
        int b;
        
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu: ");
        b = nhap.nextInt();
        
        bt5.NhapMang(a, b);
        bt5.XuatMang(a, b);
        
        System.out.println("Max = " +bt5.TimSLN(a, b));
        bt5.XapSep(a, b);
        
        System.out.println("----------------------------------");
        System.out.println("Sau khi sap xep");
        bt5.XuatMang(a, b);
    }
    
}
