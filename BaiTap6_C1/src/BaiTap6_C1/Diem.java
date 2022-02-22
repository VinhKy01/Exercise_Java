
package BaiTap6_C1;

import java.util.Scanner;


public class Diem {
    private float x = 0, y = 0;
    public Diem(){
        
    }
    public Diem(int X, int Y){
        this.x = X;
        this.y = Y;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public void setX(float X){
        this.x = X;   
    }
    public void setY(float Y){
        this.y = Y;   
    }
    Scanner nhap = new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhap X : ");
        setX(nhap.nextFloat());
        System.out.print("Nhap Y : ");
        setY(nhap.nextFloat());
    }
    public void Xuat(){
        System.out.print("(" + this.x + " :"+ this.y + ")");
    }
}
