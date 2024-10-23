package clc.thanhle.quanlybanhang;
import java.util.Scanner;

public class DoanhThu {
    public static Scanner scanner = new Scanner(System.in);

    private String NgayBaoCao;
    private String NVBaoCao;
    private String SoLuongDon;
    private String TongDoanhThuNgay;

    public DoanhThu(String NgayBaoCao, String NVBaoCao, String SoLuongDon, String TongDoanhThuNgay) {
        this.NgayBaoCao = NgayBaoCao;
        this.NVBaoCao = NVBaoCao;
        this.SoLuongDon = SoLuongDon;
        this.TongDoanhThuNgay = TongDoanhThuNgay;
        ChuanHoaHoTenNVBaoCao();
        ChuanHoaNgayBaoCao();
    }
    

    public void ChuanHoaHoTenNVBaoCao() {

        while (!this.NVBaoCao.matches("[a-zA-Z\\s]+")) {
            System.out.println("Wrong format! Enter again:");
            String tmp = scanner.nextLine();

            if (tmp.matches("[a-zA-Z\\s]+")) {
                this.NVBaoCao = tmp;
                break;
            }

        }
        String[] arr = this.NVBaoCao.split("\\s+");
        String newTenKH = "";
        for(String x : arr){
            newTenKH += Character.toUpperCase(x.charAt(0));// Chữ hoa đầu tiên
            for(int j = 1; j < x.length(); j++){
                newTenKH += Character.toLowerCase(x.charAt(j));//các chữ còn lại thành chữ thường
            }
            newTenKH += " ";//thêm dấu cách
        }
        this.NVBaoCao = newTenKH.trim();// Cập nhật lại tên và loại bỏ khoảng trắng thừa
    }

    public void ChuanHoaNgayBaoCao () {
        if (!this.NgayBaoCao.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {//kiểm tra xem chuỗi NgaySinh có khớp với định dạng không dd/mm/yyyy;
            System.out.println("Invalid date of birth! Please enter in DD/MM/YYYY format");
            return; // Thoát khỏi nếu định dạng không hợp lệ
        }
    }

    public String getNgayBaoCao() {
        return NgayBaoCao;
    }

    public void setNgayBaoCao(String NgayBaoCao) {
        this.NgayBaoCao = NgayBaoCao;
    }

    public String getNVBaoCao() {
        return NVBaoCao;
    }

    public void setNVBaoCao(String NVBaoCao) {
        this.NVBaoCao = NVBaoCao;
    }

    public String getSoLuongDon() {
        return SoLuongDon;
    }

    public void setSoLuongDon(String SoLuongDon) {
        this.SoLuongDon = SoLuongDon;
    }

    public String getTongDoanhThuNgay() {
        return TongDoanhThuNgay;
    }

    public void setTongDoanhThuNgay(String TongDoanhThuNgay) {
        this.TongDoanhThuNgay = TongDoanhThuNgay;
    }
    

    public String toString(){
        return this.NgayBaoCao + " " + this.NVBaoCao + " " + this.SoLuongDon + " " + this.TongDoanhThuNgay;
    }



}