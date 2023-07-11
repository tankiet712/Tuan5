package bai04;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich{
    private String loaiNha,diaChi;;
	
	public GiaoDichNha() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiaoDichNha(int maGiaodich, LocalDate ngayGiaoDich, double donGia, float dienTich, String loaiNha, String diaChi) {
		super(maGiaodich, ngayGiaoDich, donGia, dienTich);
	
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	public String getLoaiNha() {
		return loaiNha;
	}
	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public double thanhTien() {
		String loai=loaiNha;
		if (loai==("caocap"))
		{
			return getDienTich()*getDonGia();
			
		}
		else if (loai==("thuong")) {
			return getDienTich()*getDonGia()*0.9;
		}
		return thanhTien();
		
	}
	@Override
	public String toString() {
		return "GiaoDichNha [loaiNha=" + loaiNha + ", diaChi=" + diaChi + ", getLoaiNha()=" + getLoaiNha()
				+ ", getDiaChi()=" + getDiaChi() + ", thanhTien()=" + thanhTien() + ", getMaGiaodich()="
				+ getMaGiaodich() + ", getNgayGiaoDich()=" + getNgayGiaoDich() + ", getDonGia()=" + getDonGia()
				+ ", getDienTich()=" + getDienTich() + "]";
	}
	
	
    
}
