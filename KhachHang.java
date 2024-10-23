package clc.thanhle.quanlybanhang;

import java.util.Scanner;

public class KhachHang {
    public static Scanner scanner = new Scanner(System.in);


    private String MaKH;
    private String TenKH;
    private String SDTKH;
    private String DiaChiKH;
    private static int count=1;

    public KhachHang(int MaKH, String TenKH, String SDTKH, String DiaChiKH) {
        this.MaKH = "KH" + String.format("%02d" , count++);
        this.TenKH = TenKH;
        this.SDTKH = SDTKH;
        this.DiaChiKH = DiaChiKH;
        ChuanHoaSDTKH();
        ChuanHoaHoTenKH();
    }

    public void ChuanHoaHoTenKH() {

        while (!this.TenKH.matches("[a-zA-Z\\s]+")) {
            System.out.println("Wrong format! Enter again:");
            String tmp = scanner.nextLine();

            if (tmp.matches("[a-zA-Z\\s]+")) {
                this.TenKH = tmp;
                break;
            }

        }
        String[] arr = this.TenKH.split("\\s+");
        String newTenKH = "";
        for(String x : arr){
            newTenKH += Character.toUpperCase(x.charAt(0));// Chữ hoa đầu tiên
            for(int j = 1; j < x.length(); j++){
                newTenKH += Character.toLowerCase(x.charAt(j));//các chữ còn lại thành chữ thường
            }
            newTenKH += " ";//thêm dấu cách
        }
        this.TenKH = newTenKH.trim();// Cập nhật lại tên và loại bỏ khoảng trắng thừa
    }

    public void ChuanHoaSDTKH() {

        while ( !this.SDTKH.matches("[0-9\\d]+") ) {
            System.out.println("Wrong number format! Enter again:");
            String tmp = scanner.nextLine();

            if ( tmp.matches("[0-9\\d]+") ) {
                this.SDTKH = tmp;
                break;
            }

        }
    }

    public String getMaKH() {
        return MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public String getSDTKH() {
        return SDTKH;
    }

    public String getDiaChiKH() {
        return DiaChiKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public void setSDTKH(String SDTKH) {
        this.SDTKH = SDTKH;
    }

    public void setDiaChiKH(String DiaChiKH) {
        this.DiaChiKH = DiaChiKH;
    }
    
    
    public String toString(){
        return this.MaKH + " " + this.TenKH + " " + this.SDTKH + " " + this.DiaChiKH;
    }
    
}