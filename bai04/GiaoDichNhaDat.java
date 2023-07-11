package bai04;

import java.time.LocalDate;

public class GiaoDichNhaDat extends GiaoDich{
    private String loaiDat;
	public GiaoDichNhaDat() {
		super();
	}
	public GiaoDichNhaDat(int maGiaodich, LocalDate ngayGiaoDich, double donGia, String loaiDat, float dienTich) {
		super(maGiaodich, ngayGiaoDich, donGia, dienTich);
		// TODO Auto-generated constructor stub
		this.loaiDat = loaiDat;
	
	}
	public String getLoaiDat() {
		return loaiDat;
	}
	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}
	
    public double thanhTien() {
    	String loai=loaiDat;
    	if (loai == ("B")|| loai == ("C"))
    	{
    		return getDienTich()*getDonGia();
    	}
    	else if (loai==("A"))
    	{
    		return getDonGia()*getDienTich()*1.5;
    	}
    	return thanhTien();
    }
	@Override
	public String toString() {
		return "GiaoDichNhaDat [loaiDat=" + loaiDat + ", getLoaiDat()=" + getLoaiDat() + ", thanhTien()=" + thanhTien()
				+ ", getMaGiaodich()=" + getMaGiaodich() + ", getNgayGiaoDich()=" + getNgayGiaoDich() + ", getDonGia()="
				+ getDonGia() + ", getDienTich()=" + getDienTich() + "]";
	}

    
}
