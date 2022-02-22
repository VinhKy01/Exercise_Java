
package BaiTap2_C1;

import java.util.Scanner;

public class MainBaiTap2_C1 {

    boolean tamGiacThuong(int a, int b, int c){
        return !((c + b < a) || (a + b < c) || (a + c < b));
    }

    boolean tamGiacCan(int a, int b, int c){
        return (a == b) || (c == b) || (c == a);
    }
    
    boolean tamGiacDeu(int a, int b, int c){
        return a == b && b == c;
    }
    
    boolean tamGiacVuong(int a, int b, int c){
        return (a*a + b*b < c*c) || (a*a + c*c < b*b) || (c*c + b*b < a*a);
    }
    boolean tamGiacVuongCan(int a, int b, int c){
        return tamGiacCan(a, b, c)&& tamGiacVuong(a, b, c);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MainBaiTap2_C1 dang = new MainBaiTap2_C1();
        int AB, BC, CD;
        System.out.println("------Kiem tra tam giac-------");
        System.out.print("\nNhap AB: ");
        AB = input.nextInt();
        System.out.print("Nhap BC: ");
        BC = input.nextInt();
        System.out.print("Nhap CA: ");
        CD = input.nextInt();
        
        if(dang.tamGiacThuong(AB, BC, CD)){
            System.out.print("\nDay la tam giac ");
            if(dang.tamGiacCan(AB, BC, CD))
                System.out.print("Can\n");
            else if(dang.tamGiacDeu(AB, BC, CD))
                System.out.print("Deu\n");
            else if(dang.tamGiacVuong(AB, BC, CD))
                System.out.print("Vuong\n");
            else if(dang.tamGiacVuongCan(AB, BC, CD))
                System.out.print("Vuong Can\n");
        }
        else
            System.out.println("\nDay khong phai tam giac");
    }
    }

