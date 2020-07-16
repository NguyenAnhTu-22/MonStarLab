package Tuan1.Test1;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soDien = sc.nextInt();
		if (soDien <= 25) {
			System.out.println("So Tien:" + (soDien * 1000));
		} else if (soDien <= 75) {
			System.out.println("So Tien:" + (25 * 1000 + (soDien - 25) * 1250));
		} else if (soDien <= 150) {
			System.out.println("So Tien:" + (25 * 1000 + 50 * 1250 + (soDien - 75) * 1800));
		} else if (soDien > 150) {
			System.out.println("SoTien:" + (25 * 1000 + 50 * 1250 + 75 * 1250 + (soDien) * 2500));
		}
	}

}
