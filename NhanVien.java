package clc.thanhle.quanlybanhang;

import java.util.Scanner;

public class NhanVien {

    public static Scanner scanner = new Scanner(System.in);

    private String TenNV;
    private String GioiTinh;
    private String SDTNV;
    private String NgaySinh;
    private String ChucVu;
    private String Luong;

    public NhanVien(int i, String TenNV, String GioiTinh, String SDTNV, String NgaySinh, String ChucVu, String Luong) {
        this.TenNV = TenNV;
        this. GioiTinh= GioiTinh;
        this.SDTNV = SDTNV;
        this.NgaySinh = NgaySinh;
        this.ChucVu = ChucVu;
        this.Luong = Luong;
        ChuanHoaHoTenNV();
        ChuanHoaNgaySinh();
        ChuanHoaSDTNV();
        ChuanHoaGioiTinh();
    }

    public void ChuanHoaHoTenNV(){

        while ( !this.TenNV.matches("[a-zA-Z\\s]+") ) {
            System.out.println("Wrong format! Enter again:");
            String tmp = scanner.nextLine();

            if ( tmp.matches("[a-zA-Z\\s]+") ) {
                this.TenNV = tmp;
                break;
            }

        }


        String[] arr = this.TenNV.split("\\s+");
        String newTenNV = "";
        for(String x : arr){
            newTenNV += Character.toUpperCase(x.charAt(0));// Chữ hoa đầu tiên
            for(int j = 1; j < x.length(); j++){
                newTenNV += Character.toLowerCase(x.charAt(j));//các chữ còn lại thành chữ thường
            }
            newTenNV += " ";//thêm dấu cách
        }
        this.TenNV = newTenNV.trim();// Cập nhật lại tên và loại bỏ khoảng trắng thừa
    }

    public void ChuanHoaGioiTinh(){

        while ( !this.GioiTinh.matches("[a-zA-Z\\s]+") ) {
            System.out.println("Wrong format! Enter again:");
            String tmp = scanner.nextLine();

            if ( tmp.matches("[a-zA-Z\\s]+") ) {
                this.TenNV = tmp;
                break;
            }

        }


        String[] arr = this.GioiTinh.split("\\s+");
        String newGioiTinh = "";
        for(String x : arr){
            newGioiTinh += Character.toUpperCase(x.charAt(0));// Chữ hoa đầu tiên
            for(int j = 1; j < x.length(); j++){
                newGioiTinh += Character.toLowerCase(x.charAt(j));//các chữ còn lại thành chữ thường
            }
        }
        this.GioiTinh = newGioiTinh.trim();// Cập nhật lại tên và loại bỏ khoảng trắng thừa
    }

    public void ChuanHoaNgaySinh () {
        if (!this.NgaySinh.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {//kiểm tra xem chuỗi NgaySinh có khớp với định dạng không dd/mm/yyyy;
            System.out.println("Ngày sinh không hợp lệ! Vui lòng nhập theo định dạng DD/MM/YYYY.");
            return; // Thoát khỏi nếu định dạng không hợp lệ
        }
    }

    public void ChuanHoaSDTNV() {

        while ( !this.SDTNV.matches("[0-9\\d]+") ) {
            System.out.println("Wrong number format! Enter again:");
            String tmp = scanner.nextLine();

            if ( tmp.matches("[0-9\\d]+") ) {
                this.SDTNV = tmp;
                break;
            }

        }
    }
    public String getTenVN() {
        return TenNV;
    }
    public String getGioiTinh(){
        return GioiTinh;
    }

    public String getSDTNV() {
        return SDTNV;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public String getLuong() {
        return Luong;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }
    public void setGioiTinh(String GioiTinh){
        this.GioiTinh= GioiTinh;
    }

    public void setSDTNV(String SDTNV) {
        this.SDTNV = SDTNV;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public void setLuong(String Luong) {
        this.Luong = Luong;
    }
    
    
    public String toString(){
        return this.TenNV + " " +this.GioiTinh+ " " +this.NgaySinh+ " " + this.SDTNV + " " + this.ChucVu + " " + this.Luong;
    }
}