/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhaptubanphim;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Baitapsao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap ten : ");
		String ten = scanner.nextLine();

		System.out.print("Nhap tuoi : ");
		int tuoi = 0;
		while (true) {
			if (scanner.hasNextInt()) {
				tuoi = scanner.nextInt();
				break;
			} else {
				System.out.print("Vui long nhap mot so nguyen cho tuoi : ");
				scanner.next();
			}
		}

		System.out.print("Nhap gioi tinh : ");
		scanner.nextLine();
		String gioitinh = scanner.nextLine();

		System.out.print("Nhap nganh hoc : ");
		String nganh = scanner.nextLine();

		System.out.print("Nhap  GPA: ");
		double gpa = 0.0;
		while (true) {
			if (scanner.hasNextDouble()) {
				gpa = scanner.nextDouble();
				break;
			} else {
				System.out.print("Vui lòng nhập một số thực cho GPA: ");
				scanner.next();
			}
		}

		System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
		String ngaySinh = scanner.next();
		Date birthDate = null;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			birthDate = formatter.parse(ngaySinh);
		} catch (Exception e) {
			System.out.println("Dinh dang ngay khong hop le .");
		}

		System.out.println("\nThông tin đã nhập:");
		System.out.println("Ten: " + ten);
		System.out.println("Tuoi: " + tuoi);
		System.out.println("Gioi tinh : " + gioitinh);
		System.out.println("Nganh hoc: " + nganh);
		System.out.println("GPA: " + gpa);
		if (birthDate != null) {
			System.out.println("Ngày sinh: " + new SimpleDateFormat("dd/MM/yyyy").format(birthDate));
		}
	}
}
