package clc.thanhle.quanlybanhang;
import java.util.Scanner;

public class DonHang {

    private String MaDH;
    private String TenNVTaoDon;
    private String NgayTaoDon;
    private String TenSP;
    private double SoLuongSP;
    private String TongGiaTri;
    private static int count = 1;

    public static Scanner scanner = new Scanner(System.in);

    public DonHang(String MaDH, String TenNVTaoDon, String NgayTaoDon, String TenSP, double SoLuongSP, String TongGiaTri) {
        this.MaDH = String.format("DH%02d", count++);
        this.TenNVTaoDon = TenNVTaoDon;
        this.NgayTaoDon = NgayTaoDon;
        this.TenSP = TenSP;
        this.SoLuongSP = SoLuongSP;
        this.TongGiaTri = TongGiaTri;
        ChuanHoaHoTenNVTaoDon();
        ChuanHoaNgayTaoDon();
    }
    
    public void ChuanHoaHoTenNVTaoDon() {

        while (!this.TenNVTaoDon.matches("[a-zA-Z\\s]+")) {
            System.out.println("Wrong format! Enter again:");
            String tmp = scanner.nextLine();

            if (tmp.matches("[a-zA-Z\\s]+")) {
                this.TenNVTaoDon = tmp;
                break;
            }

        }
        String[] arr = this.TenNVTaoDon.split("\\s+");
        String newTenKH = "";
        for(String x : arr){
            newTenKH += Character.toUpperCase(x.charAt(0));// Chữ hoa đầu tiên
            for(int j = 1; j < x.length(); j++){
                newTenKH += Character.toLowerCase(x.charAt(j));//các chữ còn lại thành chữ thường
            }
            newTenKH += " ";//thêm dấu cách
        }
        this.TenNVTaoDon = newTenKH.trim();// Cập nhật lại tên và loại bỏ khoảng trắng thừa
    }
    
    public void ChuanHoaNgayTaoDon() {//chức năng tương tự Hàm chuẩn hóa ngày sinh
        if (!this.NgayTaoDon.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {
            System.out.println("Ngày tạo đơn hàng không hợp lệ! Vui lòng nhập theo định dạng DD/MM/YYYY.");
            return; // 
        }
    }

    public String getMaDH() {
        return MaDH;
    }

    public void setMaDH(String MaDH) {
        this.MaDH = MaDH;
    }

    public String getTenNVTaoDon() {
        return TenNVTaoDon;
    }

    public void setTenNVTaoDon(String TenNVTaoDon) {
        this.TenNVTaoDon = TenNVTaoDon;
    }

    public String getNgayTaoDon() {
        return NgayTaoDon;
    }

    public void setNgayTaoDon(String NgayTaoDon) {
        this.NgayTaoDon = NgayTaoDon;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public double getSoLuongSP() {
        return SoLuongSP;
    }

    public void setSoLuongSP(double SoLuongSP) {
        this.SoLuongSP = SoLuongSP;
    }

    public String getTongGiaTri() {
        return TongGiaTri;
    }

    public void setTongGiaTri(String TongGiaTri) {
        this.TongGiaTri = TongGiaTri;
    }

    public String toString(){
        return this.MaDH + " " +this.NgayTaoDon+ " " +this.TenNVTaoDon+ " " + this.TenSP + " " + this.SoLuongSP + " " + this.TongGiaTri;
    }
}
