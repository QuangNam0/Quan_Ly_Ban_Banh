package clc.thanhle.quanlybanhang;
import java.util.Scanner;

public class SanPham {
    public static Scanner scanner= new Scanner(System.in);

    public String MaBanh;
    public String TenBanh;
    public String Soluong;
    public String Gia;
    private static int count=1;
    

public SanPham(int i, String MaBanh, String TenBanh, String Soluong, String Gia) {
    this.MaBanh =  String.format("%02d" , count++);//mã bánh tự động tăng
    this.TenBanh = TenBanh;
    this.Soluong = Soluong;
    this.Gia = Gia;

    nhapGiaBanh();
    }

public void nhapGiaBanh() {
    Scanner scanner = new Scanner(System.in);
    while (!this.Gia.matches("[1-9]\\d{0,19}")) {
        System.out.println("Wrong price format! Enter again:");
        String tmp = scanner.nextLine();

        if (tmp.matches("[1-9]\\d{0,19}")) {
            this.Gia = tmp;
            break;
        }
    }
}




    public String getMaBanh() {
        return MaBanh;
    }

    public String getTenBanh() {
        return TenBanh;
    }

    public String getSoluong() {
        return Soluong;
    }

    public String getGia() {
        return Gia;
    }

    public void setMaBanh(String MaBanh) {
        this.MaBanh = MaBanh;
    }

    public void setTenBanh(String TenBanh) {
        this.TenBanh = TenBanh;
    }

    public void setSoluong(String Soluong) {
        this.Soluong = Soluong;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }
    

    public String toString(){
        return this.MaBanh + " " + this.TenBanh + " " + this.Soluong + " " + this.Gia;
    }
}