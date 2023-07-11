package bai01;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private int soTuyen, soKM;

	public ChuyenXeNoiThanh() {
		super();
	}

	public ChuyenXeNoiThanh(String maSo, String hoTen, String soXe, double doanhThu, int soTuyen,int soKM) {
		super(maSo, hoTen, soXe, doanhThu);
		this.soKM=soKM;
		this.soTuyen =soTuyen;
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public int getSoKM() {
		return soKM;
	}

	public void setSoKM(int soKM) {
		this.soKM = soKM;
	}
	public double Tongdoanhthuxengthanh(double doanhThu) {
		double Sum;
		return Sum = doanhThu + doanhThu;
		

	
}
}