package bai03;

import java.time.LocalDate;

public class GiaoDich {
 private int maGiaoDich;
 private LocalDate ngayGiaoDich;
 private double donGia;
 private int soLuong;
public GiaoDich() {
	super();
	// TODO Auto-generated constructor stub
}
public GiaoDich(int maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong) {
	super();
	this.maGiaoDich = maGiaoDich;
	this.ngayGiaoDich = ngayGiaoDich;
	this.donGia = donGia;
	this.soLuong = soLuong;
}
public int getMaGiaoDich() {
	return maGiaoDich;
}
public void setMaGiaoDich(int maGiaoDich) {
	this.maGiaoDich = maGiaoDich;
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
public int getSoLuong() {
	return soLuong;
}
public void setSoLuong(int soLuong) {
	this.soLuong = soLuong;
}

}
