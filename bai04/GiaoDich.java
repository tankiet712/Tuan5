package bai04;

import java.time.LocalDate;

public class GiaoDich {
   private int maGiaodich;
   private LocalDate ngayGiaoDich;
   private double donGia;
   private float dienTich;
public GiaoDich() {
	super();
	// TODO Auto-generated constructor stub
}
public GiaoDich(int maGiaodich, LocalDate ngayGiaoDich, double donGia, float dienTich) {
	super();
	this.maGiaodich = maGiaodich;
	this.ngayGiaoDich = ngayGiaoDich;
	this.donGia = donGia;
	this.dienTich = dienTich;
}
public int getMaGiaodich() {
	return maGiaodich;
}
public void setMaGiaodich(int maGiaodich) {
	this.maGiaodich = maGiaodich;
}
public LocalDate getNgayGiaoDich() {
	return ngayGiaoDich;
}
public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
	this.ngayGiaoDich = ngayGiaoDich;
}
public double getDonGia() {
	return donGia;
}
public void setDonGia(double donGia) {
	this.donGia = donGia;
}
public float getDienTich() {
	return dienTich;
}
public void setDienTich(float dienTich) {
	this.dienTich = dienTich;
}

}
