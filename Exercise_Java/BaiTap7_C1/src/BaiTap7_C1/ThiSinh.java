package BaiTap7_C1;

import java.util.Scanner;

public class ThiSinh {
    private 
            String hoTen, maThiSinh;
            float diemToan, diemLy, diemHoa;
    
    public ThiSinh(){}
    
    public ThiSinh(String hoTen, String maThiSinh, float x, float y, float z){
        this.hoTen = hoTen;
        this.maThiSinh = maThiSinh;
        this.diemToan = x;
        this.diemLy = y;
        this.diemHoa = z;
    }
    
    public String getHoTen(){
        return this.hoTen;
    }
    public String getMaThiSinh(){
        return this.maThiSinh;
    }
    public float getDiemToan(){
        return this.diemToan;
    }
    public float getDiemHoa(){
        return this.diemHoa;
    }
    public float getDiemLy(){
        return this.diemLy;
    }
    public void setDiemToan(float X){
        this.diemToan = X;   
    }
    public void setDiemLy(float X){
        this.diemLy = X;   
    }
    public void setDiemHoa(float X){
        this.diemHoa = X;   
    }
    public void setHoTen(String X){
        this.hoTen = X;   
    }
    public void setMaThiSinh(String X){
        this.maThiSinh = X;   
    }
   
    
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("\t--Nhap thong tin thi sinh--");
        System.out.print("\n\tNhap ho ten: ");
        this.hoTen = s.nextLine();
        System.out.print("\tNhap ma thi sinh: ");
        this.maThiSinh = s.nextLine();
        System.out.print("\tNhap diem Toan: ");
        this.diemToan = s.nextFloat();
        System.out.print("\tNhap diem Ly: ");
        this.diemLy = s.nextFloat();
        System.out.print("\tNhap diem Hoa: ");
        this.diemHoa = s.nextFloat();
    }
    
    public void xuat(){
        System.out.println("\n\tHo ten: " + getHoTen());
        System.out.println("\tMa thi sinh : " + getMaThiSinh());
        System.out.println("\tDiem Toan : "+ this.diemToan);
        System.out.println("\tDiem Ly : "+ this.diemLy);
        System.out.println("\tDiem Hoa : "+ this.diemHoa);
    }
}
