package BaiTap7_C1;

import java.util.Scanner;

public class QuanLyThiSinh {
    private 
            ThiSinh[] MangThiSinh = new ThiSinh[50];
            int SLTS = 0;
    
    public QuanLyThiSinh() {
    }
    
    public void themThiSinh(){
        if(SLTS >= 50)
            System.out.println("\nVuot qua so luong thi sinh");
        else{
            MangThiSinh[SLTS] = new ThiSinh();
            MangThiSinh[SLTS].nhap();
            SLTS++;
        }
    }
    public void xuatMang(){
        if(SLTS==0)
            System.out.println("\nDanh sach rong");
        else{
            for (int i = 0; i < SLTS; i++) {
                System.out.print("\tThi sinh thu " +(i+1));
                MangThiSinh[i].xuat();          
            }
        }
    }
    
    public void dSTrungTuyen(){
        int count = 0;
        if(SLTS==0)
            System.out.println("\nDanh sach rong");
        else{
            for (int i = 0; i < SLTS; i++) {
                if((MangThiSinh[i].getDiemToan() + MangThiSinh[i].getDiemLy() + MangThiSinh[i].getDiemHoa()) > 14){
                    System.out.println("Thi sinh thu " + count+1);
                    MangThiSinh[i].xuat(); 
                    count++;
                }
            }
            if(count == 0 )
                System.out.println("Khong co thi sinh nao");
        }
    }
    
    
    public void QuanLy(){
        Scanner input = new Scanner(System.in);
        QuanLyThiSinh qlts = new QuanLyThiSinh();
        int luachon = 0;
        do{
            System.out.println("\n");
            System.out.println("\t-------Nhap lua chon--------");
            System.out.println("\t1. Nhap vao mot thi sinh");
            System.out.println("\t2. Xuat danh sach thi sinh");
            System.out.println("\t3. Xuat danh sach trung tuyen");
            System.out.println("\t0. Nhan de thoat chuong trinh");
            System.out.print("\t Nhap lua chon: ");
            luachon = input.nextInt();
            System.out.println("\n");
            
            if(luachon == 1){
                qlts.themThiSinh();
            }
            else if(luachon == 2){
                System.out.println("\n");
                System.out.println("\t--Danh Sach Thi Sinh--");
                qlts.xuatMang();
                System.out.println("\n");
            }
            else if(luachon == 3){
                qlts.dSTrungTuyen();
                System.out.println("\n");
            }
        }while(luachon >= 1 && luachon <=3);
        System.out.println("\tChuong trinh da thoat");
    }
}
    
