package bai04;
import java.time.LocalDate;
public class Demo {

	public static void main(String[] args) {
		//TAO 3 GIAO DICH CUA MOI GIAO DICH
   GiaoDichNhaDat gdnd1 = new GiaoDichNhaDat(10,LocalDate.of(2010, 12, 7),40000,"A",10);
   System.out.println(gdnd1.toString());
   GiaoDichNhaDat gdnd2 = new GiaoDichNhaDat(10,LocalDate.of(2010, 6, 7),70000,"B",20);
   System.out.println(gdnd2.toString());
   GiaoDichNhaDat gdnd3 = new GiaoDichNhaDat(10,LocalDate.of(2013, 1, 7),60000,"C",10);
   System.out.println(gdnd3.toString());
   
   
   GiaoDichNha gdn1 = new GiaoDichNha(10,LocalDate.of(2013, 9, 7),40000,10,"thuong","longan");
   System.out.println(gdn1.toString());
   GiaoDichNha gdn2 = new GiaoDichNha(20,LocalDate.of(2013, 9, 8),40000,10,"caocap","vungtau");
   System.out.println(gdn2.toString());
      // TINH TRUNG BINH THANH TIEN CUA GIAO DICH NHA DAT
   
   double TBtiennhadat = (gdnd1.getDonGia()+gdnd2.getDonGia()+gdnd3.getDonGia())/2;
		   System.out.println("Trung binh tien nha dat :"+TBtiennhadat);
	
	//Xuat cac gd thang 9/nam2023
		   System.out.println("Xuat giao dich thang 9 :");
     if (gdnd1.getNgayGiaoDich().isAfter(LocalDate.of(2013, 9, 1))  ) {
    	 System.out.println("Giao dich nha dat 1 :"+gdnd1.toString());
     }

     if (gdnd2.getNgayGiaoDich().isAfter(LocalDate.of(2013, 9, 1)) ) {
    	 System.out.println("Giao dich nha dat 2 :"+gdnd2.toString());
     }
 
     if (gdnd3.getNgayGiaoDich().isAfter(LocalDate.of(2013, 9, 1))) {
    	 System.out.println("Giao dich nha dat 3:"+gdnd3.toString());
     }
    
     if (gdn1.getNgayGiaoDich().isAfter(LocalDate.of(2013, 9, 1))) {
    	 System.out.println("Giao dich nha 1 :"+gdn1.toString());
     }
    
     if (gdn2.getNgayGiaoDich().isAfter(LocalDate.of(2013, 9, 1))) {
    	 System.out.println("Giao dich nha 2 :"+gdn2.toString());
     }
    
}
}