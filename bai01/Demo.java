package bai01;
public class Demo {

	public static void main(String[] args) {
		//Danhsachchuyenxenoithanh
		ChuyenXeNoiThanh nt1 = new ChuyenXeNoiThanh ("NT1", "k", "59S1", 30000, 14, 5);
		ChuyenXeNoiThanh nt2 = new ChuyenXeNoiThanh ("NT2", "l", "59L1", 40000, 15, 6);
		//Danhsachchuyenxengoaithanh
		ChuyenXeNgoaiThanh nt3 = new ChuyenXeNgoaiThanh ("NT3", "h", "59L1", 50000, "VungTau", 7);
		ChuyenXeNgoaiThanh nt4 = new ChuyenXeNgoaiThanh ("NT4", "t", "59L1", 60000, "DakLak", 8);
		//tinh
				nt1.TinhTong();
				nt1.Tongdoanhthuxengthanh(500.000000);	
	}

}
