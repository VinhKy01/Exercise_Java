
package BaiTap6_C1;


public class MainBaiTap6_C1 {

  
    public static void main(String[] args) {
        Diem diemO = new Diem(0,0);
        Diem diemA = new Diem(2, 3);
        Diem nhap = new Diem();
        System.out.println("Nhap toa do");
        nhap.Nhap();
        System.out.print("Toa do diem A");
        nhap.Xuat();
        
        System.out.print("\nToa do diem O");
        diemO.Xuat();
        System.out.print("\nToa do diem A");
        diemA.Xuat();
  
       }
}
