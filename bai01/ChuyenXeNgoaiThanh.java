package bai01;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private int soNgay;
	public ChuyenXeNgoaiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChuyenXeNgoaiThanh(String maSo, String hoTen, String soXe, double doanhThu,String noiDen, int soNgay) {
		super(maSo, hoTen, soXe, doanhThu);
		// TODO Auto-generated constructor stub
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgay() {
		return soNgay;
	}
	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}
	
	
	
}
