package bai03;

import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich {
       private String loaiTiente;
       private double tiGia;
	public GiaoDichTienTe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiaoDichTienTe(int maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong,String loaiTiente, double tiGia) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.loaiTiente = loaiTiente;
		this.tiGia = tiGia;
	}
	public String getLoaiTiente() {
		return loaiTiente;
	}
	public void setLoaiTiente(String loaiTiente) {
		this.loaiTiente = loaiTiente;
	}
	public double getTiGia() {
		return tiGia;
	}
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	public double thanhTien() {
		String tien=loaiTiente;
		if (tien ==("usd")|| tien ==("euro"))
		{
			return getSoLuong()*getDonGia()*tiGia;
		}
		else if (tien ==("vnd")){
			return getSoLuong()*getDonGia();	
		}
		return thanhTien();
		
	}
	@Override
	public String toString() {
		return "GiaoDichTienTe [loaiTiente=" + loaiTiente + ", tiGia=" + tiGia + ", getLoaiTiente()=" + getLoaiTiente()
				+ ", getTiGia()=" + getTiGia() + ", thanhTien()=" + thanhTien() + ", getMaGiaoDich()=" + getMaGiaoDich()
				+ ", getNgayGiaoDich()=" + getNgayGiaoDich() + ", getDonGia()=" + getDonGia() + ", getSoLuong()="
				+ getSoLuong() + "]";
	}
	
      
}
