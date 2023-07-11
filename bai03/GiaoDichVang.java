package bai03;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich {
private String loaiVang;

public GiaoDichVang(String string, int i, LocalDate localDate, int j, int k) {
	super();

}

public GiaoDichVang(int maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong,String loaiVang) {
	super(maGiaoDich, ngayGiaoDich, donGia, soLuong);

	this.loaiVang = loaiVang;
}

public String getLoaiVang() {
	return loaiVang;
}

public void setLoaiVang(String loaiVang) {
	this.loaiVang = loaiVang;
}
public double thanhTien() {
	return getSoLuong()*getDonGia();
}

@Override
public String toString() {
	return "GiaoDichVang [loaiVang=" + loaiVang + ", getLoaiVang()=" + getLoaiVang() + ", thanhTien()=" + thanhTien()
			+ ", getMaGiaoDich()=" + getMaGiaoDich() + ", getNgayGiaoDich()=" + getNgayGiaoDich() + ", getDonGia()="
			+ getDonGia() + ", getSoLuong()=" + getSoLuong() + "]";
}


}








