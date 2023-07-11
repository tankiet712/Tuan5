package bai03;

import java.time.LocalDate;

public class Demo {
	public static void main(String[] args) {
		
		//Tao 3 giao dich
		//giao dich vang
		GiaoDichVang gdv = new GiaoDichVang(12,LocalDate.of(2022,10,20),400000000000.000,10,"abc");
		System.out.println(gdv.toString());
		//giao dich tien te
		GiaoDichTienTe gdtt1 = new GiaoDichTienTe(12,LocalDate.of(2022,10,20),50.000,20,"usd",20);
		System.out.println(gdtt1.toString());
		GiaoDichTienTe gdtt2 = new GiaoDichTienTe(13,LocalDate.of(2023,10,20),60.000,30,"vnd",20);
		System.out.println(gdtt2.toString());
		//Tinh tong so luon tung loai
		double tongsogdtungloaivang=gdv.getSoLuong();
		System.out.println("Tổng số lượng giao dịch vàng: " + tongsogdtungloaivang);
		double tongsogdtungloaitiente=gdtt1.getSoLuong()+gdtt2.getSoLuong();
		System.out.println("Tổng số lượng giao dịch vàng: " + tongsogdtungloaitiente);
		//Tinh trung binh tien giao dich cua tien te
		double tongsotiencuagiaodichtiente =(gdtt1.thanhTien()+gdtt2.thanhTien())/2;
		System.out.println("Tong so tien cua giao dich tien te :" +tongsotiencuagiaodichtiente );
		//Xuat ra cac giao dich hon 1 ty
		System.out.println("Các giao dịch có đơn giá > 1 tỷ:");
		if (gdv.getDonGia()>1000000000)
		{
			System.out.println(gdv);
		}
		else
		{
			System.out.println("Khong co giao dich nao hon 1 ty");
	}
	   if (gdtt1.getDonGia()>1000000000) {
		   
				System.out.println(gdtt1);
			}
			else
			{
				System.out.println("Khong co giao dich nao hon 1 ty");
		}
	   if (gdtt2.getDonGia()>1000000000) {
		   
			System.out.println(gdtt2);
		}
		else
		{
			System.out.println("Khong co giao dich nao hon 1 ty");
	}
	   
	   }
}
